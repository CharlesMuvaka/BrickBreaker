
import javax.swing.*;
import javax.swing.text.html.ImageView;

public class MainClass extends JFrame {

    public MainClass() {
        initUI();
    }

    private void initUI() {
        setTitle("Brick Breaker Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        add(new GamePlay());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
            }
        });
    }
}
