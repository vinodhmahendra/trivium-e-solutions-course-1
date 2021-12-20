
public class Employee {

	private String name;
	private Role role;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		if ( role == null ) {
			return "Employee";
		}else {
			return role.getRoleName();
		}
	}
	
	public void promoteToManger() {
		role = new Manager();
	}
	
	public void promoteToCEO()  throws CustomException{
		if ( role == null || !role.getRoleName().equals("Manager")) {
			throw new CustomException("only a manager can be promoted to CEO");
		}
		
		role = new CEO();
	}
	
	public String getName() {
		return name;
	}
}
