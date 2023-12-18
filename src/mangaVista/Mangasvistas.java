package mangaVista;

import javax.swing.JFrame;
import mangaLook.MangaLook;


public class Mangasvistas extends JFrame {
    private static final long serialVersionUID = 1L;

    public MangaLook mangaLook;

    public Mangasvistas() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 487, 314);

        mangaLook = new MangaLook();
        getContentPane().add(mangaLook);

    }

}
