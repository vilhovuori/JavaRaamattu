package PopUpIkkuna;

import javax.swing.*;
import java.awt.*;

public class EkaJLabel extends JFrame {

    private JLabel item1;

    public EkaJLabel(){
        super("The title bar");
        setLayout(new FlowLayout());

        item1= new JLabel("this is a sentence");
        item1.setToolTipText("This is gonna show on hover");
        add(item1);
    }


}
