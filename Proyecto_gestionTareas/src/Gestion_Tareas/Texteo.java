package Gestion_Tareas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JSpinnerDateEditor;

import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import com.toedter.calendar.JCalendar;
import java.util.Date;
import com.toedter.calendar.IDateEditor;
import javax.swing.DefaultComboBoxModel;

public class Texteo extends JFrame {

	private JPanel contentPane;
	private JTextField txtCreaTuTarea;
	private JTextField textMateria;
	private JTextField txtProfWiliam;
	private JTextField textCodigo;
	private JTextField txtEstadistica;
	private JTextField txtProfJuanPerez;
	private JTextField textCodigo_2;
	private JTextField txtDashboard;
	private JTextField txtBienvenidoATus;
	private JTextField textTitulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Texteo frame = new Texteo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Texteo() {
		getContentPane().setForeground(new Color(0, 0, 0));
		setBounds(100, 100, 589, 512);
		
		/*pone la ventana en el Centro de la pantalla*/
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 573, 436);
		contentPane.add(tabbedPane);
		
		JPanel panelTareas = new JPanel();
		panelTareas.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Tareas", null, panelTareas, null);
		panelTareas.setLayout(null);
		
		JPanel panelDescripcion = new JPanel();
		panelDescripcion.setBackground(new Color(190, 233, 232));
		panelDescripcion.setBounds(10, 59, 348, 325);
		panelTareas.add(panelDescripcion);
		panelDescripcion.setLayout(null);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Creacion exitosa");
			}
		});
		btnCrear.setBounds(134, 273, 89, 23);
		btnCrear.setBackground(new Color(99, 203, 201));
		panelDescripcion.add(btnCrear);
		
		JLabel Estado = new JLabel("Estado:");
		Estado.setBounds(225, 33, 55, 18);
		panelDescripcion.add(Estado);
		Estado.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JLabel Descripcion = new JLabel("Descripcion:");
		Descripcion.setBounds(10, 18, 86, 18);
		panelDescripcion.add(Descripcion);
		Descripcion.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JLabel FechaDe = new JLabel("Fecha de");
		FechaDe.setBounds(10, 201, 86, 18);
		panelDescripcion.add(FechaDe);
		FechaDe.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JLabel Vencicmiento = new JLabel("vencimiento:");
		Vencicmiento.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		Vencicmiento.setBounds(10, 216, 86, 18);
		panelDescripcion.add(Vencicmiento);
		
		JDateChooser dateChooserVencimiento = new JDateChooser(null, null, null,
				  new JSpinnerDateEditor());
		dateChooserVencimiento.setToolTipText("gjg");
		dateChooserVencimiento.setBounds(106, 214, 132, 20);
		panelDescripcion.add(dateChooserVencimiento);
		
		JTextArea textDescripcion = new JTextArea();
		textDescripcion.setBounds(10, 40, 187, 150);
		panelDescripcion.add(textDescripcion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pendiente", "Completo", "Proceso"}));
		comboBox.setBounds(225, 62, 100, 22);
		panelDescripcion.add(comboBox);
		
		JLabel Imagen = new JLabel("");
		Imagen.setIcon(new ImageIcon(Texteo.class.getResource("/img/Tareas_2.jpg")));
		Imagen.setBounds(385, 127, 153, 194);
		panelTareas.add(Imagen);
		
		txtCreaTuTarea = new JTextField();
		txtCreaTuTarea.setBackground(new Color(102, 204, 204));
		txtCreaTuTarea.setFont(new Font("Bahnschrift", Font.BOLD, 17));
		txtCreaTuTarea.setHorizontalAlignment(SwingConstants.CENTER);
		txtCreaTuTarea.setDropMode(DropMode.INSERT);
		txtCreaTuTarea.setText("Crea tu Tarea");
		txtCreaTuTarea.setEditable(false);
		txtCreaTuTarea.setBounds(0, 11, 568, 37);
		panelTareas.add(txtCreaTuTarea);
		txtCreaTuTarea.setColumns(10);
		
		JPanel panelMaterias = new JPanel();
		panelMaterias.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Materias", null, panelMaterias, null);
		panelMaterias.setLayout(null);
		
		JPanel panelMatematica = new JPanel();
		panelMatematica.setLayout(null);
		panelMatematica.setBackground(new Color(102, 204, 204));
		panelMatematica.setBounds(20, 42, 389, 154);
		panelMaterias.add(panelMatematica);
		
		JLabel lblMateria = new JLabel("Materia:");
		lblMateria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMateria.setForeground(Color.WHITE);
		lblMateria.setBounds(10, 99, 54, 14);
		panelMatematica.add(lblMateria);
		
		textMateria = new JTextField();
		textMateria.setEditable(false);
		textMateria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textMateria.setText("Programacion Orientada a Objetos");
		textMateria.setColumns(10);
		textMateria.setBounds(85, 97, 186, 20);
		panelMatematica.add(textMateria);
		
		JLabel horario = new JLabel("Horario :");
		horario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		horario.setForeground(Color.WHITE);
		horario.setBounds(10, 41, 64, 14);
		panelMatematica.add(horario);
		
		JLabel profesor = new JLabel("Profesor:");
		profesor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		profesor.setForeground(Color.WHITE);
		profesor.setBounds(10, 72, 64, 14);
		panelMatematica.add(profesor);
		
		txtProfWiliam = new JTextField();
		txtProfWiliam.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtProfWiliam.setEditable(false);
		txtProfWiliam.setText("Prof. Wiliam Paredes ");
		txtProfWiliam.setColumns(10);
		txtProfWiliam.setBounds(85, 70, 186, 20);
		panelMatematica.add(txtProfWiliam);
		
		JLabel codigo = new JLabel("Codigo:");
		codigo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		codigo.setForeground(Color.WHITE);
		codigo.setBounds(10, 14, 54, 14);
		panelMatematica.add(codigo);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(85, 11, 186, 20);
		panelMatematica.add(textCodigo);
		
		JDateChooser dateChooserMateriaProgramacion = new JDateChooser(null, null, null,
				  new JSpinnerDateEditor());
		dateChooserMateriaProgramacion.setBounds(85, 41, 186, 20);
		panelMatematica.add(dateChooserMateriaProgramacion);
		
		JButton btnProgramacion = new JButton("Enviar");
		btnProgramacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Materia enviada");
			}
		});
		btnProgramacion.setBackground(new Color(153, 204, 102));
		btnProgramacion.setBounds(290, 69, 89, 23);
		panelMatematica.add(btnProgramacion);
		
		JPanel panelComunicacion = new JPanel();
		panelComunicacion.setBounds(20, 207, 389, 156);
		panelMaterias.add(panelComunicacion);
		panelComunicacion.setLayout(null);
		panelComunicacion.setBackground(new Color(153, 204, 204));
		
		JLabel lblMateria_1 = new JLabel("Materia:");
		lblMateria_1.setForeground(new Color(0, 0, 0));
		lblMateria_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMateria_1.setBounds(10, 99, 54, 14);
		panelComunicacion.add(lblMateria_1);
		
		txtEstadistica = new JTextField();
		txtEstadistica.setText("Estadistica II");
		txtEstadistica.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtEstadistica.setEditable(false);
		txtEstadistica.setColumns(10);
		txtEstadistica.setBounds(85, 97, 189, 20);
		panelComunicacion.add(txtEstadistica);
		
		JLabel horario_2 = new JLabel("Horario :");
		horario_2.setForeground(new Color(0, 0, 0));
		horario_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		horario_2.setBounds(10, 41, 64, 14);
		panelComunicacion.add(horario_2);
		
		JLabel profesor_1 = new JLabel("Profesor:");
		profesor_1.setForeground(new Color(0, 0, 0));
		profesor_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		profesor_1.setBounds(10, 72, 64, 14);
		panelComunicacion.add(profesor_1);
		
		txtProfJuanPerez = new JTextField();
		txtProfJuanPerez.setText("Prof. Juan Perez");
		txtProfJuanPerez.setEditable(false);
		txtProfJuanPerez.setColumns(10);
		txtProfJuanPerez.setBounds(85, 70, 189, 20);
		panelComunicacion.add(txtProfJuanPerez);
		
		JLabel codigo_2 = new JLabel("Codigo:");
		codigo_2.setForeground(new Color(0, 0, 0));
		codigo_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		codigo_2.setBounds(10, 14, 54, 14);
		panelComunicacion.add(codigo_2);
		
		textCodigo_2 = new JTextField();
		textCodigo_2.setColumns(10);
		textCodigo_2.setBounds(85, 11, 189, 20);
		panelComunicacion.add(textCodigo_2);
		
		JDateChooser dateChooserMateriaEstadistica = new JDateChooser(null, null, null,
				  new JSpinnerDateEditor());
		dateChooserMateriaEstadistica.setBounds(85, 35, 189, 20);
		panelComunicacion.add(dateChooserMateriaEstadistica);
		
		JButton btnEstadistica = new JButton("Enviar");
		btnEstadistica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Materia enviada");
			}
		});
		btnEstadistica.setBackground(new Color(153, 204, 102));
		btnEstadistica.setBounds(290, 69, 89, 23);
		panelComunicacion.add(btnEstadistica);
		
		txtDashboard = new JTextField();
		txtDashboard.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		txtDashboard.setForeground(new Color(255, 255, 255));
		txtDashboard.setBackground(new Color(51, 153, 204));
		txtDashboard.setText("Dashboard");
		txtDashboard.setBounds(0, 0, 571, 31);
		panelMaterias.add(txtDashboard);
		txtDashboard.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Texteo.class.getResource("/img/educacion-en-linea1.png")));
		lblNewLabel.setBounds(408, 125, 160, 185);
		panelMaterias.add(lblNewLabel);
		
		JPanel panelNotas = new JPanel();
		panelNotas.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Notas", null, panelNotas, null);
		panelNotas.setLayout(null);
		
		txtBienvenidoATus = new JTextField();
		txtBienvenidoATus.setHorizontalAlignment(SwingConstants.CENTER);
		txtBienvenidoATus.setFont(new Font("Bahnschrift", Font.PLAIN, 19));
		txtBienvenidoATus.setBackground(new Color(121, 213, 133));
		txtBienvenidoATus.setEditable(false);
		txtBienvenidoATus.setText("BIENVENIDO A TUS NOTAS");
		txtBienvenidoATus.setBounds(0, 0, 568, 39);
		panelNotas.add(txtBienvenidoATus);
		txtBienvenidoATus.setColumns(10);
		
		JPanel diseño = new JPanel();
		diseño.setLayout(null);
		diseño.setBackground(new Color(196, 228, 194));
		diseño.setBounds(25, 68, 521, 292);
		panelNotas.add(diseño);
		
		JLabel Titulo = new JLabel("Titulo:");
		Titulo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		Titulo.setBounds(49, 12, 53, 14);
		diseño.add(Titulo);
		
		textTitulo = new JTextField();
		textTitulo.setColumns(10);
		textTitulo.setBounds(159, 11, 340, 20);
		diseño.add(textTitulo);
		
		JLabel ContenidoNota = new JLabel("Contenido de");
		ContenidoNota.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		ContenidoNota.setBounds(27, 66, 91, 14);
		diseño.add(ContenidoNota);
		
		JLabel Nota = new JLabel("la nota:");
		Nota.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		Nota.setBounds(49, 79, 53, 14);
		diseño.add(Nota);
		
		JLabel FechaCreacion = new JLabel("Fecha de Creacion:");
		FechaCreacion.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		FechaCreacion.setBounds(27, 181, 124, 14);
		diseño.add(FechaCreacion);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nota enviada");
			}
		});
		btnEnviar.setBackground(new Color(136, 208, 147));
		btnEnviar.setBounds(215, 234, 89, 23);
		diseño.add(btnEnviar);
		
		JTextArea textContenidoNota = new JTextArea();
		textContenidoNota.setBounds(159, 63, 340, 87);
		diseño.add(textContenidoNota);
		
		JDateChooser dateChooser = new JDateChooser(null, null, null,
				  new JSpinnerDateEditor());
		dateChooser.setBounds(159, 181, 169, 20);
		diseño.add(dateChooser);
		
		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(Texteo.class.getResource("/img/icons8-list-64.png")));
		imagen.setBounds(408, 161, 64, 96);
		diseño.add(imagen);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Inicio in = new Inicio();
	                in.setLocationRelativeTo(null);

	                in.setVisible(true);
	                dispose();
			}
		});
		btnNewButton.setBackground(new Color(133, 207, 214));
		btnNewButton.setBounds(10, 447, 119, 23);
		contentPane.add(btnNewButton);
	}
}
