package readMangax;

import java.awt.EventQueue;

public class ReadMangax{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					misvistas frame = new misvistas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}}
