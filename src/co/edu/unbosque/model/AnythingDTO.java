package co.edu.unbosque.model;

public class AnythingDTO {
	
	private int index;
	private String name;
	
	public AnythingDTO() {
		// TODO Auto-generated constructor stub
	}

	public AnythingDTO(int index, String name) {
		super();
		this.index = index;
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Index: " + index + " | Name: " + name + "\n";
	}
	
	

}
