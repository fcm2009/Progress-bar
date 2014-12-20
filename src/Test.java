import javax.swing.*;
import java.awt.*;

/**
 * Created by Mohammed Alshehry on 12/17/14.
 */
public class Test extends JFrame {
    JProgressBar progressBar;


    public Test() {
        this.setSize(720, 480);
        this.setLayout(new BorderLayout());

        progressBar = new JProgressBar();
        this.add(progressBar, "Center");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String args[]) {
        Test x = new Test();
    }

}
