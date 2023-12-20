package mangaLook;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Pedro Villaverde
 * 
 * @version 1.8
 * @since 2023-12-01
 */
public class MangaLook extends JPanel {
	/**
	 *  Botón para iniciar la búsqueda de mangas.
	 */
    public JButton btnEnter;

    /**
     *  Botones para filtrar mangas por género.
     */
    public JButton btnShonnen;
    public JButton btnSeinen;
    public JButton btnKodomo;
    public JButton btnShojo;
    public JButton btnJosei;
    public JButton btnEcchi;

    /**
     *  Botón para el registro de usuario.
     */
    public JButton btnRegistrarse;  

    /**
     *  Etiqueta que indica la función de búsqueda.
     */
    public JLabel lblBuscar;

    /**
     *  Campo de texto para introducir criterios de búsqueda.
     */
    public JTextField textField;

    /**Etiqueta que muestra el título de la aplicación.
     * 
     */
    public JLabel txtTitulo;

    /**
     *  Etiqueta que indica los géneros de manga disponibles.
     */
    public JLabel lblGeneros;  


    /**
     * Constructor de la clase MangaLook que inicializa y organiza los componentes visuales.
     */
    public MangaLook() {
        setLayout(null);

        setBackground(new Color(173, 216, 230));  

        /** 
         * 
         * Botón Enter
         * 
         */
        btnEnter = new JButton("Enter");
        btnEnter.setBounds(254, 44, 89, 23);
        btnEnter.setBackground(new Color(135, 206, 250));  
        add(btnEnter);

        /**
         *  Etiqueta Buscar
         */
        lblBuscar = new JLabel("Buscar");
        lblBuscar.setBounds(10, 48, 46, 14);
        add(lblBuscar);

        /**
         *  Campo de texto
         */
        textField = new JTextField();
        textField.setBounds(66, 45, 178, 20);
        add(textField);
        textField.setColumns(10);

        /**
         * @parma Botones de generos Manga
         */
        btnShonnen = new JButton("Shonnen");
        btnShonnen.setBounds(10, 94, 89, 23);
        btnShonnen.setBackground(new Color(144, 238, 144));  
        add(btnShonnen);

        btnSeinen = new JButton("Seinen");
        btnSeinen.setBounds(109, 94, 89, 23);
        btnSeinen.setBackground(new Color(255, 182, 193));  
        add(btnSeinen);

        btnKodomo = new JButton("Kodomo");
        btnKodomo.setBounds(208, 94, 89, 23);
        btnKodomo.setBackground(new Color(173, 216, 230));  
        add(btnKodomo);

        btnShojo = new JButton("Shojo");
        btnShojo.setBounds(10, 148, 89, 23);
        btnShojo.setBackground(new Color(255, 165, 0)); 
        add(btnShojo);

        btnJosei = new JButton("Josei");
        btnJosei.setBounds(109, 148, 89, 23);
        btnJosei.setBackground(new Color(255, 69, 0));  
        add(btnJosei);

        btnEcchi = new JButton("Ecchi");
        btnEcchi.setBounds(208, 148, 89, 23);
        btnEcchi.setBackground(new Color(255, 99, 71));  
        add(btnEcchi);

        /**
         * Botón Registrarse
         */
        btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnRegistrarse.setBounds(340, 218, 107, 23);
        btnRegistrarse.setBackground(new Color(0, 191, 255));  
        add(btnRegistrarse);

        /**
         *  Etiqueta Generos de Manga
         */
        lblGeneros = new JLabel("Géneros de Manga");
        lblGeneros.setBounds(10, 69, 117, 14);
        add(lblGeneros);

        /**
         *  Etiqueta del título
         */
        txtTitulo = new JLabel("ReadMangax");
        txtTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        txtTitulo.setBounds(10, 11, 117, 23);
        add(txtTitulo);
    }
}
