package readMangax;

import java.awt.EventQueue;

public class ReadMangax {
	   public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    Mimodelo modelo = new Mimodelo();
	                    	Misvistas vista = new Misvistas();
	                    Micontrolador controlador = new Micontrolador(modelo, vista);

	                    vista.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
	}