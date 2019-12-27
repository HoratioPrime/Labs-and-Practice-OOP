import java.util.Comparator;

public class Test
{
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<Integer>(10);
        Integer j = 0;
        for(Integer i = 9; i >= 0; i--)
        {
            arrayList.add(j, i);
            j++;
        }
        arrayList.sort(Comparator.naturalOrder());
        System.out.print(arrayList);
    }
}
