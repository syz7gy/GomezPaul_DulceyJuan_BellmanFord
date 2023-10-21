package co.edu.unbosque.util;

public class Edge {
	
	private Vertex source;
	private Vertex destination;
	private double weight;
	
	public Edge() {
		// TODO Auto-generated constructor stub
	}
	
	public Edge(Vertex source, Vertex destination, double weight) {
		super();
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}
	
	public Edge(int source, int destination, int weight) {
		
	}

	public Vertex getSource() {
		return source;
	}

	public void setSource(Vertex source) {
		this.source = source;
	}

	public Vertex getDestination() {
		return destination;
	}

	public void setDestination(Vertex destination) {
		this.destination = destination;
	}

	public double getweight() {
		return weight;
	}

	public void setweight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Edge [source=" + source.getName() + ", destination=" + destination.getName() + ", weight=" + weight + "]\n";
	}
	

}
