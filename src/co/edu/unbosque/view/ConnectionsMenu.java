package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConnectionsMenu extends JFrame {
	private JPanel panel;
	private JLabel mainTitle, description, source, destiny, weight, connectionsLeft;
	private JTextField sourceNode, destinyNode, weightNode, initialNode;
	private JButton submitButton, addButton;

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

	public JLabel getDescription() {
		return description;
	}

	public void setDescription(JLabel description) {
		this.description = description;
	}

	public JLabel getSource() {
		return source;
	}

	public void setSource(JLabel source) {
		this.source = source;
	}

	public JLabel getDestiny() {
		return destiny;
	}

	public void setDestiny(JLabel destiny) {
		this.destiny = destiny;
	}

	public JLabel getWeight() {
		return weight;
	}

	public void setWeight(JLabel weight) {
		this.weight = weight;
	}

	public JLabel getConnectionsLeft() {
		return connectionsLeft;
	}

	public void setConnectionsLeft(JLabel connectionsLeft) {
		this.connectionsLeft = connectionsLeft;
	}

	public JTextField getSourceNode() {
		return sourceNode;
	}

	public void setSourceNode(JTextField sourceNode) {
		this.sourceNode = sourceNode;
	}

	public JTextField getDestinyNode() {
		return destinyNode;
	}

	public void setDestinyNode(JTextField destinyNode) {
		this.destinyNode = destinyNode;
	}

	public JTextField getWeightNode() {
		return weightNode;
	}

	public void setWeightNode(JTextField weightNode) {
		this.weightNode = weightNode;
	}

	public JButton getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(JButton submitButton) {
		this.submitButton = submitButton;
	}

	public JTextField getInitialNode() {
		return initialNode;
	}

	public void setInitialNode(JTextField initialNode) {
		this.initialNode = initialNode;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}

	public ConnectionsMenu() {
		setTitle("Secondary Menu");
		setBounds(600, 200, 2500, 900);
		this.setSize(720, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1088, 760);

		mainTitle = new JLabel("Connections");
		mainTitle.setFont(new Font("Helvetica", Font.BOLD, 26));
		mainTitle.setForeground(Color.WHITE);
		mainTitle.setBounds(287, 34, 170, 36);

		description = new JLabel("Enter the connection of the nodes:");
		description.setFont(new Font("Helvetica", Font.PLAIN, 14));
		description.setForeground(Color.WHITE);
		description.setBounds(253, 77, 224, 20);

		source = new JLabel("Source node:");
		source.setFont(new Font("Helvetica", Font.PLAIN, 14));
		source.setForeground(Color.WHITE);
		source.setBounds(118, 122, 100, 20);

		destiny = new JLabel("Destiny node:");
		destiny.setFont(new Font("Helvetica", Font.PLAIN, 14));
		destiny.setForeground(Color.WHITE);
		destiny.setBounds(316, 122, 88, 20);

		weight = new JLabel("Weight:");
		weight.setFont(new Font("Helvetica", Font.PLAIN, 14));
		weight.setForeground(Color.WHITE);
		weight.setBounds(521, 122, 49, 20);

		sourceNode = new JTextField();
		sourceNode.setBorder(BorderFactory.createEmptyBorder());
		sourceNode.setBounds(99, 150, 124, 31);

		destinyNode = new JTextField();
		destinyNode.setBorder(BorderFactory.createEmptyBorder());
		destinyNode.setBounds(295, 150, 124, 31);

		weightNode = new JTextField();
		weightNode.setBorder(BorderFactory.createEmptyBorder());
		weightNode.setBounds(484, 150, 124, 31);

		submitButton = new JButton("Next");
		submitButton.setBorder(BorderFactory.createEmptyBorder());
		submitButton.setBounds(394, 314, 120, 32);

		addButton = new JButton("Add");
		addButton.setBorder(BorderFactory.createEmptyBorder());
		addButton.setBounds(300, 202, 120, 32);

		connectionsLeft = new JLabel("Enter the start node from which the Bellman-Ford system will start:");
		connectionsLeft.setFont(new Font("Helvetica", Font.PLAIN, 14));
		connectionsLeft.setForeground(Color.WHITE);
		
		connectionsLeft.setBounds(151, 269, 430, 18);

		initialNode = new JTextField();
		initialNode.setBorder(BorderFactory.createEmptyBorder());
		initialNode.setBounds(206, 314, 124, 31);

		panel.add(initialNode);
		panel.add(addButton);
		panel.add(mainTitle);
		panel.add(description);
		panel.add(source);
		panel.add(destiny);
		panel.add(weight);
		panel.add(sourceNode);
		panel.add(destinyNode);
		panel.add(weightNode);
		panel.add(submitButton);
		panel.add(connectionsLeft);
		add(panel);
		setVisible(false);
	}

}
