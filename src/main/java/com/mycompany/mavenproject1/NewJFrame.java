/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;*/

/**
 *
 * @author Genus
 */
public class NewJFrame extends javax.swing.JFrame {

	public static String password;
	public static String username;

	/**
	 * Creates new form NewJFrame
	 */
	public NewJFrame() {
		initComponents();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel5 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(0, 0, 0));
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
		getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
		getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

		jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 51, 0));
		jLabel4.setText("SQL Database Record");
		getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 420, 50));

		jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("Email or Phone");
		getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

		jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 180, 40));

		jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("Password");
		getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

		jPasswordField1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 180, 40));

		jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("to continue to Access ");
		getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

		jButton5.setBackground(new java.awt.Color(255, 51, 0));
		jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("NEXT");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

		jTextField2.setBackground(new java.awt.Color(0, 0, 0));
		jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
		jTextField2.setForeground(new java.awt.Color(255, 51, 51));
		jTextField2.setBorder(null);
		jTextField2.setFocusable(false);
		jTextField2.setRequestFocusEnabled(false);
		getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

		jTextField4.setBackground(new java.awt.Color(0, 0, 0));
		jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
		jTextField4.setForeground(new java.awt.Color(255, 51, 51));
		jTextField4.setBorder(null);
		jTextField4.setFocusable(false);
		jTextField4.setRequestFocusEnabled(false);
		getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 130, 30));

		jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(255, 51, 0));
		jLabel6.setText("Sign In");
		getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 30));

		jTextField3.setBackground(new java.awt.Color(0, 0, 0));
		jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
		jTextField3.setForeground(new java.awt.Color(255, 51, 51));
		jTextField3.setBorder(null);
		jTextField3.setFocusable(false);
		jTextField3.setRequestFocusEnabled(false);
		getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 440));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:

	}// GEN-LAST:event_jTextField1ActionPerformed

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		// TODO add your handling code here:

		// TODO add your handling code here:
		username = jTextField1.getText();
		password = String.valueOf(jPasswordField1.getPassword());
		boolean f = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.29.195:3306/navi", username, password);
			con.close();
			f = true;
		} catch (Exception e) {
			jTextField1.setText("");
			jPasswordField1.setText("");
			System.out.println(e);
			jTextField4.setText("Invalid Login Details !");
			f = false;
		}
		if (f) {

			this.dispose();
			database oo = new database();
			oo.setVisible(true);

			jTextField4.setVisible(false);

			this.dispose();
		}
	}// GEN-LAST:event_jButton5ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewJFrame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	// End of variables declaration//GEN-END:variables
}
