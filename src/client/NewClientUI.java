/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author jibra
 */
public class NewClientUI extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	CardLayout card;
	ClientUI self;
	JPanel textArea;
	JPanel userPanel;
	List<User> users = new ArrayList<User>();
	private final static Logger log = Logger.getLogger(ClientUI.class.getName());
	Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
	// GamePanelNew game;
	String username;
	RoomsPanel roomsPanel;
	JMenuBar menu;
	RPSInput rpsUI;

	/**
	 * Creates new form NewClientUI
	 */
	public NewClientUI() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SEPhorizontal = new javax.swing.JSeparator();
        LABELip = new javax.swing.JLabel();
        LABELport = new javax.swing.JLabel();
        IPText = new javax.swing.JTextField();
        port = new javax.swing.JTextField();
        BUTTONsubmit = new javax.swing.JButton();
        usernameIn = new javax.swing.JTextField();
        LABELusername = new javax.swing.JLabel();
        SEPvert = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LABELip.setText("IP: ");

        LABELport.setText("Port:");

        IPText.setText("127.0.0.1");
        IPText.setToolTipText("(Default: 127.0.0.1)");
        IPText.setName("IP"); // NOI18N
        IPText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPTextActionPerformed(evt);
            }
        });

        port.setToolTipText("(Port of the server)");
        port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portActionPerformed(evt);
            }
        });

        BUTTONsubmit.setText("Submit");
        BUTTONsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTONsubmitActionPerformed(evt);
            }
        });

        LABELusername.setText("Username:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SEPhorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LABELip)
                                .addComponent(IPText, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LABELport)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LABELusername)
                                .addComponent(usernameIn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(SEPvert, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BUTTONsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LABELip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IPText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(LABELport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SEPhorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(LABELusername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addComponent(SEPvert, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUTTONsubmit)
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void BUTTONsubmitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BUTTONsubmitActionPerformed
		// TODO add your handling code here:
		String name = usernameIn.getText();
		String _host = IPText.getText();
		String _port = port.getText();
		if (_host.length() > 0 && _port.length() > 0 && (name != null && name.length() > 0)) {
			try {
				// SocketClient.INSTANCE.registerCallbackListener((Event) evt);
				self.username = name;
				SocketClient.INSTANCE.connectAndStart(_host, _port);
				self.setTitle(self.getTitle() + " - " + self.username);
				SocketClient.INSTANCE.setUsername(self.username);
				self.next();
			} catch (IOException e1) {
				e1.printStackTrace();
				// TODO handle error properly
				log.log(Level.SEVERE, "Error connecting");
			}
		}
	}// GEN-LAST:event_BUTTONsubmitActionPerformed

	private void IPTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_IPTextActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_IPTextActionPerformed

	private void portActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_portActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_portActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(NewClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NewClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NewClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NewClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewClientUI().setVisible(true);
			}
		});
	}

	// disparity with "this" keyword
//	void connect(String host, String port) throws IOException {
//		SocketClient.INSTANCE.registerCallbackListener(this);
//		SocketClient.INSTANCE.connectAndStart(host, port);
//	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTTONsubmit;
    private javax.swing.JTextField IPText;
    private javax.swing.JLabel LABELip;
    private javax.swing.JLabel LABELport;
    private javax.swing.JLabel LABELusername;
    private javax.swing.JSeparator SEPhorizontal;
    private javax.swing.JSeparator SEPvert;
    private javax.swing.JTextField port;
    private javax.swing.JTextField usernameIn;
    // End of variables declaration//GEN-END:variables
}