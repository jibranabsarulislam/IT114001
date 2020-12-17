package client;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;

import core.Countdown;

public class RPSInput extends javax.swing.JFrame implements Event {
	private static final long serialVersionUID = -1121202275148798015L;
	List<Player> players;
	Player myPlayer;
	String playerUsername;
	List<Player> gameplayers;
	Countdown time;
	static JProgressBar progressBar;
	private final String autoLossCode = "uzocgmgxqciavrfxnjlotpvkpiueapmbmavcvqdpknqzbkcpwvhfykufbyhmdzlnwweigmfcdlfnfpasvzcwtlmvmdpytkduarphfjpuahwcyznjemblphbqzcjqqvzr";

	static final int TIME_IN_SECONDS = 15;
	static boolean timeRanOut;

	public RPSInput() {
		initComponents();
		choice1.add("Rock");
		choice1.add("Paper");
		choice1.add("Scissors");

	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		label1 = new java.awt.Label();
		button1 = new java.awt.Button();
		choice1 = new java.awt.Choice();
		jLabel1 = new javax.swing.JLabel();
		readyButton = new javax.swing.JButton();

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 152, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 345, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		label1.setAlignment(java.awt.Label.CENTER);
		label1.setFont(new java.awt.Font("Dialog", 1, 12));
		label1.setText("Rock, Paper, Scissors...");

		button1.setLabel("Submit");
		button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				buttonSendChoice(event);
			}
		});

		choice1.setName("choiceInput");

		jLabel1.setText("Choice:");

		readyButton.setText("Shoot! (Ready up)");
		readyButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				readyButtonActionPerformed(event);
			}
		});

		// timer implemented as a progress bar
		// See CountdownProgressBar.java
		// Timer stopped working... :(

//		int timeInMs = TIME_IN_SECONDS * 100;
//		progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 15);
//		timeRanOut = false;
//		progressBar.setValue(TIME_IN_SECONDS);
//		ActionListener listener = new ActionListener() {
//			int counter = TIME_IN_SECONDS;
//
//			public void actionPerformed(ActionEvent ae) {
//				counter--;
//				progressBar.setValue(counter);
//				if (counter < 1) { // once counter reaches 0 (i.e. 0 seconds)
//					time.stop(); // stop timer
//					timeRanOut = true;
//					SocketClient.INSTANCE.sendChoice(
//							"/uzocgmgxqciavrfxnjlotpvkpiueapmbmavcvqdpknqzbkcpwvhfykufbyhmdzlnwweigmfcdlfnfpasvzcwtlmvmdpytkduarphfjpuahwcyznjemblphbqzcjqqvzr");
//					dispose(); // close window
//
//					// TODO: remove openGame button and
//
//				}
//			}
//		};
//		time = new Timer(timeInMs, listener);
//		time.start();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(103).addComponent(button1,
										GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(18).addComponent(jLabel1)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(label1, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(choice1, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
												.addComponent(progressBar, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
						.addComponent(readyButton, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addGap(43)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(97)
								.addComponent(label1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(choice1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(9)
								.addComponent(button1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(64).addComponent(readyButton,
								GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(10, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}

	private void readyButtonActionPerformed(java.awt.event.ActionEvent event) {
		// time.stop();
		SocketClient.INSTANCE.sendChoice("/ready");
		dispose();
	}

	public int getChoice() {
		int choice = 2;
		if (choice1.getSelectedItem().equals("Rock"))
			choice = -1;
		if (choice1.getSelectedItem().equals("Paper"))
			choice = 0;
		if (choice1.getSelectedItem().equals("Scissors"))
			choice = 1;
		return choice;
	}

	public void buttonSendChoice(java.awt.event.ActionEvent event) {
		SocketClient.INSTANCE.sendChoice("/" + choice1.getSelectedItem().toLowerCase());
		readyButton.setVisible(true);
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(RPSInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(RPSInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(RPSInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(RPSInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RPSInput().setVisible(true);
			}
		});
	}

	private java.awt.Button button1;
	private java.awt.Choice choice1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private java.awt.Label label1;
	private javax.swing.JButton readyButton;

	// implemented functions from Event

	public synchronized void onClientConnect(String clientName, String message) {

	}

	public void setPlayerName(String name) {
		playerUsername = name;
		if (myPlayer != null) {
			myPlayer.setName(playerUsername);
		}
	}

	public void onClientDisconnect(String clientName, String message) {

	}

	@Override
	public void onMessageReceive(String clientName, String message) {
		System.out.println("Message on Game Panel");
	}

	public void onChangeRoom() {

	}

	public void awake() {
		players = new ArrayList<Player>(); // ?
	}

	public void onChoiceReceive(String clientName, String choice) {

	}

	@Override
	public void onSyncDirection(String clientName, Point direction) {

	}

	@Override
	public void onSyncPosition(String clientName, Point position) {

	}

	@Override
	public void onGetRoom(String roomName) {

	}

	@Override
	public void onSetCountdown(String message, int duration) {
		if (time != null) {
			time.cancel();
		}
		time = new Countdown(message, duration, (x) -> {
			System.out.println("expired");
			System.out.println(x);
		});
	}
}