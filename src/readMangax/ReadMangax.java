package readMangax;

import java.awt.EventQueue;

import MangaControl.Micontrolador;
import MangaModelo.Mimodelo;
import MangaVista.Misvistas;

public class ReadMangax {
	   public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    Mimodelo mgmod = new Mimodelo();
	                    	Misvistas mgvist = new Misvistas();
	                    Micontrolador mgcont = new Micontrolador(mgmod, mgvist);

	                    mgvist.setVisible(true);
	                } catch (Exception e) {
	                	
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
	}