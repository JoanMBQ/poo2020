package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import proyectopoo.TPV;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Registro extends JPanel {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Menu menu;
	private TPV tpv;

	/**
	 * Launch the application.
	 */
	public Registro(Menu menu, TPV tpv) {
		this.menu = menu;
		this.tpv = tpv;
		initialize();
	}

	/**
	 * Initialize the contents of the
	 */
	public void initialize() {
		setBounds(100, 100, 1080, 720);
		setLayout(null);

		DefaultListModel<String> lmodel = new DefaultListModel<String>();

		JLabel lblRegistroDeProducto = new JLabel("Registro de Producto");
		lblRegistroDeProducto.setForeground(Color.WHITE);
		lblRegistroDeProducto.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblRegistroDeProducto.setBounds(340, 36, 453, 60);
		add(lblRegistroDeProducto);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(103, 145, 70, 23);
		add(lblNombre);

		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCantidad.setBounds(103, 292, 79, 29);
		add(lblCantidad);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecio.setBounds(103, 438, 60, 23);
		add(lblPrecio);

		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(245, 136, 314, 50);
		add(textField);
		textField.setColumns(10);

		JScrollPane jsb = new JScrollPane();
		jsb.setLocation(662, 135);
		jsb.setSize(314, 347);
		add(jsb);
		JList list_1 = new JList(lmodel);
		list_1.setBackground(Color.LIGHT_GRAY);
		jsb.setViewportView(list_1);
		list_1.setLayoutOrientation(JList.VERTICAL);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(Color.LIGHT_GRAY);
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegistrar.setBounds(490, 630, 142, 45);
		add(btnRegistrar);

		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		textField_1.setBounds(245, 286, 314, 50);
		add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setColumns(10);
		textField_2.setBounds(245, 429, 314, 50);
		add(textField_2);

		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVolver.setBounds(10, 11, 104, 45);
		add(btnVolver);

		JLabel lblLosValores = new JLabel("* Los valores de los campos no son correctos. ");
		lblLosValores.setForeground(Color.RED);
		lblLosValores.setBounds(98, 511, 534, 28);
		add(lblLosValores);
		lblLosValores.setVisible(false);

		JLabel lblElCampoCantidad = new JLabel("El campo Cantidad requiere un valor entero");
		lblElCampoCantidad.setForeground(Color.RED);
		lblElCampoCantidad.setBounds(103, 545, 277, 14);
		add(lblElCampoCantidad);
		lblElCampoCantidad.setVisible(false);

		JLabel lblElCampoPrecio = new JLabel("El campo Precio requiere un valor con decimales (por ejemplo 1.5)");
		lblElCampoPrecio.setForeground(Color.RED);
		lblElCampoPrecio.setBounds(103, 569, 421, 14);
		add(lblElCampoPrecio);

		JButton btnBorrarSeleccin = new JButton("Borrar");
		btnBorrarSeleccin.setBackground(Color.LIGHT_GRAY);
		btnBorrarSeleccin.setForeground(Color.BLACK);
		btnBorrarSeleccin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tpv.removeProducto(lmodel.get(list_1.getSelectedIndex()));
				lmodel.remove(list_1.getSelectedIndex());
			}
		});

		btnBorrarSeleccin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBorrarSeleccin.setBounds(662, 493, 163, 41);
		add(btnBorrarSeleccin);

		JButton btnVaciar = new JButton("Vaciar");
		btnVaciar.setBackground(Color.LIGHT_GRAY);
		btnVaciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVaciar.setBounds(859, 493, 117, 41);
		add(btnVaciar);
		setVisible(true);
		lblElCampoPrecio.setVisible(false);

		btnVaciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lmodel.removeAllElements();
			}
		});

		btnVolver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				menu.rePaint();
			}
		});

		btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre;
				int cantidad;
				double precio;
				nombre = textField.getText();
				cantidad = Integer.parseInt(textField_1.getText());
				precio = Double.parseDouble(textField_2.getText());
				int vreturn = tpv.registrarProducto(nombre, cantidad, precio);
				if (vreturn < 0) {
					lblElCampoCantidad.setVisible(true);
					lblElCampoPrecio.setVisible(true);
					lblLosValores.setVisible(true);

				} else
					lmodel.addElement(textField.getText());
				limpiar();
			}
		});
		JLabel fondo = new JLabel("");
		fondo.setForeground(Color.WHITE);
		fondo.setIcon(new ImageIcon(VentaV.class.getResource("/proyectopoo/fondo.jpg")));
		fondo.setBounds(0, 0, 1080, 720);
		add(fondo);

	}

	public void limpiar() {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
	}
}
