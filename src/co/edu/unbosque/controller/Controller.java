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

		conMenu.getSubmitButton().addActionListener(this);
		conMenu.getSubmitButton().setActionCommand("botonsubmittodo");
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
			break;

//			BellmanFord.bellmanFord(numNodes);

		}

		case "botonsubmittodo": {
			int vertexNum = Integer.parseInt(secMenu.getVertex().getText());

			BellmanFord.vertices = vertexNum;
			for (int i = 0; i < vertexNum; i++) {
				JTextField textField = secMenu.getNodes();
				String strNodes = textField.getText();
				try {
					int numNodes = Integer.parseInt(strNodes);
					// Aquí puedes agregar el código para guardar numNodes donde necesites
				} catch (NumberFormatException j) {
					System.out.println("El JTextField contiene un valor no numérico");
				}
				// Borra el texto del JTextField
				textField.setText("");
			}

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