import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login implements ActionListener {
    private  static JLabel label;
    private  static JTextField userText;
    private  static JPasswordField passText;
    private  static JButton loginButton;
    private  static JLabel succes;
    private  static JLabel paswordJLabel,forgot;
    private  static JFrame frame;
    private static JRadioButton showRadio;
   // private static JLabel show;



    public static void main(String[] args) {

    JPanel panel = new JPanel();
    frame = new JFrame();
    frame.setSize(400, 250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(panel);

    panel.setLayout(null);

    label = new JLabel("Username");
    label.setBounds(30, 20, 80, 25);
    panel.add(label);

    userText = new JTextField(20);
    userText.setBounds(120, 20, 165, 25);
    panel.add(userText);

    paswordJLabel= new JLabel("Password");
    paswordJLabel.setBounds(30, 50, 80, 25);
    panel.add(paswordJLabel);

    forgot= new JLabel("Forgot password?");
    forgot.setBounds(30, 175, 150, 12);
    panel.add(forgot);

    showRadio = new JRadioButton("Display Password");
    showRadio.setBounds(30, 83, 130, 25);
    
    panel.add(showRadio);
    
    passText = new JPasswordField(20);
    passText.setBounds(120, 50, 165, 25);
    panel.add(passText);
     
    loginButton = new JButton("Login");
    loginButton.setBounds(30, 110, 255, 35);
    panel.add(loginButton);
    loginButton.setBackground(Color.BLUE);
    
    loginButton.addActionListener(new Login());

    succes = new JLabel("");
    succes.setBounds(30, 150, 300, 25);
    panel.add(succes);
        frame.setVisible(true); 
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
            succes.setText("Invalid username or password!");
        }

    }
    
}