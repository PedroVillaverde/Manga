package mangaLook;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
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

        setBackground(new Color(173, 216, 230));  

        btnEnter = new JButton("Enter");
        btnEnter.setBounds(254, 44, 89, 23);
        btnEnter.setBackground(new Color(135, 206, 250));  
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

        txtNombre = new JLabel("ReadMangax");
        txtNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtNombre.setBounds(10, 11, 117, 23);
        add(txtNombre);
    }
}
