package mangaModelo;

/**
 * @author PedroVillaverde
 * 
 * @version 1.8
 * @since 2023-09-15
 */
public class Mangamodelo {
    /**
     *  Campo de texto del modelo
     */
    public String texto;

    /**
     * Obtiene el valor actual del campo de texto.
     *
     * @return El texto actual del modelo.
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Establece el valor del campo de texto.
     *
     * @param texto El nuevo valor del campo de texto.
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
