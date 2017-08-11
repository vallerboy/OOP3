import sun.awt.im.InputMethodJFrame;

/**
 * Created by Lenovo on 10.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        Monster monster1 = new Monster(10, 5);

        Methods myMethods = new Methods();
        System.out.println( myMethods.add(5, 5) );
        System.out.println( myMethods.rest(123) );

        int c = myMethods.rest(123);
        System.out.println(c);

    }
}
