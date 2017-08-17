package generic;

/**
 * Created by Lenovo on 16.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        GenericArray<Integer> myGenericArray = new GenericArray<>(1,2,4,24,14,124,124,5,21,4214,21,4123,1,13521,512,412,124);
        System.out.println(myGenericArray.getLength());

        Pair<String, Integer> myPair = new Pair<>("Jan", 3);
        String name = myPair.getFirst();
        int m = myPair.getLast();

       myPair.setFirst(name + " Kowalski");
       myPair.setLast(m + 1);

        System.out.println(myPair.getFirst());

        System.out.println(test("Lubie akademie kodu "));
    }


    public static <T extends CharSequence> T test(T arg){
        return (T) (arg + " jestem z metody!");
    }
}
