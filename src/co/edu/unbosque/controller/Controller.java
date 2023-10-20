package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import co.edu.unbosque.util.Edge;
import co.edu.unbosque.util.MyLinkedList;
import co.edu.unbosque.util.Vertex;
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

			int E, origen, destino, peso, inicial;
			int vertexNum = Integer.parseInt(secMenu.getNodes().getText());
			BellmanFord.vertices = vertexNum;
			E = Integer.parseInt(secMenu.getVertex().getText());
			for (int i = 0; i < vertexNum; i++) {
				BellmanFord.adyacency.add(new MyLinkedList<>());
			}
			for (int i = 0; i < E; i++) {
				origen = Integer.parseInt(conMenu.getSourceNode().getText());
				destino = Integer.parseInt(conMenu.getDestinyNode().getText());
				peso = Integer.parseInt(conMenu.getWeightNode().getText());
				Vertex newVertex = new Vertex(destino, peso);
				Vertex otherVertex = new Vertex();
				BellmanFord.adyacency.data(origen).add(newVertex);
				BellmanFord.adyacency.data(origen).add(otherVertex);
				Vertex sourceVertex = BellmanFord.adyacency.data(origen).get(origen).getInfo();
				Vertex destinationVertex = BellmanFord.adyacency.data(destino).get(destino).getInfo();
				newVertex.addEdge(new Edge(sourceVertex, destinationVertex, peso));
				BellmanFord.bellmanFord(origen);
			}
			conMenu.getSourceNode().setText("");
			conMenu.getDestinyNode().setText("");
			conMenu.getWeightNode().setText("");
			
			
//			Scanner sc = new Scanner(System.in);
			
//			System.out.printf("Ingrese el nodo inicial: ");
//			inicial = sc.nextInt();
//			BellmanFord.bellmanFord(inicial-1);

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