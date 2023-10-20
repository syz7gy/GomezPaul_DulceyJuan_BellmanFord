package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JFrame {
	private JPanel panel;
	private JLabel bgImage;
	private Image image1;
	private Icon icon;
	public JPanel getPanel() {
		return panel;
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
	public MainMenu() {
		setTitle("Main");
		setBounds(600, 200, 2500, 900);
		this.setSize(1088, 760);
		setResizable(false);
		setLocationRelativeTo(null);
	
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 234, 0));
		panel.setBounds(0, 0, 1088, 760);
		
		image1 = new ImageIcon("src/co/edu/unbosque/view/images/menu.jpeg").getImage();
		icon = new ImageIcon(image1.getScaledInstance(1088, 760, Image.SCALE_DEFAULT));
		bgImage = new JLabel();
		bgImage.setBounds(0, 0, 1088, 760);
		bgImage.setIcon(icon);
		
		add(bgImage);
		add(panel);		
		setVisible(true);
		
	}

}
