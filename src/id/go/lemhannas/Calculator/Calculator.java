package id.go.lemhannas.Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	public String angka;
		double jumlah, angka1, angka2;
		int pilih;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(32, 11, 349, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		
		btn7.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat("7"));
				angka = textField.getText();
				//angka += "7";
				//textField.setText(angka);
			}
		});
		btn7.setBounds(32, 47, 69, 34);
		contentPane.add(btn7);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				textField.setText(textField.getText().concat("8"));
				angka = textField.getText();
				//textField.setText(angka);
				
			}
		});
		btn8.setBounds(111, 47, 69, 34);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText().concat("9"));
				angka = textField.getText();
				//textField.setText(angka);	
				
				
			}
		});
		btn9.setBounds(193, 47, 69, 34);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText().concat("4"));
				angka = textField.getText();
				//textField.setText(angka);
			}
		});
		btn4.setBounds(32, 109, 69, 34);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText().concat("5"));
				angka = textField.getText();
				//textField.setText(angka);
				
			}
		});
		btn5.setBounds(111, 109, 69, 34);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText().concat("6"));
				angka = textField.getText();
				//textField.setText(angka);
				
			}
		});
		btn6.setBounds(193, 109, 69, 34);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText().concat("1"));
				angka = textField.getText();
				//textField.setText(angka);
				
			}
		});
		btn1.setBounds(32, 171, 69, 34);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText().concat("2"));
				angka = textField.getText();
				//angka = "";
				//textField.setText(angka);
				
			}
		});
		btn2.setBounds(111, 171, 69, 34);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText().concat("3"));
				angka = textField.getText();
				//textField.setText(angka);
				
				
			}
		});
		btn3.setBounds(193, 171, 69, 34);
		contentPane.add(btn3);
		
		JButton btnKoma = new JButton(".");
		btnKoma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText().concat("."));
				//angka += (".");
				angka = textField.getText();
				//textField.setText(angka);
				
			}
		});
		btnKoma.setBounds(32, 228, 69, 34);
		contentPane.add(btnKoma);
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText().concat("0"));
				angka = textField.getText();
				//textField.setText(angka);
				
			}
		});
		btn0.setBounds(111, 228, 69, 34);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText("");
				angka1=0.0;
				angka2=0.0;
				jumlah=0.0;
				angka="";
				
				
			}
		});
		btnC.setBounds(193, 228, 69, 34);
		contentPane.add(btnC);
		
		JButton btnTambah = new JButton("+");
		btnTambah.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				angka1=Double.parseDouble(angka);
				angka="";
				textField.setText(angka);
	
				pilih=1;
				
				
			}
		});
		btnTambah.setBounds(272, 47, 69, 34);
		contentPane.add(btnTambah);
		
		JButton btnKurang = new JButton("-");
		btnKurang.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				angka1=Double.parseDouble(angka);
				textField.setText("-");
				angka="";
				textField.setText(angka);
				
				pilih=2;
				
				}
		});
		btnKurang.setBounds(272, 109, 69, 34);
		contentPane.add(btnKurang);
		
		JButton btnKali = new JButton("X");
		btnKali.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				angka1=Double.parseDouble(angka);
				textField.setText("*");
				angka="";
				textField.setText(angka);
				
				pilih=3;
				
			}
		});
		btnKali.setBounds(272, 171, 69, 34);
		contentPane.add(btnKali);
		
		JButton btnBagi = new JButton("/");
		btnBagi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				angka1=Double.parseDouble(angka);
				textField.setText("/");
				angka="";
				textField.setText(angka);
				
				pilih=4;
				
			}
		});
		btnBagi.setBounds(272, 228, 69, 34);
		contentPane.add(btnBagi);
		
		JButton btnSamaDengan = new JButton("=");
		btnSamaDengan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				angka = textField.getText();
				
				switch(pilih){
		        case 1:
		            angka2 = Double.parseDouble(angka);
		            jumlah = angka1 + angka2;
		            angka = Double.toString(jumlah);
		            textField.setText(angka);
		            break;
		        case 2:
		        	angka2 = Double.parseDouble(angka);
		            jumlah = angka1 - angka2;
		            angka = Double.toString(jumlah);
		            textField.setText(angka);
		            break;
		        case 3:
		            angka2 = Double.parseDouble(angka);
		            jumlah = angka1 * angka2;
		            angka = Double.toString(jumlah);
		            textField.setText(angka);
		            break;
		        case 4:
		            angka2 = Double.parseDouble(angka);
		            jumlah = angka1 / angka2;
		            angka = Double.toString(jumlah);
		            textField.setText(angka);
		            break;
		            default:
		            break;    
			
				}
			}
		});
		btnSamaDengan.setBounds(351, 47, 69, 215);
		contentPane.add(btnSamaDengan);
	}

}
