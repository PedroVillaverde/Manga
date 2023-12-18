package mangaControl;

import mangaModelo.Mangamodelo;
import mangaVista.Mangasvistas;

public class Mangacontrolador {
    private Mangamodelo mangamod;
    private Mangasvistas mangavist;

    public Mangacontrolador(Mangamodelo mod, Mangasvistas vist) {
        this.mangamod = mod;
        this.mangavist = vist;

    }

}
