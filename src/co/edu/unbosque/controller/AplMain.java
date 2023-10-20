package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.util.Edge;
import co.edu.unbosque.util.Graph;
import co.edu.unbosque.util.MyLinkedList;
import co.edu.unbosque.util.Vertex;
import co.edu.unbosque.util.algorithm.BellmanFordSP;

public class AplMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller c = new Controller();
		BellmanFordSP belfor = new BellmanFordSP();
		
		int E, origen, destino, peso, inicial;
		System.out.println("Ingrese el numero de vertices:");
		int vertices = sc.nextInt();
        belfor.setVertices(vertices);
        int verts = belfor.getVertices();
        System.out.println("Digite la cantidad E:");
        E = sc.nextInt();
        for (int i = 0; i < verts; i++) {
            belfor.getAdyacencia().add(new MyLinkedList<>());
        }
        for (int i = 0; i < E; i++) {
        	System.out.println("Digite el origen:");
            origen = sc.nextInt();
            System.out.println("Digite el destino:");
            destino = sc.nextInt();
            System.out.println("Digite el peso:");
            peso = sc.nextInt();
            belfor.getAdyacencia().get(origen).getInfo().add(new Vertex(destino, peso));
        }
        System.out.printf("Ingrese el nodo inicial: ");
        inicial = sc.nextInt();
        belfor.bellmanFord(inicial);
			
	}
}
