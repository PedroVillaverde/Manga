package readMangax;

import java.awt.EventQueue;
import mangaControl.Mangacontrolador;
import mangaModelo.Mangamodelo;
import mangaVista.Mangasvistas;

/**
 *
 * @author Pedro Villaverde
 * @version 1.8
 * @since 2023-09-12
 */
public class ReadMangax {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    /**
                     *  Crear el modelo, la vista y el controlador
                     */
                    Mangamodelo mgmod = new Mangamodelo();
                    Mangasvistas mgvist = new Mangasvistas();
                    Mangacontrolador mgcont = new Mangacontrolador(mgmod, mgvist);

                    /**
                     *  Hacer visible la vista
                     */
                    mgvist.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
