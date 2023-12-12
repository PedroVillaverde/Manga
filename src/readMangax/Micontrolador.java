package readMangax;

public class Micontrolador {
	   private Mimodelo modelo;
	    private Misvistas vista;

	    public Micontrolador(Mimodelo modelo, Misvistas vista) {
	        this.modelo = modelo;
	        this.vista = vista;

	
	        vista.gettxtNombre().setText("ReadMangax");
	        vista.gettxtNombre().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
    }
}

