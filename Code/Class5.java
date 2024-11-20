import javax.swing.*;

class Class5{
    public static void main(String[] args) {
        //Creating Container
        JFrame f1 = new JFrame("New Frame");
        f1.setSize(200,200);
        f1.setLayout(null);
        JTextField t1 = new JTextField();
        JButton b1 = new JButton("Show");
        t1.setBounds(50,50,100,20);
        b1.setBounds(50,110,100,30);
        f1.add(b1);
        f1.add(t1);
        b1.addActionListener(event->{
           String valuet1 = t1.getText();
           System.out.println(Integer.parseInt(valuet1)*Integer.parseInt(valuet1)); 
        });
        f1.setVisible(true);






        // f1.setSize(300,500);
        // f1.setLayout(null);
        // //Adding things to it
        // JLabel uname = new JLabel("Username");
        // JLabel pword = new JLabel("Password");
        // JTextField tfuname = new JTextField();
        // JTextField tfpword = new JTextField();
        // JButton login = new JButton("Login");    
        // //Set positions
        // uname.setBounds(20,20,100,25); 
        // tfuname.setBounds(120,20,100,25);  
        // //add them
        // f1.add(uname);
        // f1.add(tfuname);
        
        // //Set Visibility
        // f1.setVisible(true);


    }
}