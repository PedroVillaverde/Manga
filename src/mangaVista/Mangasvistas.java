package mangaVista;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import java.awt.Font;

public class Mangasvistas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Mangasvistas() {
		setFont(null);
		setBackground(new Color(0, 255, 64));
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 487, 314);
	        SpringLayout springLayout = new SpringLayout();
	        getContentPane().setLayout(springLayout);
	        
	        JButton btnNewButton = new JButton("Enter");
	        getContentPane().add(btnNewButton);
	        
	        JLabel lblNewLabel = new JLabel("Buscar");
	        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, -4, SpringLayout.NORTH, lblNewLabel);
	        springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
	        springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -200, SpringLayout.SOUTH, getContentPane());
	        getContentPane().add(lblNewLabel);
	        
	        textField = new JTextField();
	        springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 24, SpringLayout.EAST, textField);
	        springLayout.putConstraint(SpringLayout.NORTH, textField, -3, SpringLayout.NORTH, lblNewLabel);
	        springLayout.putConstraint(SpringLayout.WEST, textField, 8, SpringLayout.EAST, lblNewLabel);
	        getContentPane().add(textField);
	        textField.setColumns(10);
	        
	        JButton btnNewButton_1 = new JButton("Shonnen");
	        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 30, SpringLayout.SOUTH, textField);
	        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, lblNewLabel);
	        getContentPane().add(btnNewButton_1);
	        
	        JButton btnNewButton_2 = new JButton("Seinen");
	        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 0, SpringLayout.NORTH, btnNewButton_1);
	        springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, -263, SpringLayout.EAST, getContentPane());
	        getContentPane().add(btnNewButton_2);
	        
	        JButton btnNewButton_3 = new JButton("Kodomo");
	        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_3, 0, SpringLayout.NORTH, btnNewButton_1);
	        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_3, 19, SpringLayout.EAST, btnNewButton_2);
	        getContentPane().add(btnNewButton_3);
	        
	        JLabel txtNombre = new JLabel("ReadMangax");
	        springLayout.putConstraint(SpringLayout.WEST, txtNombre, 10, SpringLayout.WEST, getContentPane());
	        txtNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
	        springLayout.putConstraint(SpringLayout.NORTH, txtNombre, 0, SpringLayout.NORTH, getContentPane());
	        getContentPane().add(txtNombre);
	        
	        JButton btnNewButton_4 = new JButton("Shojo");
	        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_4, 43, SpringLayout.SOUTH, btnNewButton_1);
	        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_4, 0, SpringLayout.WEST, lblNewLabel);
	        getContentPane().add(btnNewButton_4);
	        
	        JButton btnNewButton_5 = new JButton("Josei");
	        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_5, 0, SpringLayout.NORTH, btnNewButton_4);
	        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_5, 0, SpringLayout.WEST, btnNewButton_2);
	        getContentPane().add(btnNewButton_5);
	        
	        JButton btnNewButton_6 = new JButton("Ecchi");
	        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_6, 0, SpringLayout.NORTH, btnNewButton_4);
	        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_6, 0, SpringLayout.WEST, btnNewButton_3);
	        getContentPane().add(btnNewButton_6);
	}
	public JLabel gettxtNombre() {
        return gettxtNombre();
    }
}
