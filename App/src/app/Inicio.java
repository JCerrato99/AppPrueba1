package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JTextArea;

public class Inicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 385, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(40, 130, 79));
		
		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 477, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel foto1 = new JLabel("");
		foto1.setBounds(10, 64, 200, 133);
		foto1.setAlignmentX(Component.CENTER_ALIGNMENT);
		foto1.setLabelFor(foto1);
		foto1.setIcon(new ImageIcon("..\\App\\imagenes\\1366_2000.jpg"));
		
		JTextArea txtInfo1 = new JTextArea();
		txtInfo1.setBounds(203, 81, 156, 112);
		txtInfo1.setEditable(false);
		txtInfo1.setLineWrap(true);
		txtInfo1.setText("Doña Uzeada de Ribera Maldonado de Bracamonte y Anaya era baja, rechoncha, abigotada. Ya no existia razon para llamar talle al suyo.");
		panel_1.setLayout(null);
		panel_1.add(foto1);
		panel_1.add(txtInfo1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("..\\App\\imagenes\\107391_640x428.jpg"));
		lblNewLabel_1.setBounds(206, 290, 141, 100);
		panel_1.add(lblNewLabel_1);
		
		JTextArea txtrDoaUzeadaDe = new JTextArea();
		txtrDoaUzeadaDe.setEditable(false);
		txtrDoaUzeadaDe.setLineWrap(true);
		txtrDoaUzeadaDe.setText("Doña Uzeada de Ribera Maldonado de Bracamonte y Anaya era baja, rechoncha, abigotada. Ya no existia razon para llamar talle al suyo.");
		txtrDoaUzeadaDe.setBounds(10, 278, 186, 112);
		panel_1.add(txtrDoaUzeadaDe);
		
		JLabel foto3 = new JLabel("");
		foto3.setIcon(new ImageIcon("..\\App\\imagenes\\lindo-arreglo-hojas-aceite-oliva-sobre-fondo-blanco_23-2148286009.png"));
		foto3.setBounds(0, 0, 369, 466);
		panel_1.add(foto3);
		
		JLabel lblNewLabel = new JLabel("LA OLIVA");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 32));
		
		JLabel fotoMenu = new JLabel("");
		fotoMenu.setIcon(new ImageIcon("..\\App\\imagenes\\barra-de-menus.png"));
		
		JLabel fotoInicio = new JLabel("");
		fotoInicio.setIcon(new ImageIcon("..\\App\\imagenes\\usuario.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(fotoMenu)
					.addGap(58)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
					.addComponent(fotoInicio))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(fotoMenu, Alignment.TRAILING)
							.addComponent(fotoInicio))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
