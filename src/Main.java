import sun.awt.im.InputMethodJFrame;

import java.util.*;

/**
 * Created by Lenovo on 10.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        Monster monster1 = new Monster(10, 5, "Barbarzynca");
        Monster monster2 = new Monster(10, 5, "Dziki pies");



        System.out.println(monster1.toString());
        System.out.println(monster2);


        if(monster1.equals(monster2)){
            System.out.println("Są takie same!");
        }else{
            System.out.println("NIE SĄ!");
        }

        Person dorota = new Person("Dorota", "Kowalska", 25, 'K');
        Person janek = new Person("Andrzej", "Kowalska", 55, 'M');


        Methods methods = new Methods();
        System.out.println(methods.nwd(15, 3));


        List<Person> personList = new ArrayList<>();
        personList.add(janek);

        personList.add(dorota);
        personList.add(new Person("Kuba", "Sordyl", 25, 'M'));

        Collections.sort(personList, new AgeComparator());

        Set<Monster> set = new TreeSet<>();

        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public static class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            if(o1.getAge() > o2.getAge()){
                return -1;
            }else{
                return 1;
            }
        }
    }
}
