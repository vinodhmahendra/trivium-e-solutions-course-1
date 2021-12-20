
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("tom");
		System.out.println("Name: " +e1.getName());
		System.out.println("Role : "+e1.getTitle());
		
		try {
			e1.promoteToCEO();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		
		Employee e2 = new Employee("ganesha");
		System.out.println("Name: " +e2.getName());
		System.out.println("Role : "+e2.getTitle());
		
		e2.promoteToManger();
		System.out.println("Name: " +e2.getName());
		System.out.println("Role : "+e2.getTitle());
		try {
			e2.promoteToCEO();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Role : "+e2.getTitle());

	}

}
