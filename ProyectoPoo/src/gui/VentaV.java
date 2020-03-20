package gui;

import java.awt.EventQueue;
import proyectopoo.Venta;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import proyectopoo.LineaVenta;
import proyectopoo.Producto;
import proyectopoo.TPV;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;

public class VentaV extends JPanel {

	private JFrame frame;
	private JTextField textField;
	private Menu menu;
	private TPV tpv;
	private ArrayList<Producto> productos;
	private Venta ventaActual;

	/**
	 * Create the application.
	 */
	public VentaV(Menu menu, TPV tpv) {
		this.menu = menu;
		initialize();
		this.tpv = tpv;

		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDescripcin.setBounds(235, 234, 133, 25);
		add(lblDescripcin);

		JLabel lblUnidades = new JLabel("Unidades");
		lblUnidades.setForeground(Color.WHITE);
		lblUnidades.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUnidades.setBounds(82, 234, 100, 25);
		add(lblUnidades);

		JLabel lblValorUnit = new JLabel("Valor Unit.");
		lblValorUnit.setForeground(Color.WHITE);
		lblValorUnit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblValorUnit.setBounds(741, 234, 114, 25);
		add(lblValorUnit);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(911, 234, 69, 25);
		add(lblTotal);

		JLabel fondo = new JLabel("");
		fondo.setForeground(Color.WHITE);
		fondo.setIcon(new ImageIcon(VentaV.class.getResource("/proyectopoo/fondo.jpg")));
		fondo.setBounds(0, 0, 1080, 720);
		add(fondo);
		ventaActual = new Venta();
	}

	/**
	 * Initialize the contents of the
	 */
	private void initialize() {
		frame = new JFrame();
		setBounds(100, 100, 1080, 720);
		setLayout(null);

		DefaultListModel<String> lm = new DefaultListModel<String>();
		DefaultListModel<String> lm1 = new DefaultListModel<String>();
		DefaultListModel<String> lm2 = new DefaultListModel<String>();
		DefaultListModel<String> lm3 = new DefaultListModel<String>();
		DefaultListModel<String> lm4 = new DefaultListModel<String>();
		DefaultListModel<String> lm5 = new DefaultListModel<String>();
		DefaultListModel<String> lm6 = new DefaultListModel<String>();
		DefaultListModel<String> lm7 = new DefaultListModel<String>();
		DefaultListModel<String> lm8 = new DefaultListModel<String>();
		JLabel lblPuntoDeVenta = new JLabel("Punto de Venta");
		lblPuntoDeVenta.setForeground(Color.WHITE);
		lblPuntoDeVenta.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblPuntoDeVenta.setBounds(359, 14, 334, 64);
		add(lblPuntoDeVenta);

		JLabel lblIngreseElNombre = new JLabel("Ingrese el nombre del producto");
		lblIngreseElNombre.setForeground(Color.WHITE);
		lblIngreseElNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngreseElNombre.setBounds(66, 88, 296, 25);
		add(lblIngreseElNombre);

		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(541, 88, 296, 33);
		add(textField);
		textField.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(Color.LIGHT_GRAY);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscar.setBounds(875, 88, 106, 33);
		add(btnBuscar);

		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setForeground(Color.WHITE);
		lblProducto.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProducto.setBounds(104, 124, 106, 25);
		add(lblProducto);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setBounds(757, 124, 69, 25);
		add(lblPrecio);

		JLabel lblStock = new JLabel("Stock");
		lblStock.setForeground(Color.WHITE);
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStock.setBounds(611, 124, 73, 25);
		add(lblStock);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.RED);
		separator.setBounds(89, 212, 892, 2);
		add(separator);

		JScrollPane jsb = new JScrollPane();
		jsb.setLocation(235, 269);
		jsb.setSize(417, 280);
		JScrollPane jsb1 = new JScrollPane();
		jsb1.setLocation(757, 152);
		jsb1.setSize(106, 50);
		JScrollPane jsb2 = new JScrollPane();
		jsb2.setLocation(611, 152);
		jsb2.setSize(100, 50);
		JScrollPane jsb3 = new JScrollPane();
		jsb3.setLocation(900, 269);
		jsb3.setSize(80, 280);
		JScrollPane jsb4 = new JScrollPane();
		jsb4.setLocation(757, 269);
		jsb4.setSize(80, 280);
		JScrollPane jsb5 = new JScrollPane();
		jsb5.setLocation(105, 269);
		jsb5.setSize(50, 280);
		JScrollPane jsb8 = new JScrollPane();
		jsb8.setLocation(104, 152);
		jsb8.setSize(450, 50);
		add(jsb);

		JList list = new JList(lm);
		jsb.setViewportView(list);
		list.setBackground(Color.LIGHT_GRAY);
		list.setLayoutOrientation(JList.VERTICAL);
		add(jsb1);

		JList list_1 = new JList(lm2);
		jsb1.setViewportView(list_1);
		list_1.setBackground(Color.LIGHT_GRAY);
		list_1.setLayoutOrientation(JList.VERTICAL);
		add(jsb2);

		JList list_2 = new JList(lm3);
		jsb2.setViewportView(list_2);
		list_2.setBackground(Color.LIGHT_GRAY);
		list_2.setLayoutOrientation(JList.VERTICAL);
		add(jsb3);

		JList list_3 = new JList(lm8);
		jsb3.setViewportView(list_3);
		list_3.setBackground(Color.LIGHT_GRAY);
		list_3.setLayoutOrientation(JList.VERTICAL);
		add(jsb4);

		JList list4 = new JList(lm4);
		jsb4.setViewportView(list4);
		list4.setBackground(Color.LIGHT_GRAY);
		list4.setLayoutOrientation(JList.VERTICAL);
		add(jsb5);

		JList list5 = new JList(lm5);
		jsb5.setViewportView(list5);
		list5.setBackground(Color.LIGHT_GRAY);
		list5.setLayoutOrientation(JList.VERTICAL);

		JList list6 = new JList(lm6);
		list6.setBackground(Color.LIGHT_GRAY);
		list6.setBounds(831, 576, 150, 40);
		add(list6);

		JList list7 = new JList(lm7);
		list7.setBackground(Color.LIGHT_GRAY);
		list7.setBounds(831, 630, 150, 40);
		add(list7);

		JLabel lblSutotal = new JLabel("SUBTOTAL");
		lblSutotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSutotal.setBounds(707, 576, 100, 41);
		add(lblSutotal);

		JLabel lblPrecioConIva = new JLabel("TOTAL + IVA");
		lblPrecioConIva.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecioConIva.setBounds(684, 630, 123, 40);
		add(lblPrecioConIva);
		add(jsb8);

		JList listP = new JList(lm1);
		listP.setBackground(Color.LIGHT_GRAY);
		jsb8.setViewportView(listP);

		JLabel lblelProductoYa = new JLabel("*El producto ya fué añadido");
		lblelProductoYa.setForeground(Color.RED);
		lblelProductoYa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblelProductoYa.setBounds(82, 604, 150, 14);
		add(lblelProductoYa);
		lblelProductoYa.setVisible(false);

		JLabel lbllaCantidadDel = new JLabel("*No hay suficiente stock");
		lbllaCantidadDel.setForeground(Color.RED);
		lbllaCantidadDel.setBounds(82, 577, 303, 14);
		add(lbllaCantidadDel);
		lbllaCantidadDel.setVisible(false);

		listP.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				lbllaCantidadDel.setVisible(false);
				lblelProductoYa.setVisible(false);
				int p = listP.getSelectedIndex();
				LineaVenta lv = tpv.hayStock(productos.get(p).getNombre(), 1);
				if (lv == null) {
					lbllaCantidadDel.setVisible(true);
					return;
				}
				if (ventaActual.comprobar(productos.get(p).getNombre())) {
					lblelProductoYa.setVisible(true);
					return;
				}
				ventaActual.addlineaVenta(lv);

				lm.addElement(productos.get(p).getNombre());
				lm5.addElement(Integer.toString(1));
				double sub = ventaActual.getSubTotal();
				double precio = lv.getSubtotal();
				double total = ventaActual.getTotal();
				lm4.addElement(Double.toString(productos.get(p).getPrecio()));
				lm8.addElement(Double.toString(precio));
				lm6.removeAllElements();
				lm7.removeAllElements();
				lm6.addElement(Double.toString(sub));
				lm7.addElement(Double.toString(total));
			}
		});

		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVolver.setBounds(10, 14, 97, 40);
		add(btnVolver);

		JButton btnVender = new JButton("Vender");
		btnVender.setForeground(Color.BLACK);
		btnVender.setBackground(Color.LIGHT_GRAY);
		btnVender.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVender.setBounds(485, 606, 140, 55);
		add(btnVender);

		JButton btnVaciar = new JButton("Vaciar");
		btnVaciar.setBackground(Color.LIGHT_GRAY);
		btnVaciar.setForeground(Color.BLACK);
		btnVaciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVaciar.setBounds(235, 591, 106, 33);
		add(btnVaciar);

		btnVaciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbllaCantidadDel.setVisible(false);
				lblelProductoYa.setVisible(false);
				lm.removeAllElements();
				lm5.removeAllElements();
				lm3.removeAllElements();
				lm4.removeAllElements();
				lm6.removeAllElements();
				lm7.removeAllElements();
				lm8.removeAllElements();
				ventaActual.rmLV();
			}
		});

		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpv.cerrarVenta(ventaActual);
				tpv.addVenta(ventaActual);
				ventaActual.rmLV();
				textField.setText("");
				lm.removeAllElements();
				lm1.removeAllElements();
				lm2.removeAllElements();
				lm3.removeAllElements();
				lm4.removeAllElements();
				lm5.removeAllElements();
				lm6.removeAllElements();
				lm7.removeAllElements();
				lm8.removeAllElements();

				JOptionPane.showMessageDialog(null, "Venta Realizada.");
			}
		});

		btnVolver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				menu.rePaint();
			}
		});

		btnBuscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				productos = (ArrayList<Producto>) tpv.findProductos(textField.getText());
				lm1.removeAllElements();
				lm2.removeAllElements();
				lm3.removeAllElements();
				for (Producto p : productos) {
					lm1.addElement(p.getNombre());
					lm2.addElement(Double.toString(p.getPrecio()));
					lm3.addElement(Integer.toString(p.getCantidad()));
				}

			}
		});

		list5.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				lbllaCantidadDel.setVisible(false);
				lblelProductoYa.setVisible(false);
				String a = JOptionPane.showInputDialog(null, "Ingrese la cantidad a vender.");
				if (a == null || a.equals(""))
					return;
				double precio;
				double sub;
				double total;
				int index = list5.getSelectedIndex();
				if (Integer.parseInt(a) < 0) {
					JOptionPane.showMessageDialog(null, "No se puede ingresar valores negativos.");
					return;
				}
				if (Integer.parseInt(a) == 0) {
					ventaActual.removeLV(index);
					sub = ventaActual.getSubTotal();
					total = ventaActual.getTotal();
					lm5.remove(index);
					lm.remove(index);
					lm4.remove(index);
					lm8.remove(index);
					lm6.removeAllElements();
					lm7.removeAllElements();
					lm6.addElement(Double.toString(sub));
					lm7.addElement(Double.toString(total));

				}
				LineaVenta lv = tpv.hayStock(lm.get(index), Integer.parseInt(a));
				if (lv == null) {
					lbllaCantidadDel.setVisible(true);
					JOptionPane.showMessageDialog(null, "No hay suficiente stock.");
					return;
				}
				ventaActual.modifyLine(index, Integer.parseInt(a));
				precio = Integer.parseInt(a) * Double.parseDouble(lm4.get(index));
				sub = ventaActual.getSubTotal();
				total = ventaActual.getTotal();
				lm5.remove(index);
				lm5.insertElementAt(a, index);
				lm4.addElement(lm4.get(index));
				lm4.remove(index);
				lm8.remove(index);
				lm8.addElement(Double.toString(precio));
				lm6.removeAllElements();
				lm7.removeAllElements();
				lm6.addElement(Double.toString(sub));
				lm7.addElement(Double.toString(total));
			}
		});

	}

}
