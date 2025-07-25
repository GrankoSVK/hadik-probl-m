import javax.swing.*;

public class SnakeGame extends JFrame {

    private final int SCREEN_WIDTH = 600;
    private final int SCREEN_HEIGHT = 600;


    public SnakeGame() {
        this.setTitle("Snake Game");
        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new GamePanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SnakeGame::new);
    }
}
