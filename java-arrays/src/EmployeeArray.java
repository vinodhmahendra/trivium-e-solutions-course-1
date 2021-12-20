
public class EmployeeArray {
	
	public static void main(String[] args) {
		Employee[] employees = createArray();
		printElements(employees);
	}

	private static void printElements(Employee[] employees) {
		for(Employee e : employees) {
			System.out.println(e);
		}
	}

	private static Employee[] createArray() {
		Employee[] e;
		
		e = new Employee[3];
		
		e[0] = new Employee(1, "x");
		e[1] = new Employee(2, "y");
		e[2] = new Employee(3, "z");
		
		
		return e;
	}

}
