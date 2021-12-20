
public class Employee {
	private int id;
	private String name;
	
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s]", id, name);
	}
	
	
}
