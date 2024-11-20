// import java.util.Scanner;

// class Class4{
//     public static void main(String args[]){
//         Scanner sc = new  Scanner(System.in);
//         System.out.print("Enter your Marks Here");
//         int marks = sc.nextInt();
//         System.out.print(marks);
//         if (marks>=0 && marks<=100){
//             if (marks>=90){

//             }
//             else if (marks>=80){

//             }
//             else if (marks>=70){

//             }
//             else if(marks>=60){

//             }
//             else {

//             }
//         }
//         else {
//             System.out.print("Invalid Input");
//         }
//         // System.out.println("Code");
//         // if(false){
//         //     System.out.println("IF Block 1 is running");
//         // }
//         // else if(false){
//         //     System.out.print("Else If block 2 is running");
//         // }
//         // else if(false){
//         //     System.out.print("Else If block 3 is running");
//         // }
//         // else if(false){
//         //     System.out.print("Else If block 4 is running");
//         // }
//         // else{
//         //     System.out.print("Else is Running");
//         // }
//     }
// }

import javax.swing.*;

class Class4 {
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

        JButton b1 = new JButton("Submit");
        b1.setBounds(100,100,100,50);
        frame.add(b1);
        
        b1.addActionListener(event -> {
            JOptionPane.showMessageDialog(new JFrame(), "passLabel");
        });


        frame.setVisible(true);

    }
}