package readMangax;

public class micontrolador {
    private mimodelo modelo;
    private misvistas vista;

    public micontrolador(mimodelo modelo, misvistas vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.getLblNombrePrograma().setText("Botones");
        vista.getLblNombrePrograma().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
    }
}

