package Test.file;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main extends JFrame {
  public Main() throws HeadlessException {
    setSize(1000, 1000);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout(FlowLayout.LEFT));

    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField usernameField = new JTextField(20);
    JPasswordField passwordField = new JPasswordField(20);

    usernameLabel.setDisplayedMnemonic(KeyEvent.VK_U);
    usernameLabel.setLabelFor(usernameField);
    passwordLabel.setDisplayedMnemonic(KeyEvent.VK_P);
    passwordLabel.setLabelFor(passwordField);

    getContentPane().add(usernameLabel);
    getContentPane().add(usernameField);
    getContentPane().add(passwordLabel);
    getContentPane().add(passwordField);
  }

  public static void main(String[] args) {
    new Main().setVisible(true);
  }
}
 
