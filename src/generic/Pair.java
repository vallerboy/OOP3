package generic;

/**
 * Created by Lenovo on 16.08.2017.
 */
public class Pair<T, D> {
    private T first;
    private D last;

    public Pair(T first, D last){
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public D getLast() {
        return last;
    }

    public void setLast(D last) {
        this.last = last;
    }
}
