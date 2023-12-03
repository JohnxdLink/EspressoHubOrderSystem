package orderSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MainWindow {
	/*
	 * Project       : EspressoHub Order System Version 1.0
	 * Developer     : Castro John Christian
	 * Message       : This is just a simple order system
	 * Date Created  : 12/02/2023
	 * */
	private JFrame frmEspressohub;
	double getBlkCoffee = 0, getLatte = 0, getCappuccino = 0, getAmericano = 0, getEspresso = 0;
	double subBlkCoffee = 0, subLatte = 0, subCappuccino = 0, subAmericano = 0, subEspresso = 0;
	int cntBlkCoffee = 0, cntLatte = 0, cntCappuccino = 0, cntAmericano = 0, cntEspresso = 0;
	double allTotal = 0;
	double userBudget = 0, userChange = 0;
	private JTextField TxtF_Budget;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmEspressohub.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainWindow() {
		initialize();
	}

	
	private void initialize() {
		// Instantiating Created Object
		GetCoffeePrice objPrice = new GetCoffeePrice();
		
		frmEspressohub = new JFrame();
		frmEspressohub.setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/orderSystem/images/coffees/Espresso Coffee Price.PNG")));
		frmEspressohub.getContentPane().setBackground(new Color(244, 164, 96));
		frmEspressohub.setTitle("EspressoHub");
		frmEspressohub.setResizable(false);
		frmEspressohub.setBounds(100, 100, 885, 550);
		frmEspressohub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEspressohub.setLocationRelativeTo(null);
		frmEspressohub.getContentPane().setLayout(null);
		
		JPanel Pnl_Header = new JPanel();
		Pnl_Header.setBackground(new Color(255, 127, 80));
		Pnl_Header.setBounds(0, 0, 874, 39);
		frmEspressohub.getContentPane().add(Pnl_Header);
		
		JLabel Lbl_Header = new JLabel("EsspressoHub");
		Lbl_Header.setForeground(new Color(139, 69, 19));
		Lbl_Header.setFont(new Font("Tahoma", Font.BOLD, 24));
		Pnl_Header.add(Lbl_Header);
		
		JLabel Lbl_Black = new JLabel("");
		Lbl_Black.setIcon(new ImageIcon(MainWindow.class.getResource("/orderSystem/images/coffees/Black Coffee Price.PNG")));
		Lbl_Black.setBounds(20, 62, 130, 138);
		frmEspressohub.getContentPane().add(Lbl_Black);
		
		JLabel Lbl_Espresso = new JLabel("");
		Lbl_Espresso.setIcon(new ImageIcon(MainWindow.class.getResource("/orderSystem/images/coffees/Espresso Coffee Price.PNG")));
		Lbl_Espresso.setBounds(580, 62, 130, 138);
		frmEspressohub.getContentPane().add(Lbl_Espresso);
		
		JLabel Lbl_Latte = new JLabel("");
		Lbl_Latte.setIcon(new ImageIcon(MainWindow.class.getResource("/orderSystem/images/coffees/Latte Coffee Price.PNG")));
		Lbl_Latte.setBounds(160, 62, 130, 138);
		frmEspressohub.getContentPane().add(Lbl_Latte);
		
		JLabel Lbl_Cappuccino = new JLabel("");
		Lbl_Cappuccino.setIcon(new ImageIcon(MainWindow.class.getResource("/orderSystem/images/coffees/Cappuccino Coffee Price.PNG")));
		Lbl_Cappuccino.setBounds(300, 62, 130, 138);
		frmEspressohub.getContentPane().add(Lbl_Cappuccino);
		
		JLabel Lbl_Americano = new JLabel("");
		Lbl_Americano.setIcon(new ImageIcon(MainWindow.class.getResource("/orderSystem/images/coffees/Americano Coffee Price.PNG")));
		Lbl_Americano.setBounds(440, 62, 130, 138);
		frmEspressohub.getContentPane().add(Lbl_Americano);
		
		JLabel Lbl_Empty = new JLabel("");
		Lbl_Empty.setIcon(new ImageIcon(MainWindow.class.getResource("/orderSystem/images/coffees/Empty Price.PNG")));
		Lbl_Empty.setBounds(720, 62, 130, 138);
		frmEspressohub.getContentPane().add(Lbl_Empty);
		JButton Btn_Coffee = new JButton("Coffee");
		
		Btn_Coffee.setForeground(new Color(255, 255, 255));
		Btn_Coffee.setBackground(new Color(139, 69, 19));
		Btn_Coffee.setToolTipText("Black Coffee");
		Btn_Coffee.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_Coffee.setBounds(20, 211, 130, 35);
		frmEspressohub.getContentPane().add(Btn_Coffee);
		
		JButton Btn_Latte = new JButton("Latte");		
		Btn_Latte.setToolTipText("Black Coffee");
		Btn_Latte.setForeground(Color.WHITE);
		Btn_Latte.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_Latte.setBackground(new Color(139, 69, 19));
		Btn_Latte.setBounds(160, 211, 130, 35);
		frmEspressohub.getContentPane().add(Btn_Latte);
		
		JButton Btn_Cappuccino = new JButton("Cappuccino");		
		Btn_Cappuccino.setToolTipText("Black Coffee");
		Btn_Cappuccino.setForeground(Color.WHITE);
		Btn_Cappuccino.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_Cappuccino.setBackground(new Color(139, 69, 19));
		Btn_Cappuccino.setBounds(300, 211, 130, 35);
		frmEspressohub.getContentPane().add(Btn_Cappuccino);
		
		JButton Btn_Americano = new JButton("Americano");
		
		Btn_Americano.setToolTipText("Black Coffee");
		Btn_Americano.setForeground(Color.WHITE);
		Btn_Americano.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_Americano.setBackground(new Color(139, 69, 19));
		Btn_Americano.setBounds(440, 211, 130, 35);
		frmEspressohub.getContentPane().add(Btn_Americano);
		
		JButton Btn_Espresso = new JButton("Espresso");		
		Btn_Espresso.setToolTipText("Black Coffee");
		Btn_Espresso.setForeground(Color.WHITE);
		Btn_Espresso.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_Espresso.setBackground(new Color(139, 69, 19));
		Btn_Espresso.setBounds(580, 211, 130, 35);
		frmEspressohub.getContentPane().add(Btn_Espresso);
		
		JButton Btn_Coming = new JButton("Coming Soon");
		Btn_Coming.setEnabled(false);
		Btn_Coming.setToolTipText("Black Coffee");
		Btn_Coming.setForeground(Color.WHITE);
		Btn_Coming.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_Coming.setBackground(new Color(139, 69, 19));
		Btn_Coming.setBounds(720, 211, 130, 35);
		frmEspressohub.getContentPane().add(Btn_Coming);
		
		JLabel Lbl_Qty_Num = new JLabel("QUANTITY: 00.00");
		Lbl_Qty_Num.setForeground(new Color(139, 69, 19));
		Lbl_Qty_Num.setFont(new Font("Tahoma", Font.BOLD, 14));
		Lbl_Qty_Num.setBounds(20, 245, 130, 35);
		frmEspressohub.getContentPane().add(Lbl_Qty_Num);
		
		JLabel Lbl_Total = new JLabel("TOTAL: 00.00");
		Lbl_Total.setForeground(new Color(139, 69, 19));
		Lbl_Total.setFont(new Font("Tahoma", Font.BOLD, 14));
		Lbl_Total.setBounds(20, 289, 123, 39);
		frmEspressohub.getContentPane().add(Lbl_Total);
		
		JLabel Lbl_SubTotal = new JLabel("SUB TOTAL: 00.00");
		Lbl_SubTotal.setForeground(new Color(139, 69, 19));
		Lbl_SubTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		Lbl_SubTotal.setBounds(20, 269, 183, 35);
		frmEspressohub.getContentPane().add(Lbl_SubTotal);
		
		JLabel lblNewLabel = new JLabel("ENTER BUDGET:");
		lblNewLabel.setForeground(new Color(139, 69, 19));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 328, 93, 14);
		frmEspressohub.getContentPane().add(lblNewLabel);
		
		TxtF_Budget = new JTextField();
		TxtF_Budget.setText("00.00");
		TxtF_Budget.setForeground(new Color(255, 255, 255));
		TxtF_Budget.setBackground(new Color(160, 82, 45));
		TxtF_Budget.setFont(new Font("Tahoma", Font.BOLD, 14));
		TxtF_Budget.setBounds(20, 345, 130, 23);
		frmEspressohub.getContentPane().add(TxtF_Budget);
		TxtF_Budget.setColumns(10);
		
		JButton Btn_Budget = new JButton("Enter");		
		Btn_Budget.setForeground(new Color(240, 248, 255));
		Btn_Budget.setBackground(new Color(255, 127, 80));
		Btn_Budget.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_Budget.setBounds(61, 371, 89, 23);
		frmEspressohub.getContentPane().add(Btn_Budget);
		
		JLabel Lbl_Icon_Notify = new JLabel("");
		Lbl_Icon_Notify.setIcon(new ImageIcon(MainWindow.class.getResource("/orderSystem/images/icons/Notification.png")));
		Lbl_Icon_Notify.setBounds(20, 457, 30, 30);
		frmEspressohub.getContentPane().add(Lbl_Icon_Notify);
		
		JLabel Lbl_Notify = new JLabel("NOTIFICATION");
		Lbl_Notify.setForeground(new Color(160, 82, 45));
		Lbl_Notify.setFont(new Font("Tahoma", Font.BOLD, 14));
		Lbl_Notify.setBounds(61, 468, 229, 14);
		frmEspressohub.getContentPane().add(Lbl_Notify);
		
		JLabel Lbl_Change = new JLabel("CHANGE: 00.00");
		Lbl_Change.setForeground(new Color(139, 69, 19));
		Lbl_Change.setFont(new Font("Tahoma", Font.BOLD, 14));
		Lbl_Change.setBounds(20, 417, 130, 14);
		frmEspressohub.getContentPane().add(Lbl_Change);
		
		JButton Btn_Receipt = new JButton("RECEIPT");	
		Btn_Receipt.setEnabled(false);
		Btn_Receipt.setToolTipText("Black Coffee");
		Btn_Receipt.setForeground(Color.WHITE);
		Btn_Receipt.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_Receipt.setBackground(new Color(139, 69, 19));
		Btn_Receipt.setBounds(729, 466, 130, 35);
		frmEspressohub.getContentPane().add(Btn_Receipt);
		
		Btn_Coffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getBlkCoffee = objPrice.getBlkCoffeePrice();
				cntBlkCoffee++;
				
				subBlkCoffee += getBlkCoffee;
				allTotal += getBlkCoffee;
				
				Lbl_Qty_Num.setText("QUANTITY: " + Integer.toString(cntBlkCoffee));
				Lbl_SubTotal.setText("SUB TOTAL: " + String.format("%.2f", subBlkCoffee));
				Lbl_Total.setText("TOTAL: " + String.format("%.2f", allTotal));
			}
		});
		
		Btn_Latte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getLatte = objPrice.getLattePrice();
				cntLatte++;
				
				subLatte += getLatte;
				allTotal += getLatte;
				
				Lbl_Qty_Num.setText("QUANTITY: " + Integer.toString(cntLatte));
				Lbl_SubTotal.setText("SUB TOTAL: " + String.format("%.2f", subLatte));
				Lbl_Total.setText("TOTAL: " + String.format("%.2f", allTotal));
			}
		});
		
		Btn_Cappuccino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getCappuccino = objPrice.getCappuccinoPrice();
				cntCappuccino++;
				
				subCappuccino += getCappuccino;
				allTotal += getCappuccino;
				
				Lbl_Qty_Num.setText("QUANTITY: " + Integer.toString(cntCappuccino));
				Lbl_SubTotal.setText("SUB TOTAL: " + String.format("%.2f", subCappuccino));
				Lbl_Total.setText("TOTAL: " + String.format("%.2f", allTotal));
			}
		});
		
		Btn_Americano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAmericano = objPrice.getAmericanoPrice();
				cntAmericano++;
				
				subAmericano += getAmericano;
				allTotal += getAmericano;
				
				Lbl_Qty_Num.setText("QUANTITY: " + Integer.toString(cntAmericano));
				Lbl_SubTotal.setText("SUB TOTAL: " + String.format("%.2f", subAmericano));
				Lbl_Total.setText("TOTAL: " + String.format("%.2f", allTotal));
			}
		});
		
		Btn_Espresso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getEspresso = objPrice.getEspressoPrice();
				cntEspresso++;
				
				subEspresso += getEspresso;
				allTotal += getEspresso;
				
				Lbl_Qty_Num.setText("QUANTITY: " + Integer.toString(cntEspresso));
				Lbl_SubTotal.setText("SUB TOTAL: " + String.format("%.2f", subEspresso));
				Lbl_Total.setText("TOTAL: " + String.format("%.2f", allTotal));
			}
		});	
		
		Btn_Budget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String budgetText = TxtF_Budget.getText();
				
				try {
					userBudget = Integer.parseInt(budgetText);
					
					if(allTotal < userBudget) {
						userChange = userBudget - allTotal;
						
						Lbl_Change.setText("CHANGE: " + String.format("%.2f", userChange));
						Lbl_Notify.setForeground(new Color(0, 255, 0));
						Lbl_Notify.setText("PAID SUCCESSFULLY");
						
						Btn_Receipt.setEnabled(true);
					} else {
						Lbl_Notify.setForeground(new Color(255, 0, 0));
						Lbl_Notify.setText("NOT ENOUGH BUDGET");
					}
					
				} catch(NumberFormatException ex) {
					Lbl_Notify.setForeground(new Color(255, 0, 0));
					Lbl_Notify.setText("Invalid Input");
				}
								
			}
		});
		
		Btn_Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OfficialReceipt.displayReceipt(frmEspressohub ,cntBlkCoffee, cntLatte, cntCappuccino, cntAmericano, cntEspresso, subBlkCoffee, subLatte, subCappuccino, subAmericano, subEspresso, allTotal, userBudget, userChange);
			}
		});
	}
}
