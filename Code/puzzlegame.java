import javax.swing.*;

public class puzzlegame {
    public static int b1x,b1y,b2x,b2y,b3x,b3y,b4x,b4y,b5x,b5y,b6x,b6y,b7x,b7y,b8x,b8y,b9x,b9y,b10x,b10y,b11x,b11y,b12x,b12y,b13x,b13y,b14x,b14y,b15x,b15y,b16x,b16y,b17x,b17y,b18x,b18y,b19x,b19y,b20x,b20y,b21x,b21y,b22x,b22y,b23x,b23y,b24x,b24y,ex,ey,q,w;
    public static void main(String[] args) {

        JFrame frame = new JFrame("puzzle");
        frame.setAlwaysOnTop(true);
        frame.setLayout(null);
        frame.setSize(489,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton b1 = new JButton();
        b1.setIcon(new ImageIcon("piece_25.png"));
        b1.setBorderPainted(false);

        JButton b2 = new JButton();
        b2.setIcon(new ImageIcon("piece_2.png"));
        b2.setBorderPainted(false);

        JButton b3 = new JButton();
        b3.setIcon(new ImageIcon("piece_3.png"));
        b3.setBorderPainted(false);

        JButton b4 = new JButton();
        b4.setIcon(new ImageIcon("piece_4.png"));
        b4.setBorderPainted(false);
        
        JButton b5 = new JButton();
        b5.setIcon(new ImageIcon("piece_5.png"));
        b5.setBorderPainted(false);

        JButton b6 = new JButton();
        b6.setIcon(new ImageIcon("piece_6.png"));
        b6.setBorderPainted(false);

        JButton b7 = new JButton();
        b7.setIcon(new ImageIcon("piece_7.png"));
        b7.setBorderPainted(false);
        
        JButton b8 = new JButton();
        b8.setIcon(new ImageIcon("piece_8.png"));
        b8.setBorderPainted(false);
        
        JButton b9 = new JButton();
        b9.setIcon(new ImageIcon("piece_9.png"));
        b9.setBorderPainted(false);
        
        JButton b10 = new JButton();
        b10.setIcon(new ImageIcon("piece_10.png"));
        b10.setBorderPainted(false);
        
        JButton b11 = new JButton();
        b11.setIcon(new ImageIcon("piece_11.png"));
        b11.setBorderPainted(false);

        JButton b12 = new JButton();
        b12.setIcon(new ImageIcon("piece_12.png"));
        b12.setBorderPainted(false);
        
        JButton b13 = new JButton();
        b13.setIcon(new ImageIcon("piece_13.png"));
        b13.setBorderPainted(false);
        
        JButton b14 = new JButton();
        b14.setIcon(new ImageIcon("piece_14.png"));
        b14.setBorderPainted(false);
        
        JButton b15 = new JButton();
        b15.setIcon(new ImageIcon("piece_15.png"));
        b15.setBorderPainted(false);
        
        JButton b16 = new JButton();
        b16.setIcon(new ImageIcon("piece_16.png"));
        b16.setBorderPainted(false);
        
        JButton b17 = new JButton();
        b17.setIcon(new ImageIcon("piece_17.png"));
        b17.setBorderPainted(false);
        
        JButton b18 = new JButton();
        b18.setIcon(new ImageIcon("piece_18.png"));
        b18.setBorderPainted(false);
        
        JButton b19 = new JButton();
        b19.setIcon(new ImageIcon("piece_19.png"));
        b19.setBorderPainted(false);
             
        JButton b20 = new JButton();
        b20.setIcon(new ImageIcon("piece_20.png"));
        b20.setBorderPainted(false);
        
        JButton b21 = new JButton();
        b21.setIcon(new ImageIcon("piece_21.png"));
        b21.setBorderPainted(false);
        
        JButton b22 = new JButton();
        b22.setIcon(new ImageIcon("piece_22.png"));
        b22.setBorderPainted(false);
        
        JButton b23 = new JButton();
        b23.setIcon(new ImageIcon("piece_23.png"));
        b23.setBorderPainted(false);
        
        JButton b24 = new JButton();
        b24.setIcon(new ImageIcon("piece_24.png"));
        b24.setBorderPainted(false);
        
        JButton e = new JButton();
        e.setBorderPainted(false);
        JButton reset = new JButton("Reset");
        JButton shuffle = new JButton("Shuffle");


        b1.setBounds(380,452,95,113);
        b2.setBounds(95,0,95,113);
        b3.setBounds(190,0,95,113);
        b4.setBounds(285,0,95,113);
        b5.setBounds(380,0,95,113);

        b6.setBounds(0,113,95,113);
        b7.setBounds(95,113,95,113);
        b8.setBounds(190,113,95,113);
        b9.setBounds(285,113,95,113);
        b10.setBounds(380,113,95,113);

        b11.setBounds(0,226,95,113);
        b12.setBounds(95,226,95,113);
        b13.setBounds(190,226,95,113);
        b14.setBounds(285,226,95,113);
        b15.setBounds(380,226,95,113);

        b16.setBounds(0,339,95,113);
        b17.setBounds(95,339,95,113);
        b18.setBounds(190,339,95,113);
        b19.setBounds(285,339,95,113);
        b20.setBounds(380,339,95,113);

        b21.setBounds(0,452,95,113);
        b22.setBounds(95,452,95,113);
        b23.setBounds(190,452,95,113);
        b24.setBounds(285,452,95,113);
        e.setBounds(0,0,95,113);

        reset.setBounds(95,610,95,30);
        shuffle.setBounds(285,610,95,30);


        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);
        frame.add(b13);
        frame.add(b14);
        frame.add(b15);
        frame.add(b16);
        frame.add(b17);
        frame.add(b18);
        frame.add(b19);
        frame.add(b20);
        frame.add(b21);
        frame.add(b22);
        frame.add(b23);
        frame.add(b24);
        frame.add(e);
        frame.add(reset);
        frame.add(shuffle);


        reset.addActionListener(a->{
            b1.setBounds(380,452,95,113);
            b2.setBounds(95,0,95,113);
            b3.setBounds(190,0,95,113);
            b4.setBounds(285,0,95,113);
            b5.setBounds(380,0,95,113);
    
            b6.setBounds(0,113,95,113);
            b7.setBounds(95,113,95,113);
            b8.setBounds(190,113,95,113);
            b9.setBounds(285,113,95,113);
            b10.setBounds(380,113,95,113);
    
            b11.setBounds(0,226,95,113);
            b12.setBounds(95,226,95,113);
            b13.setBounds(190,226,95,113);
            b14.setBounds(285,226,95,113);
            b15.setBounds(380,226,95,113);
    
            b16.setBounds(0,339,95,113);
            b17.setBounds(95,339,95,113);
            b18.setBounds(190,339,95,113);
            b19.setBounds(285,339,95,113);
            b20.setBounds(380,339,95,113);
    
            b21.setBounds(0,452,95,113);
            b22.setBounds(95,452,95,113);
            b23.setBounds(190,452,95,113);
            b24.setBounds(285,452,95,113);
            e.setBounds(0,0,95,113);
        });


        shuffle.addActionListener(a->{

                b1.setBounds(95,113,95,113);//7
                b2.setBounds(95,339,95,113);//17
                b3.setBounds(95,226,95,113);//12
                b4.setBounds(95,452,95,113);//22
                b5.setBounds(0,0,95,113);//1
                b6.setBounds(285,113,95,113);//9
                b7.setBounds(0,113,95,113);//6
                b8.setBounds(285,452,95,113);//24
                b9.setBounds(190,226,95,113);//13
                b10.setBounds(285,0,95,113);//4
                b11.setBounds(380,0,95,113);//5
                b12.setBounds(0,452,95,113);//21
                b13.setBounds(190,339,95,113);//18
                b14.setBounds(380,226,95,113);//15
                b15.setBounds(0,226,95,113);//11
                b16.setBounds(190,113,95,113);//8
                b17.setBounds(190,0,95,113);//3
                b18.setBounds(285,226,95,113);//14
                b19.setBounds(190,452,95,113);//23
                b20.setBounds(380,113,95,113);//10
                b21.setBounds(285,339,95,113);//19
                b22.setBounds(95,0,95,113);//2
                b23.setBounds(0,339,95,113);//16
                b24.setBounds(380,339,95,113);//20
                e.setBounds(380,452,95,113);
            
            
        });
        
        b1.addActionListener(a->{
            b1x = b1.getBounds().x;
            b1y = b1.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b1x-ex);
            w=Math.abs(b1y-ey);
            if((q==95 && b1y==ey) || (w==113 && b1x==ex)){
                b1.setBounds(ex,ey,95,113);
                e.setBounds(b1x,b1y,95,113);
            }
        }); 

        b2.addActionListener(a->{
            b2x = b2.getBounds().x;
            b2y = b2.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b2x-ex);
            w=Math.abs(b2y-ey);
            if((q==95 && b2y==ey) || (w==113 && b2x==ex)){
                b2.setBounds(ex,ey,95,113);
                e.setBounds(b2x,b2y,95,113);
            }
        }); 

        b3.addActionListener(a->{
            b3x = b3.getBounds().x;
            b3y = b3.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b3x-ex);
            w=Math.abs(b3y-ey);
            if((q==95 && b3y==ey) || (w==113 && b3x==ex)){
                b3.setBounds(ex,ey,95,113);
                e.setBounds(b3x,b3y,95,113);
            }
        }); 

        b4.addActionListener(a->{
            b4x = b4.getBounds().x;
            b4y = b4.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b4x-ex);
            w=Math.abs(b4y-ey);
            if((q==95 && b4y==ey) || (w==113 && b4x==ex)){
                b4.setBounds(ex,ey,95,113);
                e.setBounds(b4x,b4y,95,113);
            }
        }); 

        b5.addActionListener(a->{
            b5x = b5.getBounds().x;
            b5y = b5.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b5x-ex);
            w=Math.abs(b5y-ey);
            if((q==95 && b5y==ey) || (w==113 && b5x==ex)){
                b5.setBounds(ex,ey,95,113);
                e.setBounds(b5x,b5y,95,113);
            }
        }); 

        b6.addActionListener(a->{
            b6x = b6.getBounds().x;
            b6y = b6.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b6x-ex);
            w=Math.abs(b6y-ey);
            if((q==95 && b6y==ey) || (w==113 && b6x==ex)){
                b6.setBounds(ex,ey,95,113);
                e.setBounds(b6x,b6y,95,113);
            }
        }); 

        b7.addActionListener(a->{
            b7x = b7.getBounds().x;
            b7y = b7.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b7x-ex);
            w=Math.abs(b7y-ey);
            if((q==95 && b7y==ey) || (w==113 && b7x==ex)){
                b7.setBounds(ex,ey,95,113);
                e.setBounds(b7x,b7y,95,113);
            }
        }); 

        b8.addActionListener(a->{
            b8x = b8.getBounds().x;
            b8y = b8.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b8x-ex);
            w=Math.abs(b8y-ey);
            if((q==95 && b8y==ey) || (w==113 && b8x==ex)){
                b8.setBounds(ex,ey,95,113);
                e.setBounds(b8x,b8y,95,113);
            }
        });

        b9.addActionListener(a->{
            b9x = b9.getBounds().x;
            b9y = b9.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b9x-ex);
            w=Math.abs(b9y-ey);
            if((q==95 && b9y==ey) || (w==113 && b9x==ex)){
                b9.setBounds(ex,ey,95,113);
                e.setBounds(b9x,b9y,95,113);
            }
        });
        
        b10.addActionListener(a->{
            b10x = b10.getBounds().x;
            b10y = b10.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b10x-ex);
            w=Math.abs(b10y-ey);
            if((q==95 && b10y==ey) || (w==113 && b10x==ex)){
                b10.setBounds(ex,ey,95,113);
                e.setBounds(b10x,b10y,95,113);
            }
        });

        b11.addActionListener(a->{
            b11x = b11.getBounds().x;
            b11y = b11.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b11x-ex);
            w=Math.abs(b11y-ey);
            if((q==95 && b11y==ey) || (w==113 && b11x==ex)){
                b11.setBounds(ex,ey,95,113);
                e.setBounds(b11x,b11y,95,113);
            }
        });

        b12.addActionListener(a->{
            b12x = b12.getBounds().x;
            b12y = b12.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b12x-ex);
            w=Math.abs(b12y-ey);
            if((q==95 && b12y==ey) || (w==113 && b12x==ex)){
                b12.setBounds(ex,ey,95,113);
                e.setBounds(b12x,b12y,95,113);
            }
        });

        b13.addActionListener(a->{
            b13x = b13.getBounds().x;
            b13y = b13.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b13x-ex);
            w=Math.abs(b13y-ey);
            if((q==95 && b13y==ey) || (w==113 && b13x==ex)){
                b13.setBounds(ex,ey,95,113);
                e.setBounds(b13x,b13y,95,113);
            }
        });

        b14.addActionListener(a->{
            b14x = b14.getBounds().x;
            b14y = b14.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b14x-ex);
            w=Math.abs(b14y-ey);
            if((q==95 && b14y==ey) || (w==113 && b14x==ex)){
                b14.setBounds(ex,ey,95,113);
                e.setBounds(b14x,b14y,95,113);
            }
        });

        b15.addActionListener(a->{
            b15x = b15.getBounds().x;
            b15y = b15.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b15x-ex);
            w=Math.abs(b15y-ey);
            if((q==95 && b15y==ey) || (w==113 && b15x==ex)){
                b15.setBounds(ex,ey,95,113);
                e.setBounds(b15x,b15y,95,113);
            }
        });

        b16.addActionListener(a->{
            b16x = b16.getBounds().x;
            b16y = b16.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b16x-ex);
            w=Math.abs(b16y-ey);
            if((q==95 && b16y==ey) || (w==113 && b16x==ex)){
                b16.setBounds(ex,ey,95,113);
                e.setBounds(b16x,b16y,95,113);
            }
        });

        b17.addActionListener(a->{
            b17x = b17.getBounds().x;
            b17y = b17.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b17x-ex);
            w=Math.abs(b17y-ey);
            if((q==95 && b17y==ey) || (w==113 && b17x==ex)){
                b17.setBounds(ex,ey,95,113);
                e.setBounds(b17x,b17y,95,113);
            }
        });

        b18.addActionListener(a->{
            b18x = b18.getBounds().x;
            b18y = b18.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b18x-ex);
            w=Math.abs(b18y-ey);
            if((q==95 && b18y==ey) || (w==113 && b18x==ex)){
                b18.setBounds(ex,ey,95,113);
                e.setBounds(b18x,b18y,95,113);
            }
        });

        b19.addActionListener(a->{
            b19x = b19.getBounds().x;
            b19y = b19.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b19x-ex);
            w=Math.abs(b19y-ey);
            if((q==95 && b19y==ey) || (w==113 && b19x==ex)){
                b19.setBounds(ex,ey,95,113);
                e.setBounds(b19x,b19y,95,113);
            }
        });

        b20.addActionListener(a->{
            b20x = b20.getBounds().x;
            b20y = b20.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b20x-ex);
            w=Math.abs(b20y-ey);
            if((q==95 && b20y==ey) || (w==113 && b20x==ex)){
                b20.setBounds(ex,ey,95,113);
                e.setBounds(b20x,b20y,95,113);
            }
        });

        b21.addActionListener(a->{
            b21x = b21.getBounds().x;
            b21y = b21.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b21x-ex);
            w=Math.abs(b21y-ey);
            if((q==95 && b21y==ey) || (w==113 && b21x==ex)){
                b21.setBounds(ex,ey,95,113);
                e.setBounds(b21x,b21y,95,113);
            }
        });

        b22.addActionListener(a->{
            b22x = b22.getBounds().x;
            b22y = b22.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b22x-ex);
            w=Math.abs(b22y-ey);
            if((q==95 && b22y==ey) || (w==113 && b22x==ex)){
                b22.setBounds(ex,ey,95,113);
                e.setBounds(b22x,b22y,95,113);
            }
        });

        b23.addActionListener(a->{
            b23x = b23.getBounds().x;
            b23y = b23.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b23x-ex);
            w=Math.abs(b23y-ey);
            if((q==95 && b23y==ey) || (w==113 && b23x==ex)){
                b23.setBounds(ex,ey,95,113);
                e.setBounds(b23x,b23y,95,113);
            }
        });

        b24.addActionListener(a->{
            b24x = b24.getBounds().x;
            b24y = b24.getBounds().y;
            ex = e.getBounds().x;
            ey = e.getBounds().y;
            q=Math.abs(b24x-ex);
            w=Math.abs(b24y-ey);
            if((q==95 && b24y==ey) || (w==113 && b24x==ex)){
                b24.setBounds(ex,ey,95,113);
                e.setBounds(b24x,b24y,95,113);
            }
        });
        
        frame.setVisible(true);
    }   
}
