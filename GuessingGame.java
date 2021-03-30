import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GuessingGame implements ActionListener {
  JTextField userGuess;

  JButton guess;
  JButton again;

  JLabel enter;
  JLabel highLow;
  JLabel last;

  int random;
  Random r;

  GuessingGame(){
  Random r = new Random();
  int random = r.nextInt(100)+1;
  JFrame frame = new JFrame ("Guessing Game");
  frame.setLayout(new FlowLayout());
  frame.setSize(240,120);

  userGuess = new JTextField(10);
  userGuess.setActionCommand("myTF");

  JButton guess = new JButton("Guess");
  JButton again = new JButton("Play Again");


  guess.addActionListener(this);
  guess.addActionListener(this);
  guess.addActionListener(this);

  enter = new JLabel("Enter your guess");
  highLow = new JLabel("");
  last = new JLabel("");

  frame.add(enter);
  frame.add(userGuess);
  frame.add(guess);
  frame.add(highLow);
  frame.add(last);
  frame.add(again);

  frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent ae){
    if (ae.getActionCommand().equals ("Guess")){
    int input = Integer.parseInt(userGuess.getText());
      
  
    if (input > random){
      highLow.setText("Too High!");
      highLow.setText("Your last guess was " + input);
    }
    else if (input < random){
      highLow.setText("Too low!");
      highLow.setText("Your last guess was " + input);

    }
    else {
      highLow.setText("You got it!");
      highLow.setText("Your last guess was " + input);
    }}
  
  else if (ae.getActionCommand().equals("Play Again")){
      Random r = new Random();
      int random = r.nextInt(100)+1;
      enter.setText("Enter your guess");
      highLow.setText("");
      last.setText("");
      userGuess.setText("");

  }
  else{
    highLow.setText("You pressed Enter. Please press the Guess Button");
  }
  }
}
