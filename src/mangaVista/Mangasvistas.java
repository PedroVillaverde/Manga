package mangaVista;

import javax.swing.JFrame;
import mangaLook.MangaLook;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mangasvistas extends JFrame {
    private static final long serialVersionUID = 1L;

    public MangaLook mangaLook;

    public Mangasvistas() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 487, 314);

        mangaLook = new MangaLook();
        getContentPane().add(mangaLook);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleWindowClosing();
            }
        });
    }

    private void handleWindowClosing() {
        dispose();
        System.exit(0);
    }
}
