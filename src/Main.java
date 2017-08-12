import sun.awt.im.InputMethodJFrame;

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
        Person janek = new Person("Jan", "Kowalski", 55, 'M');


        Methods methods = new Methods();
        System.out.println(methods.nwd(15, 3));
    }
}
