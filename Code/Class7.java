import javax.swing.*;
class Class7{
    public static void main(String args[]){
        JFrame f1 = new JFrame("Puzzle");
        f1.setSize(600,700);
        f1.setLayout(null);
        //Create Buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton empty = new JButton("");
        JButton shuffle = new JButton("Shuffle");
        JButton reset = new JButton("Reset");
        //Set bounds row1
        b1.setBounds(0,0,200,200);
        b2.setBounds(200,0,200,200);
        b3.setBounds(400,0,200,200);
        //set bounds row
        b4.setBounds(0,200,200,200);
        b5.setBounds(200,200,200,200);
        b6.setBounds(400,200,200,200);
        //set bounds row3
        b7.setBounds(0,400,200,200);
        b8.setBounds(200,400,200,200);
        empty.setBounds(400,400,200,200);

        shuffle.setBounds(30, 600, 100,50);
        reset.setBounds(450, 600, 100,50);
        //add buttons
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(empty);
        f1.add(shuffle);
        f1.add(reset);

        b1.addActionListener(e->{
            int b1x = b1.getBounds().x;
            int b1y = b1.getBounds().y;
            int emptyx = empty.getBounds().x;
            int emptyy = empty.getBounds().y;
            if((Math.abs(b1x-emptyx) == 200 && b1y == emptyy) || 
            (Math.abs(b1y-emptyy)==200) && b1x == emptyx ){
                b1.setBounds(emptyx,emptyy,200,200);
                empty.setBounds(b1x,b1y,200,200);
            }
        });      

        b2.addActionListener(e->{
            int b2x = b2.getBounds().x;
            int b2y = b2.getBounds().y;
            int emptyx = empty.getBounds().x;
            int emptyy = empty.getBounds().y;
            if((Math.abs(b2x-emptyx) == 200 && b2y == emptyy) || 
            (Math.abs(b2y-emptyy)==200) && b2x == emptyx ){
                b2.setBounds(emptyx,emptyy,200,200);
                empty.setBounds(b2x,b2y,200,200);
            }
        });  

        b3.addActionListener(e->{
            int b3x = b3.getBounds().x;
            int b3y = b3.getBounds().y;
            int emptyx = empty.getBounds().x;
            int emptyy = empty.getBounds().y;
            if((Math.abs(b3x-emptyx) == 200 && b3y == emptyy) || 
            (Math.abs(b3y-emptyy)==200) && b3x == emptyx ){
                b3.setBounds(emptyx,emptyy,200,200);
                empty.setBounds(b3x,b3y,200,200);
            }
        });

        b4.addActionListener(e->{
            int b4x = b4.getBounds().x;
            int b4y = b4.getBounds().y;
            int emptyx = empty.getBounds().x;
            int emptyy = empty.getBounds().y;
            if((Math.abs(b4x-emptyx) == 200 && b4y == emptyy) || 
            (Math.abs(b4y-emptyy)==200) && b4x == emptyx ){
                b4.setBounds(emptyx,emptyy,200,200);
                empty.setBounds(b4x,b4y,200,200);
            }
        });

        b5.addActionListener(e->{
            int b5x = b5.getBounds().x;
            int b5y = b5.getBounds().y;
            int emptyx = empty.getBounds().x;
            int emptyy = empty.getBounds().y;
            if((Math.abs(b5x-emptyx) == 200 && b5y == emptyy) || 
            (Math.abs(b5y-emptyy)==200) && b5x == emptyx ){
                b5.setBounds(emptyx,emptyy,200,200);
                empty.setBounds(b5x,b5y,200,200);
            }
        });

        b6.addActionListener(e->{
            int b6x = b6.getBounds().x;
            int b6y = b6.getBounds().y;
            int emptyx = empty.getBounds().x;
            int emptyy = empty.getBounds().y;
            if((Math.abs(b6x-emptyx) == 200 && b6y == emptyy) || 
            (Math.abs(b6y-emptyy)==200) && b6x == emptyx ){
                b6.setBounds(emptyx,emptyy,200,200);
                empty.setBounds(b6x,b6y,200,200);
            }
        });

        b7.addActionListener(e->{
            int b7x = b7.getBounds().x;
            int b7y = b7.getBounds().y;
            int emptyx = empty.getBounds().x;
            int emptyy = empty.getBounds().y;
            if((Math.abs(b7x-emptyx) == 200 && b7y == emptyy) || 
            (Math.abs(b7y-emptyy)==200) && b7x == emptyx ){
                b7.setBounds(emptyx,emptyy,200,200);
                empty.setBounds(b7x,b7y,200,200);
            }
        });

        b8.addActionListener(e->{
            int b8x = b8.getBounds().x;
            int b8y = b8.getBounds().y;
            int emptyx = empty.getBounds().x;
            int emptyy = empty.getBounds().y;
            if((Math.abs(b8x-emptyx) == 200 && b8y == emptyy) || 
            (Math.abs(b8y-emptyy)==200) && b8x == emptyx ){
                b8.setBounds(emptyx,emptyy,200,200);
                empty.setBounds(b8x,b8y,200,200);
            }
        });

        shuffle.addActionListener(e->{
            b3.setBounds(0,0,200,200);
            b1.setBounds(200,0,200,200);
            empty.setBounds(400,0,200,200);
            //set bounds row
            b6.setBounds(0,200,200,200);
            b4.setBounds(200,200,200,200);
            b5.setBounds(400,200,200,200);
            //set bounds row3
            b8.setBounds(0,400,200,200);
            b7.setBounds(200,400,200,200);
            b2.setBounds(400,400,200,200);
        });

        reset.addActionListener(e->{
        b1.setBounds(0,0,200,200);
        b2.setBounds(200,0,200,200);
        b3.setBounds(400,0,200,200);
        //set bounds row
        b4.setBounds(0,200,200,200);
        b5.setBounds(200,200,200,200);
        b6.setBounds(400,200,200,200);
        //set bounds row3
        b7.setBounds(0,400,200,200);
        b8.setBounds(200,400,200,200);
        empty.setBounds(400,400,200,200);
        });    
        f1.setVisible(true);
    }
}

// Shuffle
// Reset