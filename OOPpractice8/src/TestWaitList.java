
public class TestWaitList {
    public static void main(String[] args) {
        MyUnfairWaitList<Integer> uwl = new MyUnfairWaitList<Integer>();
        MyBoundedWaitList<Integer> bwl = new MyBoundedWaitList<Integer>(5);
        for(Integer i = 0; i < 5; i++)
        {
            bwl.add(i);
        }
        //int kek = 0;
        //uwl.moveToBack(kek);
    }
}
