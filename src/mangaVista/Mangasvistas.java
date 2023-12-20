package mangaVista;

import javax.swing.JFrame;
import mangaLook.MangaLook;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

/**
 * @author Pedro Villaverde
 * @version 1.
 * @since 2023-09-12
 */
public class Mangasvistas extends JFrame {
    private static final long serialVersionUID = 1L;

    /**
     *  Componente visual para mostrar la información del manga
     */
    public MangaLook mangaLook;

    /**
     * Constructor de la clase Mangasvistas.
     */
    public Mangasvistas() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 487, 314);

        // Inicializar el componente visual
        mangaLook = new MangaLook();
        mangaLook.txtTitulo.setBounds(10, 11, 135, 33);

        
        mangaLook.txtTitulo.setIcon(null);
        getContentPane().add(mangaLook);

        // Agregar un escuchador para el cierre de la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleWindowClosing();
            }
        });
    }

    /**
     * Método que maneja el cierre de la ventana.
     */
    private void handleWindowClosing() {
        dispose();
        System.exit(0);
    }
}
