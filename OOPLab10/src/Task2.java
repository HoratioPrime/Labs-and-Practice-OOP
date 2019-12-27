public class Task2 <E> {
    private Object[] elements;
    private int size;
    Task2(int capacity){
        elements = new Object[capacity];
        this.size = 0;
    }
    public void add(E e) {
        if (size < elements.length) {
            elements[size] = e;
        } else {
            System.out.println("Array overflow");
        }
        ++size;
    }
    public E getElemntByIdx(int idx)
    {
        if(idx <= size && idx >= 0){
            return (E)elements[idx];
        }
        System.out.println("There is no element with such an index in the array");
        return null;
    }

}
