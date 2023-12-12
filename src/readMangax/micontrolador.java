package readMangax;

public class micontrolador {
	   private mimodelo modelo;
	    private Misvistas vista;

	    public micontrolador(mimodelo modelo, Misvistas vista) {
	        this.modelo = modelo;
	        this.vista = vista;

	
	        vista.getTxtNombre().setText("Nombre del Programa");
	        vista.getTxtNombre().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
    }
}

