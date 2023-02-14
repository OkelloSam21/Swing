import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {
    private  static JLabel label;
    private  static JTextField userText;
    private  static JPasswordField passText;
    private  static JButton loginButton;
    private  static JLabel succes;
    private  static JLabel paswordJLabel;
    private  static JFrame frame;



    public static void main(String[] args) {

    JPanel panel = new JPanel();
    frame = new JFrame();
    frame.setSize(400, 250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel);

    panel.setLayout(null);

    label = new JLabel("Username");
    label.setBounds(10, 20, 80, 25);
    panel.add(label);

     userText = new JTextField(20);
    userText.setBounds(100, 20, 165, 25);
    panel.add(userText);

    paswordJLabel= new JLabel("Password");
    paswordJLabel.setBounds(10, 50, 80, 25);
    panel.add(paswordJLabel);
    
    passText = new JPasswordField(20);
    passText.setBounds(100, 50, 165, 25);
    panel.add(passText);
     
    loginButton = new JButton("Login");
    loginButton.setBounds(10, 80, 100, 25);
    panel.add(loginButton);
    
    loginButton.addActionListener(new Login());

    succes = new JLabel("");
    succes.setBounds(10, 110, 300, 25);
    panel.add(succes);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = new String(passText.getPassword());
        System.out.println(user + ":" + password);

        if (user.equals("admin") && password.equals("admin")) {
            succes.setText("Welcome Admin");
            //  frame.setVisible(false);
        }
        else {
            succes.setText("Wrong Password");
        }

    }
    
}