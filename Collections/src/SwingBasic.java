import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingBasic extends JFrame {
	JLabel label1,label2;

	public void start() {
		label1 = new JLabel();
		label1.setText("	Find :");
		JTextField txt = new JTextField(20);
		
		label2 = new JLabel();
		label2.setText("	Replace :");
		JTextField ps = new JTextField(20);
		JButton but = new JButton();
		but.setBounds(50,200,50,50); 
		but.setText("Submit");
		add(label1);
		add(txt);
		add(label2);
		add(ps);
		add(but);
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setText("Button clicked");
			}
		});
		setLayout(new FlowLayout());
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new SwingBasic().start();
	}
}
