package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import proyectopoo.TPV;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Menu extends JFrame implements ActionListener {

	private JLabel lblMenDeOpciones;
	private JButton btnRegistrarProducto;
	private JButton btnVender;
	private JButton btnSalir;
	private TPV puntoventa;

	private VentaV ventanaVenta;
	private Registro ventanaRegistro;

	private JPanel contenedor;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		puntoventa = new TPV();
		ventanaRegistro = new Registro(this, puntoventa);
		ventanaVenta = new VentaV(this, puntoventa);
		initialize();
	}

	/**
	 * Initialize the contents of the
	 */
	private void initialize() {
		setBounds(100, 100, 1080, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		contenedor = (JPanel) this.getContentPane();
		getContentPane().setLayout(null);

		lblMenDeOpciones = new JLabel("Menú de opciones");
		lblMenDeOpciones.setForeground(Color.WHITE);

		lblMenDeOpciones.setBounds(306, 10, 457, 150);
		lblMenDeOpciones.setFont(new Font("Tahoma", Font.BOLD, 50));
		getContentPane().add(lblMenDeOpciones);

		btnRegistrarProducto = new JButton("Registrar Producto");
		btnRegistrarProducto.setForeground(Color.BLACK);
		btnRegistrarProducto.setBackground(Color.LIGHT_GRAY);
		btnRegistrarProducto.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnRegistrarProducto.setBounds(380, 200, 300, 100);
		getContentPane().add(btnRegistrarProducto);

		btnVender = new JButton("Vender");
		btnVender.setForeground(Color.BLACK);
		btnVender.setBackground(Color.LIGHT_GRAY);
		btnVender.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVender.setBounds(380, 380, 300, 100);
		getContentPane().add(btnVender);

		btnSalir = new JButton("Salir");
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setBackground(Color.LIGHT_GRAY);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSalir.setBounds(870, 590, 160, 60);
		getContentPane().add(btnSalir);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/proyectopoo/fondo.jpg")));
		lblNewLabel.setBounds(0, 0, 1080, 720);
		getContentPane().add(lblNewLabel);

		btnRegistrarProducto.addActionListener(this);
		btnVender.addActionListener(this);
		btnSalir.addActionListener(this);
	}

	public void rePaint() {
		setContentPane(contenedor);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrarProducto) {
			setContentPane(ventanaRegistro);
			validate();
		}
		if (e.getSource() == btnVender) {
			setContentPane(ventanaVenta);
			validate();
		}
		if (e.getSource() == btnSalir) {
			dispose();
		}
	}

}
