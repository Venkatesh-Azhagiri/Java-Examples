package com.management.userInterface;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import com.management.excel.model.ModelSheet1;
import com.management.export.excel.WriteToExcel;

public class InvoiceManagement {

	private JFrame frame;
	private JTextField invoiceNo;
	private JTextField customerName;
	private JTextField contactNo;
	private JButton exportToExcel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvoiceManagement window = new InvoiceManagement();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					//Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
					//window.frame.setLocation(dim.width/2-window.frame.getSize().width/2, dim.height/2-window.frame.getSize().height/2);
					window.frame.setTitle("Excel Management Control");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InvoiceManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.getContentPane().setBackground(SystemColor.control);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel_3 = new JLabel("Export Excel");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setForeground(SystemColor.textHighlight);
		frame.getContentPane().add(lblNewLabel_3, "8, 2, 6, 1");
		
		JLabel lblNewLabel = new JLabel("Invoice No");
		frame.getContentPane().add(lblNewLabel, "6, 6");
		
		invoiceNo = new JTextField();
		invoiceNo.setToolTipText("Enter the Invoice no");
		frame.getContentPane().add(invoiceNo, "10, 6, fill, default");
		invoiceNo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Name");
		frame.getContentPane().add(lblNewLabel_1, "6, 10");
		
		customerName = new JTextField();
		customerName.setToolTipText("Enter the customer name");
		frame.getContentPane().add(customerName, "10, 10, fill, default");
		customerName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Customer Contact No");
		frame.getContentPane().add(lblNewLabel_2, "6, 14");
		
		contactNo = new JTextField();
		contactNo.setToolTipText("Enter the contact no");
		frame.getContentPane().add(contactNo, "10, 14, fill, default");
		contactNo.setColumns(10);
		
		exportToExcel = new JButton("Export");
		exportToExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*System.out.println("action performed");
				System.out.println("Invoice No****"+invoiceNo.getText());
				System.out.println("contact No****"+contactNo.getText());
				System.out.println("customer Name****"+customerName.getText());*/
				if(invoiceNo.getText().equals("") && contactNo.getText().equals("") && customerName.getText().equals("")){					
					JOptionPane.showMessageDialog(null, "Please enter the data", "Error", JOptionPane.ERROR_MESSAGE);					
				}else{
					String action = "sheet1";
					WriteToExcel exportExcel  = new WriteToExcel();
					ModelSheet1 modelsheet1 = new ModelSheet1();
					modelsheet1.setInvoiceNo(Integer.parseInt(invoiceNo.getText()));
					modelsheet1.setCustomerNo(contactNo.getText());
					modelsheet1.setCustomerName(customerName.getText());
					exportExcel.generateUpdatedExcel(action, modelsheet1);
				}
				
			}
		});
		frame.getContentPane().add(exportToExcel, "10, 18");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
