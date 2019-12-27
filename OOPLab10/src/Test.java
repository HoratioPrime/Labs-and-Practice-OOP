import java.util.ArrayList;

public class Test {

    public static <E> void ArrayToArrayList(E[] a, ArrayList<E> lst) {
        for (E e : a) lst.add(e);
    }

    public static void main(String[] args) {

    }
}
