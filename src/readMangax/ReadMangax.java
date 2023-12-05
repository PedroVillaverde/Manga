package readMangax;

import java.awt.EventQueue;

public class ReadMangax {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mimodelo modelo = new mimodelo();
                    misvistas vista = new misvistas();
                    micontrolador controlador = new micontrolador(modelo, vista);

                    vista.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}