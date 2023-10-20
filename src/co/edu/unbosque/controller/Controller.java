package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

import co.edu.unbosque.util.algorithm.BellmanFord;
import co.edu.unbosque.view.ConnectionsMenu;
import co.edu.unbosque.view.Console;
import co.edu.unbosque.view.MainMenu;
import co.edu.unbosque.view.SecondaryMenu;

public class Controller implements ActionListener, KeyListener {
	private MainMenu menu;
	private SecondaryMenu secMenu;
	private ConnectionsMenu conMenu;
	private Console con;
	private BellmanFord bford;

	public Controller() {
		menu = new MainMenu();
		con = new Console();
		secMenu = new SecondaryMenu();
		conMenu = new ConnectionsMenu();
		bford = new BellmanFord();

		agregarLectores();
		asignarOyentes();
	}

	/**
	 * Constructor de la clase Controller.
	 */

	public void asignarOyentes() {
		menu.addKeyListener(this);

	}

	/**
	 * Asigna una letra para la vista1.
	 */

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			menu.setVisible(false);
			secMenu.setVisible(true);
		}
	}

	/**
	 * Refresca la pagina para actualizar los cambios.
	 */

	public void agregarLectores() {
		secMenu.getSubmit().addActionListener(this);
		secMenu.getSubmit().setActionCommand("botonsubmitnodo");
//
//		menuel.getBtn2().addActionListener(this);
//		menuel.getBtn2().setActionCommand("boton2vista2");

	}

	/**
	 * Asigna las acciones a los botones de las vistas y panele.
	 */

	@Override

	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "botonsubmitnodo": {
			secMenu.setVisible(false);
			conMenu.setVisible(true);
			
			
			
//			BellmanFord.bellmanFord(numNodes);
			

		}
		
		case "":{
			
			String numNodesStr = secMenu.getNodes().getText();
			int numNodes = Integer.parseInt(numNodesStr);
			
			int vertexNum = Integer.parseInt(secMenu.getVertex().getText());
			
			String numNodecsStr = conMenu.getSourceNode().getText();
			int sourceNode = Integer.parseInt(numNodecsStr);
			conMenu.getSourceNode();
			
			BellmanFord.vertices = vertexNum;
			
		}

		}
	}

	/**
	 * Asigna las funciones y la visibilidad de los botones, paneles y ventanas.
	 * Ademas de asignar los metodos.
	 */

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Permite utilizar los metodos de KeyTyped.
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	/**
	 * Permite utilizar los metodos de KeyPressed.
	 */
}