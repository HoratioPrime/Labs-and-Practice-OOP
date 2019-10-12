import java.awt.event.*;
import javax.swing.*;

public class TextAreaExample extends JFrame{
    private int acMscore = 0;
    private int rMscore = 0;
    JLabel result = new JLabel("0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JButton bACMilan = new JButton("AC Milan");
    JButton bRealMadrid = new JButton("Real Madrid");

    private int time = 5;

    public TextAreaExample()
    {
        super("Milan_VS_Madrid");
        setSize(300,300);
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

        add(result);
        add(lastScorer);
        add(winner);
        add(bACMilan);
        add(bRealMadrid);
        bACMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               buttonAction(bACMilan);
            }
        });

        bRealMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonAction(bRealMadrid);
            }
        });
        setVisible(true);
    }

    private void buttonAction(JButton b)
    {

        lastScorer.setText("Last scorer: " + b.getText());
        if(b.getText().equals(bACMilan.getText())) {
            //addPoint(acMscore);
            acMscore++;
            scores();
        }else
        {
            //addPoint(rMscore);
            rMscore++;
            scores();
        }
        time --;
        if(time == 0)
        {
            results();
        }

    }

    private void results()
    {
        bACMilan.hide();
        bRealMadrid.hide();
        winner.setSize(150, 40);
        winner.setLocation(100, 130);
        if(acMscore > rMscore)
        {
            winner.setText("Winner - " + bACMilan.getText());
        }else if (acMscore < rMscore)
        {
            winner.setText("Winner - " + bRealMadrid.getText());
        }else {
            winner.setText("Equal");
        }
    }

   private void addPoint( Integer teamScore )
   {
       teamScore++;
       scores();
   }

    private void scores()
    {
        result.setText(acMscore + " X " + rMscore);
    }

    public static void main(String[]args)
    {
        new TextAreaExample().setVisible(true);
    }
}

