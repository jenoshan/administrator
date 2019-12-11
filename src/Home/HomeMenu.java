package Home;

import javax.swing.*;
import java.awt.*;

public class HomeMenu extends JFrame{

    JMenuBar menubar = new JMenuBar();

    public HomeMenu() {

        setTitle("Administrator");
        setJMenuBar(menubar);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width,screen.height);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu File = new JMenu("File");
        menubar.add(File);

        JMenuItem Home = new JMenuItem("Home");
        JMenuItem Open = new JMenuItem("Open");
        JMenuItem Exit = new JMenuItem("Exit");

        File.add(Home);
        File.add(Open);
        File.add(Exit);

        JMenu Color = new JMenu("Color");
        menubar.add(Color);

        JMenuItem Light = new JMenuItem("Light");
        JMenuItem Dark = new JMenuItem("Dark");

        Color.add(Light);
        Color.add(Dark);

    }
}
