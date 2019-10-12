import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TestGame extends JFrame {
    JLabel result = new JLabel("0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JButton bACMilan = new JButton("AC Milan");
    JButton bRealMadrid = new JButton("Real Madrid");
    JTextField fInput = new JTextField();
    JTextField sInput = new JTextField();

    public static void main(String[] args)
    {
        TestGame game = new TestGame();
        game.setVisible(true);
        game.start();
    }
    public TestGame()
    {
        super("Drunkard");
        initGUI();

    }
    public void start()
    {
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
    public  static Player init(Scanner in)
    {
        Queue<Card> cards = new ArrayDeque<Card>();
        for(int i = 0; i < 5; i++){
            cards.add(new Card(in.nextInt()));
        }
        return new Player(cards);
    }
    public void initGUI()
    {
        setSize(600,400);
        setLocation(500,200);
        setLayout(null);

        result.setSize(40, 20);
        result.setLocation(130, 10);

        lastScorer.setSize(150, 20);
        lastScorer.setLocation(130,60);


        bACMilan.setSize(100, 20);
        bACMilan.setLocation(160, 30);

        bRealMadrid.setSize(120, 20);
        bRealMadrid.setLocation(20, 30);

        fInput.setSize(100,30);
        fInput.setLocation(50, 200);

        sInput.setSize(100, 30);
        sInput.setLocation(350, 200);

        add(result);
        add(lastScorer);
        add(winner);
        add(bACMilan);
        add(bRealMadrid);
        add(fInput);
        add(sInput);
    }

}
