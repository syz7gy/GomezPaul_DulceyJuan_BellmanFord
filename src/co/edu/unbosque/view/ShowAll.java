package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ShowAll extends JFrame{
	private JPanel panel;
	private JLabel mainTitle;
	private JScrollPane scrollPane;
	private JButton backButton;
	
	public ShowAll() {
		setTitle("Show All");
		setBounds(600, 200, 2500, 900);
		this.setSize(720, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1088, 760);
		
		mainTitle = new JLabel("Show all");
		mainTitle.setFont(new Font("Helvetica", Font.BOLD, 26));
		mainTitle.setBounds(311, 33, 110, 36);
		mainTitle.setForeground(Color.WHITE);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.setBounds(74, 83, 580, 213);
		
		backButton = new JButton("Back");
		backButton.setBounds(31, 318, 120, 32);
		
		
		panel.add(backButton);
		panel.add(scrollPane);
		panel.add(mainTitle);
		add(panel);
		setVisible(false);

	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(JLabel mainTitle) {
		this.mainTitle = mainTitle;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JButton getBackButton() {
		return backButton;
	}

	public void setBackButton(JButton backButton) {
		this.backButton = backButton;
	}
	
	

}
