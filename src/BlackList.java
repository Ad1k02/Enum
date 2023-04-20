import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public enum BlackList {
    TERRORIST(new ArrayList<String>(Arrays.asList("Маке Муратов","Саке Муратов"))),
    EXTREMIST(new ArrayList<String>(Arrays.asList("Таке Айбеков", "Жаке Айбеков"))),
    OTMDENEG(new ArrayList<String>(Arrays.asList("Жусупов Адилет", "Аскарбеков Бакыт","Таштанбеков Тилек")));
    private List<String> list;
    BlackList(List<String> list){
        this.list=list;
    }
    public List<String> getlist(){
        return list;
    }
}