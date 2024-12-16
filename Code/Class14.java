// import java.io.File;
// import java.io.IOException;


// public class Class14{
//     public static void main(String[] args) {
        
//         File file = new File("example.html");
        
//         try {
//             if (file.createNewFile()) {
//                 System.out.println("File created: " + file.getName());
//             } else {
//                 System.out.println("File already exists.");
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred.");
//         }
//     }
// }

// import java.io.FileWriter;
// import java.io.IOException;


// public class Class14{
//     public static void main(String[] args) {
//         try {
//             FileWriter writer = new FileWriter("example.txt",true);
//             // writer.write("I am not in danger!\nI am the danger");
//             for(int i=11;i<=20;i++){
//                 writer.write(i+"\n");
//             }
//             writer.close();
//             System.out.println("Successfully wrote to the file.");
//         } catch (IOException e) {
//             System.out.println("An error occurred.");
//         }
//     }
// }


import java.io.*;
import javax.swing.*;
class Class14{
    public static void main(String[] args) {
    JFrame fr = new JFrame("Details");
    JTextField t1 = new JTextField();
    JButton b1 = new JButton("Submit");
    fr.setSize(300, 300);    
    fr.setLayout(null);
    t1.setBounds(10,10,150,40);
    b1.setBounds(10,60,100,50);
    fr.add(b1);
    fr.add(t1);

    b1.addActionListener(e->{
            try {
            FileWriter writer = new FileWriter("example.txt",true);
            writer.write(t1.getText()+'\n');
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException ex) {
            System.out.println("An error occurred.");
        }
    });

    fr.setVisible(true);
    // frame.setSize(100,100);
        
    }
}