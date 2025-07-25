import java.awt.*;

public class Snake {
    private final int[] x;
    private final int[] y;
    private int bodyParts;
    private static int unitSize = 20;
    private Direction direction = Direction.RIGHT;


    // Maximum number of snake segments / bodyParts
    private static final int GAME_UNITS = 600 * 600 / unitSize;

    public Snake(int initialSize) {
        x = new int[GAME_UNITS];
        y = new int[GAME_UNITS];
        bodyParts = initialSize;

        // inicialize snake positions
        for (int i = 0; i < bodyParts; i++) {
            x[i] = 100 - i * unitSize;
            y[i] = 100;
        }
        // Posun hlavy podľa smeru
        switch (direction) {
            case UP:
                y[0] -= unitSize;
                break;
            case DOWN:
                y[0] += unitSize;
                break;
            case LEFT:
                x[0] -= unitSize;
                break;
            case RIGHT:
                System.out.printf("Posúvam hlavu doprava");
                x[0] += unitSize;
                break;
        }
    }

    public void move() {
            // Move body
        for (int i = bodyParts; i > 0; i--) {
            x[1] = x[1 - 1];
            y[1] = y[1 - 1];
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x[0], y[0], unitSize, unitSize);

        // Draw rest of the body
        for (int i = 1; i < bodyParts; i++) {
            g.setColor(new Color(45, 180, 0));
            g.fillRect(x[i], x[i], unitSize, unitSize);
        }
    }
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
