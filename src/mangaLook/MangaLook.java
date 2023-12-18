package mangaLook;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class MangaLook extends JPanel {

    public JButton btnEnter;
    public JButton btnShonnen;
    public JButton btnSeinen;
    public JButton btnKodomo;
    public JButton btnShojo;
    public JButton btnJosei;
    public JButton btnEcchi;
    public JLabel lblBuscar;
    public JTextField textField;
    public JLabel txtNombre;

    public MangaLook() {
        setLayout(null);

        btnEnter = new JButton("Enter");
        btnEnter.setBounds(254, 44, 89, 23);
        add(btnEnter);

        lblBuscar = new JLabel("Buscar");
        lblBuscar.setBounds(10, 48, 46, 14);
        add(lblBuscar);

        textField = new JTextField();
        textField.setBounds(66, 45, 178, 20);
        add(textField);
        textField.setColumns(10);

        btnShonnen = new JButton("Shonnen");
        btnShonnen.setBounds(10, 94, 89, 23);
        add(btnShonnen);

        btnSeinen = new JButton("Seinen");
        btnSeinen.setBounds(109, 94, 89, 23);
        add(btnSeinen);

        btnKodomo = new JButton("Kodomo");
        btnKodomo.setBounds(208, 94, 89, 23);
        add(btnKodomo);

        txtNombre = new JLabel("ReadMangax");
        txtNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtNombre.setBounds(10, 11, 117, 23);
        add(txtNombre);

        btnShojo = new JButton("Shojo");
        btnShojo.setBounds(10, 148, 89, 23);
        add(btnShojo);

        btnJosei = new JButton("Josei");
        btnJosei.setBounds(109, 148, 89, 23);
        add(btnJosei);

        btnEcchi = new JButton("Ecchi");
        btnEcchi.setBounds(208, 148, 89, 23);
        add(btnEcchi);
    }
}
