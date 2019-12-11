package Home;

import javax.swing.*;
import java.awt.*;

public class HomeMenu extends JFrame {

    JMenuBar mbar =new JMenuBar();

    @Override
    public void setJMenuBar(JMenuBar jMenuBar) {
        super.setJMenuBar(mbar);
    }

    public HomeMenu(){
    super("Administrator");
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setSize(screenSize.width,screenSize.height);
    setLocation(140,140);
    setResizable(true);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
}
