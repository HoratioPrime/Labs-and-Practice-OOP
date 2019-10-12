import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Riddler extends JFrame {
    private int guesses = 3;

    public Riddler() {
        super("Riddler");
        int mysteryNumber = (int) (Math.random() * 20);

        JButton button = new JButton();

        Font font = new Font("Roboto", Font.ITALIC, 12);

        JTextField answer = new JTextField(2);

        JLabel label = new JLabel("Try to guess a number(from 0 to 20)\nYou have " + guesses + " guesses");

        setLayout(null);
        setSize(400, 200);
        setLocation(600, 300);

        button.setSize(80, 20);
        button.setLocation(150, 50);
        button.setBackground(Color.CYAN);
        button.setText("guess");
        button.setFont(font);
        button.addActionListener((ActionEvent e) -> {
            int guess = Integer.parseInt(answer.getText());
            if (guess < 0 || guess > 20) {
                label.setText("Wrong number.. [0,20] - remember?");
            } else {
                guesses--;
                if (guess == mysteryNumber) {
                    label.setText("You won!!!");
                } else if (guesses == 0) {
                    label.setText("Congratulations, you loose!");
                } else if (guess < mysteryNumber) {
                    label.setText("Emm... My number is greater\nYou have " + guesses + " guesses");
                } else {
                    label.setText("Emm... My number is less\nYou have " + guesses + " guesses");
                }
            }
        });

        answer.setSize(30, 20);
        answer.setLocation(100, 50);
        answer.setFont(font);

        label.setLocation(70, 10);
        label.setSize(300, 40);
        label.setFont(font);

        add(button);
        add(answer);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        Riddler riddler = new Riddler();
    }
}
