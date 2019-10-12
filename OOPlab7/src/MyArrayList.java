import java.util.*;

public class MyArrayList <Type> {
    private int size = 0;
    private  int capacity = 0;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[0];
    }

    public MyArrayList(int capacity)
    {
        this.capacity = capacity;
        elements = new Object[this.capacity];
    }

    public MyArrayList(Collection<? extends Type> col)
    {
        elements = new Object[col.size()];
        System.arraycopy(col, 0, elements, 0, col.size());
    }

    private void resize(int capacity) {
        Object[] newElements = new Object[capacity];
        int copyLength = 0;
        if (capacity >= this.capacity) {
           copyLength = this.capacity;
        } else {
            copyLength = capacity;
            size = capacity;
        }
        this.capacity = capacity;
        System.arraycopy(elements, 0, newElements, 0, copyLength);
        elements = newElements;
    }

    public void add(int index, Type obj){
        if(contains(index)) {
            if (this.size == this.capacity) {
                resize(this.capacity * 2);
            }
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = obj;
        }else if(index >= size){
            elements[size] = obj;
        }
        size++;
    }

    public boolean addAll(int index, Collection<?extends Type> col)
    {
        if(contains(index)) {
            int idx = index;
            for (var element : col) {
                add(idx++, element);
            }
            return  true;
        }
        return false;
    }

    public  Type get(int index){
        if(contains(index))
        {
            return (Type)elements[index];
        }
        return null;
    }

    public int indexOf(Type obj){
        for(int i = 0; i < size; i++)
        {
            if(elements[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Type obj){
        int idx = -1;
        for(int i = 0; i < size; i++)
        {
            if(elements[i] == obj) {
                idx = i;
            }
        }
        return idx;
    }

    public  Type remove(int index){
        Type res = null;
        if(contains(index)) {
            res = (Type)elements[index];
            for(int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
        return  res;
    }

    public Type set(int index, Type obj){
        if(contains(index))
        {
           return (Type)(elements[index] = obj);
        }
        return null;
    }

    public void sort(Comparator<? super Type> comp){
        QuickSort(0, size - 1, comp);
    }

    public List<Type> subList(int start, int end){
        if(contains(start) && contains(end) && end >= start) {
            List<Type> res = new ArrayList<Type>();
            System.arraycopy(elements, start, res, 0, end - start);
            return res;
        }
        return null;
    }

    private boolean contains(int index){
        if(index >= 0 && index < size) {
            return true;
        }else{
            return false;
        }
    }

    private void QuickSort(int start, int end, Comparator<? super Type> comp) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && comp.compare((Type) elements[i], (Type) elements[cur]) <= 0) {
                i++;
            }
            while (j > cur && comp.compare((Type) elements[i], (Type) elements[cur]) <= 0) {
                j--;
            }
            if (i < j) {
                Type temp = (Type)elements[i];
                elements[i] = elements[j];
                elements[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        QuickSort(start, cur, comp);
        QuickSort(cur+1, end, comp);
    }

}
