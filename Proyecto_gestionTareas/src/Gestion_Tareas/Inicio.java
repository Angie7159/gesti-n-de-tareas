package Gestion_Tareas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setTitle("Gestion De Tareas");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/img/ta.png")));
		setBounds(100, 100, 580, 478);
		
		/*pone la ventana en el Centro de la pantalla*/
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		JMenu Evento = new JMenu("Evento");
		menuBar.add(Evento);
		
		JMenuItem mntmVerEvento = new JMenuItem("Ver evento");
		Evento.add(mntmVerEvento);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelGeneral = new JPanel();
		panelGeneral.setBackground(new Color(255, 255, 255));
		panelGeneral.setBounds(0, 0, 564, 417);
		contentPane.add(panelGeneral);
		panelGeneral.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(33, 255, 138, 132);
		panelGeneral.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Inicio.class.getResource("/img/notas1.jpg")));
		
		JButton btnsSistemaAcademico = new JButton("INGRESAR");
		btnsSistemaAcademico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// para que me envie a la ventana registrarse
                Texteo tex = new Texteo();
                tex.setVisible(true);
                dispose();
            
				
			}
		});
		btnsSistemaAcademico.setBackground(new Color(189, 225, 223));
		btnsSistemaAcademico.setBounds(199, 298, 103, 23);
		panelGeneral.add(btnsSistemaAcademico);
		
		JLabel lblNewLabel_2 = new JLabel("Sistema Academico");
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel_2.setBounds(200, 336, 152, 23);
		panelGeneral.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/img/paisaje.jpg")));
		lblNewLabel.setBounds(0, 0, 563, 229);
		panelGeneral.add(lblNewLabel);
	}
}

