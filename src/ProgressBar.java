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

        this.setBackground(Color.black);
    }

    public ProgressBar() {
        this(0);
    }

    @Override
    public void print(Graphics g) {
        super.print(g);
        g.drawString("hi", 500, 240);
    }
}
