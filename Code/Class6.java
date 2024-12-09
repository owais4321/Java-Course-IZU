
class Class6{
    public static void main(String[] args) {

        String a = "Hello";
        String b = "hello";
        if(a.equalsIgnoreCase(b)){
            System.out.println("Same");
        }    
        else{
            System.err.println("Different");
        }

        // String num = "10";
        // System.out.println(num);
        // double number = Double.parseDouble(num);
        // System.out.println(number);
        //Creating Container
        // JFrame f1 = new JFrame("Password Length Check");
        // f1.setSize(200,200);
        // f1.setLayout(null);
        // JTextField t1 = new JTextField();
        // JButton b1 = new JButton("CHK PSW");
        // t1.setBounds(50,50,100,20);
        // b1.setBounds(50,110,100,30);
        // f1.add(b1);
        // f1.add(t1);
        // b1.addActionListener(event->{
        // String pass = t1.getText();
        // if(pass.length()>=8){
        //     // System.out.println("Password Accepted");
        //     JOptionPane.showMessageDialog(new JFrame(), "Password Accepted");
        // }
        // else{
        //     JOptionPane.showMessageDialog(new JFrame(), "Password Rejected");
        // }
        // });
        // f1.setVisible(true);
    }
}