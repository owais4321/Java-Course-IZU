import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;

public class tilegame {
    private static ImageIcon Frog = new ImageIcon("transparent_image_1.png");
    private static ImageIcon Tree = new ImageIcon("transparent_image_4.png");
    private static ImageIcon Bird = new ImageIcon("transparent_image_2.png");
    private static ImageIcon Computer = new ImageIcon("output-onlinepngtools.png");
    private static ImageIcon Orange = new ImageIcon("images.png");
    static boolean g1 = false;
    static boolean g2 = false;
    static boolean g3 = false;
    static boolean g4 = false;
    static int click = 0;
    private static JButton bFrog1 = new JButton();
    private static JButton bFrog2 = new JButton();
    private static JButton bTree1 = new JButton();
    private static JButton bTree2 = new JButton();
    private static JButton bBird1 = new JButton();
    private static JButton bBird2 = new JButton();
    private static JButton bComputer1 = new JButton();
    private static JButton bComputer2 = new JButton();
    
    public static void check(int a){
        switch(a){
            case 1:
                bFrog1.setIcon(Orange);
                break;
            case 2:
                bTree1.setIcon(Orange);
                break;
            case 3:
                bBird1.setIcon(Orange);
                break;
            case 4:
                bComputer1.setIcon(Orange);
                break;
            case 5:
                bComputer2.setIcon(Orange);
                break;
            case 6:
                bBird2.setIcon(Orange);
                break;
            case 7:
                bTree2.setIcon(Orange);
                break;
            case 8:
                bFrog2.setIcon(Orange);
                break;
        }
    }

    public static void main(String args[]){
        JFrame f1 = new JFrame("Tile Game");
        f1.setSize(800, 438);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);


        bFrog1.setBounds(0, 0, 200,200);
        bFrog2.setBounds(0, 200, 200,200);
        bTree1.setBounds(200, 0, 200,200);
        bTree2.setBounds(200, 200, 200,200);
        bBird1.setBounds(400, 0, 200,200);
        bBird2.setBounds(400, 200, 200,200);
        bComputer2.setBounds(600, 200, 200,200);
        bComputer1.setBounds(600, 0, 200,200);

        bFrog1.setIcon(Orange);
        bFrog2.setIcon(Orange);
        bTree1.setIcon(Orange);
        bTree2.setIcon(Orange);
        bBird1.setIcon(Orange);
        bBird2.setIcon(Orange);
        bComputer1.setIcon(Orange);
        bComputer2.setIcon(Orange);

        f1.add(bFrog1);
        f1.add(bFrog2);
        f1.add(bTree1);
        f1.add(bTree2);
        f1.add(bBird1);
        f1.add(bBird2);
        f1.add(bComputer1);
        f1.add(bComputer2);



        //1
        bFrog1.addActionListener(a->{
            if(g1){
            }
            else if(click == 0){
                bFrog1.setIcon(Frog);
                click = 1;
            }
            else if(click+1==9){
                bFrog1.setIcon(Frog);
                g1 = true;
                click = 0;
            }else{
                check(click);
                click = 0;
            }
        });

        //8
        bFrog2.addActionListener(b->{
            if(g1){}
            else if(click == 0){
                bFrog2.setIcon(Frog);
                click = 8;
            }
            else if((click+8) == 9){
                bFrog2.setIcon(Frog);
                g1 = true;
                click = 0;
            }else {
                check(click);
                click = 0;
            }
        });

        //2
        bTree1.addActionListener(b->{
            if(g2){}
            else if(click == 0){
                bTree1.setIcon(Tree);
                click = 2;
            }
            else if(click + 2 == 9){
                bTree1.setIcon(Tree);
                g2 = true;
                click = 0;
            }else {
                check(click);
                click = 0;
            }
        });

        //7
        bTree2.addActionListener(b->{
            if(g2){}
            else if(click == 0){
                bTree2.setIcon(Tree);
                click = 7;
            }
            else if(click + 7 == 9){
                bTree2.setIcon(Tree);
                g2 = true;
                click = 0;
            }else{
                check(click);
                click = 0;
            }
        });

        //3
        bBird1.addActionListener(b->{
            if(g3){}
            else if(click == 0){
                bBird1.setIcon(Bird);
                click = 3;
            }
            else if(click + 3 == 9){
                bBird1.setIcon(Bird);
                g3 = true;
                click = 0;
            }else{
                check(click);
                click = 0;
            }
        });

        //6
        bBird2.addActionListener(b->{
            if(g3){}
            else if(click == 0){
                bBird2.setIcon(Bird);
                click = 6;
            }
            else if(click + 6 == 9){
                bBird2.setIcon(Bird);
                g3 = true;
                click = 0;
            }else{
                check(click);
                click = 0;
            }
        });

        //4
        bComputer1.addActionListener(b->{
            if(g4){}
            else if(click == 0){
                bComputer1.setIcon(Computer);
                click = 4;
            }
            else if(click + 4 == 9){
                bComputer1.setIcon(Computer);
                g4 = true;
                click = 0;
            }else{
                check(click);
                click = 0;
            }
        });

        //5
        bComputer2.addActionListener(b->{
            if(g4){}
            else if(click == 0){
                bComputer2.setIcon(Computer);
                click = 5;
            }
            else if(click + 5 == 9){
                bComputer2.setIcon(Computer);
                g4 = true;
                click = 0;
            }else{
                check(click);
                click = 0;
            }
        });

        f1.setVisible(true);

    }

}