package mangaControl;

import mangaModelo.Mangamodelo;
import mangaVista.Mangasvistas;

/**
 *
 * @author Pedro Villaverde
 * @version 1.8
 * @since 2023-01-01
 */
public class Mangacontrolador {
    private Mangamodelo mangamod;
    private Mangasvistas mangavist;

    /**
     * Constructor de la clase Mangacontrolador.
     *
     * @param mod Modelo que gestionará la lógica de los mangas.
     * @param vist Vista encargada de mostrar la información de los mangas.
     * 
     */
    public Mangacontrolador(Mangamodelo mod, Mangasvistas vist) {
        this.mangamod = mod;
        this.mangavist = vist;
    }
}
