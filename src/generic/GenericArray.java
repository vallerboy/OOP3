package generic;

/**
 * Created by Lenovo on 16.08.2017.
 */
public class GenericArray<T> {
    private T[] array;

    public GenericArray( T ... myarray){
        array = myarray;
    }

    public T getFirst(){
        return array[0];
    }

    public T getLast() {
        return array[array.length - 1];
    }

    public int getLength(){
        return array.length;
    }


}
