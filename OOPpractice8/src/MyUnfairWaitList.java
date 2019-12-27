import java.util.ArrayList;

public class MyUnfairWaitList<E> extends WaitList {
    public MyUnfairWaitList() {
    }

    public void remove(E element) {
        ArrayList<E> tmp = new ArrayList<E>();
        if(content.peek() == element){
            tmp.add((E)content.remove());
            content.remove(element);
            while(!content.isEmpty()){
                tmp.add((E)content.remove());
            }
            content.addAll(tmp);
        }else{
            content.remove(element);
        }
    }

    public void moveToBack(E element){
        try
        {
            content.add(content.remove(element));
        } catch (Exception exp)
        {
            System.out.println("Something went wrong in moveToBack");
        }
    }
}
