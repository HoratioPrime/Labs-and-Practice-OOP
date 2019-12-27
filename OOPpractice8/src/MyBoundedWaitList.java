public class MyBoundedWaitList<E> extends WaitList {
    public MyBoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        if(content.size() < capacity) {
            super.add(element);
        }else{
            System.out.println("The list is overflow");
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }

    private int capacity;
}
