package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecondaryMenu extends JFrame {
	private JPanel panel;
	private JLabel bgImage, mainTitle, info, infoVertex, infoNode;
	private Image image1;
	private Icon icon;
	private JTextField nodes, vertex;
	private JButton submit;

	public JPanel getPanel() {
		return panel;
	}

	public JButton getSubmit() {
		return submit;
	}

	public void setSubmit(JButton submit) {
		this.submit = submit;
	}

	public JLabel getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(JLabel mainTitle) {
		this.mainTitle = mainTitle;
	}

	public JLabel getInfo() {
		return info;
	}

	public void setInfo(JLabel info) {
		this.info = info;
	}

	public JLabel getInfoVertex() {
		return infoVertex;
	}

	public void setInfoVertex(JLabel infoVertex) {
		this.infoVertex = infoVertex;
	}

	public JLabel getInfoNode() {
		return infoNode;
	}

	public void setInfoNode(JLabel infoNode) {
		this.infoNode = infoNode;
	}

	public JTextField getNodes() {
		return nodes;
	}

	public void setNodes(JTextField nodes) {
		this.nodes = nodes;
	}

	public JTextField getVertex() {
		return vertex;
	}

	public void setVertex(JTextField vertex) {
		this.vertex = vertex;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getBgImage() {
		return bgImage;
	}

	public void setBgImage(JLabel bgImage) {
		this.bgImage = bgImage;
	}

	public Image getImage1() {
		return image1;
	}

	public void setImage1(Image image1) {
		this.image1 = image1;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	} 

	public SecondaryMenu() {
		setTitle("Secondary Menu");
		setBounds(600, 200, 2500, 900);
		this.setSize(720, 380);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 234, 0));
		panel.setBounds(0, 0, 1088, 760);

		mainTitle = new JLabel("Nodes");
		mainTitle.setFont(new Font("Helvetica", Font.BOLD, 26));
		mainTitle.setBounds(314, 57, 81, 36);

		info = new JLabel("Enter how many nodes you want to use");
		info.setFont(new Font("Helvetica", Font.PLAIN, 14));
		info.setBounds(229, 109, 251, 20);

		infoNode = new JLabel("Enter the number of nodes:");
		infoNode.setFont(new Font("Helvetica", Font.PLAIN, 14));
		infoNode.setBounds(105, 161, 190, 19);

		nodes = new JTextField();
		nodes.setBounds(119, 189, 145, 31);

		infoVertex = new JLabel("Enter the number of edges:");
		infoVertex.setFont(new Font("Helvetica", Font.PLAIN, 14));
		infoVertex.setBounds(427, 161, 190, 19);

		vertex = new JTextField();
		vertex.setBounds(439, 189, 145, 31);

		submit = new JButton();
		submit.setBounds(294, 270, 120, 32);

		panel.add(submit);
		panel.add(vertex);
		panel.add(infoVertex);
		panel.add(nodes);
		panel.add(infoNode);
		panel.add(info);
		panel.add(mainTitle);
		add(panel);
		setVisible(false);

	}
}
