package readMangax;

import java.awt.EventQueue;
import mangaControl.Mangacontrolador;
import mangaModelo.Mangamodelo;
import mangaVista.Mangasvistas;
/**
 *@author Pedro; 
 *
 */
public class ReadMangax {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Mangamodelo mgmod = new Mangamodelo();
                    Mangasvistas mgvist = new Mangasvistas();
                    Mangacontrolador mgcont = new Mangacontrolador(mgmod, mgvist);

                    mgvist.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
