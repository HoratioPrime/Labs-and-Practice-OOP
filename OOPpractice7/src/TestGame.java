import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player first = null;
        Player second = null;
        System.out.println("Введите 5 карт первого игрока:");
        first = init(in);
        System.out.println("Введите 5 карт второго игрока:");
        second = init(in);
        gameLoop(first, second);
    }
    public static void gameLoop(Player first, Player second)
    {
        int time = 0;
        while(first.cards.size() != 0 && second.cards.size() != 0 && time != 106){
            Card cFirst = first.cards.element();
            Card cSecond = second.cards.element();
            first.cards.remove();
            second.cards.remove();
            if((cFirst.getValue() > cSecond.getValue() ||
                    cFirst.getValue() == 0 && cSecond.getValue() == 9) &&
                    !(cFirst.getValue() == 9 && cSecond.getValue() == 0)){
                first.cards.add(cFirst);
                first.cards.add(cSecond);
            }else{
                second.cards.add(cSecond);
                second.cards.add(cFirst);
            }
            time++;
        }
        if(first.cards.size() == 0){
            System.out.println("second " + time);
        }else if(second.cards.size() == 0){
            System.out.println("first " + time);
        }else {
            System.out.println("botva");
        }
    }

    public  static Player init(Scanner in){
        Queue<Card> cards = new ArrayDeque<Card>();
        for(int i = 0; i < 5; i++){
            cards.add(new Card(in.nextInt()));
        }
       return new Player(cards);
    }

}
