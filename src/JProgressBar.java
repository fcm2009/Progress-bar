import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.io.Serializable;

/**
 * Created by Mohammed Alshehry on 12/20/14.
 */
public class JProgressBar extends JPanel implements ChangeListener, Serializable {

    JSlider value;
    ProgressBar progressBar;


    public JProgressBar() {
        this.setLayout(new BorderLayout());

        progressBar = new ProgressBar();
        this.add(progressBar, "Center");

        value = new JSlider(0, 101);
        value.setMajorTickSpacing(10);
        value.setMinorTickSpacing(1);
        value.setPaintTicks(true);
        value.setPaintLabels(true);
        value.setValue(0);
        value.addChangeListener(this);
        this.add(value, "South");
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        JSlider value = (JSlider) ce.getSource();
        progressBar.setValue(value.getValue());
    }
}
