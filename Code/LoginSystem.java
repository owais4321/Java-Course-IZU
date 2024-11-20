import javax.swing.*;

public class LoginSystem{
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login System");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Add Username Label and Text Field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        frame.add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(100, 20, 160, 25);
        frame.add(userField);

        // Add Password Label and Password Field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 80, 25);
        frame.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(100, 60, 160, 25);
        frame.add(passField);

        // Add Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(50, 100, 80, 25);
        frame.add(loginButton);


        // Add Action Listeners
        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = String.valueOf(passField.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(frame, "Login Successful!");
            } else if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Fields cannot be empty!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid Username or Password!");
            }
        });

        frame.setVisible(true);
    }
}