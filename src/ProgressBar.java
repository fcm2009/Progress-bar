import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

/**
 * Created by Mohammed Alshehry on 12/17/14.
 */
public class ProgressBar extends JComponent implements Serializable {

    private int value;


    public ProgressBar(int value) {
        this.value = value;
    }

    public ProgressBar() {
        this(0);
    }

    public int getValue() {
        return value;
    }

    private int getMinDim() {
        int x = getWidth();
        int y = getHeight();
        if(x > y)
            return y;
        else
            return x;
    }

    public int getCenterX() {
        return getWidth() / 2;
    }

    public int getCenterY() {
        return getHeight() / 2;
    }

    public void setValue(int value) {
        this.value = value;
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GRAY);
        int radius = value * getMinDim() / 100;
        g.fillOval(getCenterX() - radius / 2, getCenterY() - radius / 2, radius, radius);
    }

    @Override
    protected void paintBorder(Graphics g) {
        super.paintBorder(g);
        double radius = getMinDim() / 2;

        for(int i = 0; i < 360; i++) {
            double x = getCenterX() + radius * Math.cos(Math.toRadians(i));
            double y = getCenterY() + radius * Math.sin(Math.toRadians(i));
            g.drawLine((int) x, (int) y, (int) x, (int) y);
        }
    }

}
