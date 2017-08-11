import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * Created by Lenovo on 11.08.2017.
 */
public class MyCollections {
    public static void main(String[] args) {
        Map<String, Person> courseList = new HashMap<>();

        courseList.put("oskix", new Person("Oskar", "Polak", 22, 'M'));
        courseList.put("jano320", new Person("Jan", "Polak", 24, 'M'));
        courseList.put("doris", new Person("Dorka", "Polak", 55, 'K'));
        courseList.put("kubson", new Person("Kuba", "Polak", 1424, 'M'));


        System.out.println(courseList.get("kubson"));

        for(Map.Entry<String, Person> value: courseList.entrySet()){
            System.out.println(value.getKey());
            System.out.println(value.getValue());
        }

        for(Person p : courseList.values()){
            System.out.println(p);
        }

        for(String key : courseList.keySet()){
            System.out.println(key);
        }










    }
}
