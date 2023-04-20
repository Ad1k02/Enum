/*
    1.Создать Enum BlackList 3enum (1.Terrorist 2.Extremist 3.Отмывальщики денег)
    у Enum есть поля List - List<String> который содержить в себе строки "Name Lastname"
    2. Создаем Scanner который принимает одну строку Имя и Фамилия через пробел
    3.Сравнит ФИО со всеми списками
    4.Если совпадение в террористах и экстремистах выводим, что пользователь заблокирован
    если в отмывальщиках, то добавление в список под наблюдение
    и распечатываем список под наблюдением на консоль
    */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Имя и Фамилия: ");
        String name = scan.nextLine();
        boolean Terrorist = false;
        boolean Extremist = false;
        boolean OTMdeneg = false;
        for (BlackList blackList : BlackList.values()) {
            for (String str : blackList.getlist()) {
                if (name.equalsIgnoreCase(str)) {
                    switch (blackList) {
                        case TERRORIST:
                            Terrorist = true;
                            break;
                        case EXTREMIST:
                            Extremist = true;
                            break;
                        case OTMDENEG:
                            OTMdeneg = true;
                            break;
                    }
                }
            }
        }
        if (Terrorist || Extremist) {
            System.out.println("Пользователь заблокирован!");
        }
        else if (OTMdeneg) {
            System.out.println("Добавлен в список под наблюдение!");
            System.out.println("Наш список:");
            for (String str : BlackList.OTMDENEG.getlist()) {
                System.out.println(str);
            }
        }
        else {
            System.out.println("У нас такого пользователя нет в списке!");
        }
    }
}

