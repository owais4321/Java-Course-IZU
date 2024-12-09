import javax.swing.*;

class Game {
    private JFrame frame;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, empty;

    public Game() {
        frame = new JFrame("Tile Game");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize buttons
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        empty = new JButton("");

        // Shuffle positions manually
        b1.setBounds(0, 0, 100, 100);
        b2.setBounds(100, 0, 100, 100);
        empty.setBounds(200, 0, 100, 100); // Empty can be anywhere
        b3.setBounds(0, 100, 100, 100);
        b4.setBounds(100, 100, 100, 100);
        b5.setBounds(200, 100, 100, 100);
        b6.setBounds(0, 200, 100, 100);
        b7.setBounds(100, 200, 100, 100);
        b8.setBounds(200, 200, 100, 100);

        // Add buttons to frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(empty);

        // Add action listeners for all buttons
        b1.addActionListener(e -> swap(b1));
        b2.addActionListener(e -> swap(b2));
        b3.addActionListener(e -> swap(b3));
        b4.addActionListener(e -> swap(b4));
        b5.addActionListener(e -> swap(b5));
        b6.addActionListener(e -> swap(b6));
        b7.addActionListener(e -> swap(b7));
        b8.addActionListener(e -> swap(b8));

        frame.setVisible(true);
    }

    private void swap(JButton button) {
        // Get button and empty button positions
        int buttonX = button.getBounds().x;
        int buttonY = button.getBounds().y;
        int emptyX = empty.getBounds().x;
        int emptyY = empty.getBounds().y;

        // Check adjacency: same row, or same column, with one step difference
        boolean isAdjacent = (Math.abs(buttonX - emptyX) == 100 && buttonY == emptyY) ||
                             (Math.abs(buttonY - emptyY) == 100 && buttonX == emptyX);

        // Swap if valid move
        if (isAdjacent) {
            empty.setBounds(buttonX, buttonY, 100, 100);
            button.setBounds(emptyX, emptyY, 100, 100);
        }
    }

    public static void main(String[] args) {
        new Game();
}
}
