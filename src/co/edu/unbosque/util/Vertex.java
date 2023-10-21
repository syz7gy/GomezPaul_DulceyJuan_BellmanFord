package co.edu.unbosque.util;

import java.util.ArrayList;

public class Vertex {

	private String name;
	private MyLinkedList<Edge> edges;
	private int first, second;

	public Vertex(int destination, int weight) {

		this.first = destination;
		this.second = weight;
	}

	public Vertex(String name) {
		this.name = name;
		this.edges = new MyLinkedList<Edge>();
	}
	
	public Vertex(int name) {
		this.name = String.valueOf(name);
		this.edges = new MyLinkedList<Edge>();
	}

	public Vertex() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyLinkedList<Edge> getEdges() {
		return edges;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setEdges(MyLinkedList<Edge> edges) {
		this.edges = edges;
	}

	public void addEdge(Edge newEdge) {
		edges.add(newEdge);
	}

	@Override
	public String toString() {
		return "\nVertex [name=" + name + ", edges=" + edges + "]";
	}

}
