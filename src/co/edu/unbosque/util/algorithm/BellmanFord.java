package co.edu.unbosque.util.algorithm;


import co.edu.unbosque.util.MyLinkedList;
import co.edu.unbosque.util.Vertex;

public class BellmanFord {
	public static final int MAX = 105;
	public static final int INF = 1 << 30;
	public static int[] previous = new int[MAX];
	public static int[] distance = new int[MAX];
	public static int vertices;
	public static MyLinkedList<MyLinkedList<Vertex>> adyacency = new MyLinkedList<MyLinkedList<Vertex>>();

	public static void start() {
		for (int i = 0; i <= vertices; i++) {
			distance[i] = INF;
			adyacency.size();
			previous[i] = -1;
		}
	}
	public static void print(int destiny) {
		if (previous[destiny] != -1) {
			print(previous[destiny]);
		}
		System.out.printf("%d ", destiny);
	}
	
	 static boolean relaxation(int actual, int adyacent, int weight) {
	        if (distance[actual] + weight < distance[adyacent]) {
	        	distance[adyacent] = distance[actual] + weight;
	            previous[adyacent] = actual;
	            return true;
	        }
	        return false;
	    }

	  public static void bellmanFord(int inicial) {
	        start();
	        distance[inicial] = 0;
	        for (int i = 0; i < vertices - 1; i++) {
	            for (int actual = 0; actual < vertices; actual++) {
	                for (int j = 0; j < adyacency.get(actual).getInfo().size(); j++) {
	                    int adyacente = adyacency.get(actual).getInfo().get(j).getInfo().getFirst();
	                    int weight = adyacency.get(actual).getInfo().get(j).getInfo().getSecond();
	                    relaxation(actual, adyacente, weight);
	                }
	            }
	        }
	        for (int actual = 0; actual < vertices; actual++) {
	            for (int j = 0; j < adyacency.get(actual).getInfo().size(); j++) {
	                int adyacente = adyacency.get(actual).getInfo().get(j).getInfo().getFirst();
	                int weight = adyacency.get(actual).getInfo().get(j).getInfo().getSecond();
	                if (relaxation(actual, adyacente, weight)) {
	                    System.out.println("Existe ciclo negativo");
	                    return;
	                }
	            }
	        }
	        System.out.println("No existe ciclo negativo");
	        System.out.printf("Distancias más corteas iniciando en el nodo %d\n", inicial);
	        for (int i = 0; i < vertices; i++) {
	            System.out.printf("Nodo %d , distance más corta = %d\n", i, distance[i]);
	        }
	        System.out.println("\n ________Camino más corto____");
	        System.out.println("Ingrese vertice destino: ");
	       
	    }
}
