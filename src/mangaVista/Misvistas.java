package mangaVista;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Misvistas extends JFrame {

	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel txtNombre; 
	JButton btnNewButton;
	JButton btnNewButton_1;

	/**
	 * Create the frame.
	 */
	public Misvistas() {
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 450, 300);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	        setContentPane(contentPane);
	        contentPane.setLayout(new BorderLayout(0, 0));

	        txtNombre = new JLabel("ReadMangax"); 
	        contentPane.add(txtNombre, BorderLayout.NORTH);

	         btnNewButton = new JButton("Boton1");
	         btnNewButton.addActionListener(new ActionListener() {
	         	public void actionPerformed(ActionEvent e) {
	         		System.out.println("Hola a todos");
	         	}
	         });
	        contentPane.add(btnNewButton, BorderLayout.CENTER);

	         btnNewButton_1 = new JButton("Boton2");
	         btnNewButton_1.addActionListener(new ActionListener() {
	         	public void actionPerformed(ActionEvent e) {
	         		System.out.println("Estas pulsando el Boton 2");
	         	}
	         });
	        contentPane.add(btnNewButton_1, BorderLayout.EAST);
	}
	public JLabel gettxtNombre() {
        return txtNombre;
    }
}
