/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import static com.mycompany.mavenproject1.NewJFrame.password;
import static com.mycompany.mavenproject1.NewJFrame.username;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Genus
 */
public class database extends javax.swing.JFrame {

	static Object[][] tableValues;
	static String[] tableColumns;
	static Statement stmt;
	static Connection con;

	/**
	 * Creates new form NewJFrame
	 */
	public database() {
		initComponents();

		jTextField1.setVisible(false);
		jButton3.setVisible(false);

		jLabel6.setVisible(false);
		jTextField4.setVisible(false);
		jTextField5.setVisible(false);
		jTextField6.setVisible(false);
		jTextField1.setVisible(false);
		jButton3.setVisible(false);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://192.168.29.195:3306/navi", NewJFrame.username,
					NewJFrame.password);
			stmt = con.createStatement();
		} catch (Exception e) {

		}
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
		jButton1 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jButton4 = new javax.swing.JButton();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(0, 0, 0));
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
		getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
		getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

		jButton1.setBackground(new java.awt.Color(255, 51, 0));
		jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("Back");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

		jTextField2.setBackground(new java.awt.Color(0, 0, 0));
		jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
		jTextField2.setForeground(new java.awt.Color(255, 51, 51));
		jTextField2.setBorder(null);
		jTextField2.setFocusable(false);
		jTextField2.setRequestFocusEnabled(false);
		getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

		jTextArea1.setColumns(4);
		jTextArea1.setRows(5);
		jScrollPane2.setViewportView(jTextArea1);

		getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 420, 170));

		jButton2.setBackground(new java.awt.Color(255, 51, 0));
		jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("SHOW");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 110, 50));

		jButton3.setBackground(new java.awt.Color(255, 51, 0));
		jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("Insert");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 80, -1));

		jTextField1.setText("Country");
		jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTextField1MouseClicked(evt);
			}
		});
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 180, 40));

		jButton4.setBackground(new java.awt.Color(255, 51, 0));
		jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("Insert new record ?");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 240, 40));

		jTextField4.setText("Name");
		jTextField4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				jTextField4MouseDragged(evt);
			}
		});
		jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				jTextField4FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				jTextField4FocusLost(evt);
			}
		});
		jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTextField4MouseClicked(evt);
			}
		});
		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});
		getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 180, 40));

		jTextField5.setText("Email");
		jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTextField5MouseClicked(evt);
			}
		});
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});
		getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 180, 40));

		jTextField6.setText("Phone Number");
		jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTextField6MouseClicked(evt);
			}
		});
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});
		getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 180, 40));

		jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 51, 0));
		jLabel5.setText("SQL Database Record");
		getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 420, 50));

		jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(255, 51, 0));
		jLabel6.setText("Enter Row Details");
		getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 320, 50));

		jTextField3.setBackground(new java.awt.Color(0, 0, 0));
		jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
		jTextField3.setForeground(new java.awt.Color(255, 51, 51));
		jTextField3.setBorder(null);
		jTextField3.setFocusable(false);
		jTextField3.setRequestFocusEnabled(false);
		getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 960, 530));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		this.dispose();
		NewJFrame oo = new NewJFrame();
		oo.setVisible(true);

	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		String indexfile = "";
		try {
			// here sonoo is database name, root is username and password
			ResultSet rs = stmt.executeQuery("select * from emp");
			//int i = 0;
			jTextArea1.setText("");
			while (rs.next()) {
				String s = rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4);
				System.out.println(s);
				indexfile = indexfile + s + "<br>";
				jTextArea1.setText(jTextArea1.getText() + s + "\n");
				/*
				for (int j = 0; j < tableValues.length; j++) {
					tableValues[i][j] = rs.getString(j + 1);
				}
				i++;
				*/
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}

		
		
		
		try {
			
			

		      FileWriter myWriter = new FileWriter("index.html");
		      
			myWriter.write("<!DOCTYPE html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>Document</title>\r\n"
					+ "    <link href=\"https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css\" rel=\"stylesheet\">\r\n"
					+ "<link rel=\"stylesheet\" href=\"styles.css\">\r\n"
					+ "</head>\r\n"
					+ "\r\n"
					+ "<body>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "<b><font size = 5 > See ! we made changes from github & changes are reflected here automatically </font></b>\r\n"
					+ "\r\n"
					+ "<marquee> <font color = \"Red\" > SQL Database </font> </marquee>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "<br>\r\n"
					+ "<br>\r\n"
					+ "This is database record. It will be automatically triggered when SHOW button is clicked in JAVA Maven Project <br> \r\n"
					+ " Continuous Integration Pipeline is Working Fine :) \r\n"
					+ " \r\n"
					+ " \r\n"
					+ " <br> <br><br>\r\n"
					+ indexfile
					+ "\r\n"
					+ "\r\n"
					+ "</body>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "<footer class=\"text-gray-600 body-font\">\r\n"
					+ "  <div class=\"container px-5 py-8 mx-auto flex items-center sm:flex-row flex-col\">\r\n"
					+ "    <a class=\"flex title-font font-medium items-center md:justify-start justify-center text-gray-900\">\r\n"
					+ "      <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"w-10 h-10 text-white p-2 bg-indigo-500 rounded-full\" viewBox=\"0 0 24 24\">\r\n"
					+ "        <path d=\"M12 2L2 7l10 5 10-5-10-5zM2 17l10 5 10-5M2 12l10 5 10-5\"></path>\r\n"
					+ "      </svg>\r\n"
					+ "      <span class=\"ml-3 text-xl\">SQL Database Project</span>\r\n"
					+ "    </a>\r\n"
					+ "    <p class=\"text-sm text-gray-500 sm:ml-4 sm:pl-4 sm:border-l-2 sm:border-gray-200 sm:py-2 sm:mt-0 mt-4\"> \r\n"
					+ "      <a href=\"\" class=\"text-gray-600 ml-1\" rel=\"noopener noreferrer\" target=\"_blank\"></a>\r\n"
					+ "    </p>\r\n"
					+ "    <span class=\"inline-flex sm:ml-auto sm:mt-0 mt-4 justify-center sm:justify-start\">\r\n"
					+ "      <a class=\"text-gray-500\">\r\n"
					+ "        <svg fill=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"w-5 h-5\" viewBox=\"0 0 24 24\">\r\n"
					+ "          <path d=\"M18 2h-3a5 5 0 00-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 011-1h3z\"></path>\r\n"
					+ "        </svg>\r\n"
					+ "      </a>\r\n"
					+ "      <a class=\"ml-3 text-gray-500\">\r\n"
					+ "        <svg fill=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"w-5 h-5\" viewBox=\"0 0 24 24\">\r\n"
					+ "          <path d=\"M23 3a10.9 10.9 0 01-3.14 1.53 4.48 4.48 0 00-7.86 3v1A10.66 10.66 0 013 4s-4 9 5 13a11.64 11.64 0 01-7 2c9 5 20 0 20-11.5a4.5 4.5 0 00-.08-.83A7.72 7.72 0 0023 3z\"></path>\r\n"
					+ "        </svg>\r\n"
					+ "      </a>\r\n"
					+ "      <a class=\"ml-3 text-gray-500\">\r\n"
					+ "        <svg fill=\"none\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"w-5 h-5\" viewBox=\"0 0 24 24\">\r\n"
					+ "          <rect width=\"20\" height=\"20\" x=\"2\" y=\"2\" rx=\"5\" ry=\"5\"></rect>\r\n"
					+ "          <path d=\"M16 11.37A4 4 0 1112.63 8 4 4 0 0116 11.37zm1.5-4.87h.01\"></path>\r\n"
					+ "        </svg>\r\n"
					+ "      </a>\r\n"
					+ "      <a class=\"ml-3 text-gray-500\">\r\n"
					+ "        <svg fill=\"currentColor\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"0\" class=\"w-5 h-5\" viewBox=\"0 0 24 24\">\r\n"
					+ "          <path stroke=\"none\" d=\"M16 8a6 6 0 016 6v7h-4v-7a2 2 0 00-2-2 2 2 0 00-2 2v7h-4v-7a6 6 0 016-6zM2 9h4v12H2z\"></path>\r\n"
					+ "          <circle cx=\"4\" cy=\"4\" r=\"2\" stroke=\"none\"></circle>\r\n"
					+ "        </svg>\r\n"
					+ "      </a>\r\n"
					+ "    </span>\r\n"
					+ "  </div>\r\n"
					+ "</footer>\r\n"
					+ "\r\n"
					+ "</html>");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		      UnitTest.indexfile();
		    } catch (IOException e) {
		      System.out.println("Error: Index File not Updated !");
		      e.printStackTrace();
		      
		    }
		
		
		//String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" }, { "101", "Sachin", "700000" } };
		//String column[] = { "ID", "NAME", "SALARY" };
		//jTable1 = new javax.swing.JTable(data, column);

	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:

		String name = jTextField4.getText();
		String email = jTextField5.getText();
		String phno = jTextField6.getText();
		String country = jTextField1.getText();
		// INSERT INTO pet VALUES ('Puffball','Diane','hamster','f','1999-03-30',NULL);

		try {

			stmt.executeUpdate(
					"insert into emp values(\'" + name + "\',\'" + email + "\',\'" + phno + "\',\'" + country + "\');");
			// insert into emp values ("name","email","phno","country");

			ResultSet rs = stmt.executeQuery("select * from emp");
			int i = 0;
			jTextArea1.setText("");
			while (rs.next()) {
				System.out.println(
						rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));

				jTextArea1.setText(jTextArea1.getText() + rs.getString(1) + "  " + rs.getString(2) + "  "
						+ rs.getString(3) + "  " + rs.getString(4) + "\n");
				for (int j = 0; j < tableValues.length; j++) {
					tableValues[i][j] = rs.getString(j + 1);
				}
				i++;
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		JOptionPane.showMessageDialog(null, "New row has been inserted into the database ! ", "Data Inserted",
				JOptionPane.INFORMATION_MESSAGE);
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:

		jTextField1.setVisible(true);
		jButton3.setVisible(true);

		jLabel6.setVisible(true);
		jTextField4.setVisible(true);
		jTextField5.setVisible(true);
		jTextField6.setVisible(true);
		jTextField1.setVisible(true);
		jButton3.setVisible(true);
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTextField4MouseClicked
		// TODO add your handling code here:

		jTextField4.setText("");
	}// GEN-LAST:event_jTextField4MouseClicked

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField5ActionPerformed
		// TODO add your handling code here:

	}// GEN-LAST:event_jTextField5ActionPerformed

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField6ActionPerformed
		// TODO add your handling code here:

	}// GEN-LAST:event_jTextField6ActionPerformed

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:

	}// GEN-LAST:event_jTextField1ActionPerformed

	private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTextField5MouseClicked
		// TODO add your handling code here:
		jTextField5.setText("");
	}// GEN-LAST:event_jTextField5MouseClicked

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField4ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField4ActionPerformed

	private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField4FocusGained
		// TODO add your handling code here:

	}// GEN-LAST:event_jTextField4FocusGained

	private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField4FocusLost
		// TODO add your handling code here:

	}// GEN-LAST:event_jTextField4FocusLost

	private void jTextField4MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTextField4MouseDragged
		// TODO add your handling code here:

	}// GEN-LAST:event_jTextField4MouseDragged

	private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTextField6MouseClicked
		// TODO add your handling code here:
		jTextField6.setText("");
	}// GEN-LAST:event_jTextField6MouseClicked

	private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTextField1MouseClicked
		// TODO add your handling code here:
		jTextField1.setText("");
	}// GEN-LAST:event_jTextField1MouseClicked

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
			java.util.logging.Logger.getLogger(database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new database().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	// End of variables declaration//GEN-END:variables
}
