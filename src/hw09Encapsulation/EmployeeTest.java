package hw09Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Fatema Aktar");
		employee.setAge(31);
		employee.setSex('F');
		employee.setCitizen(true);

		System.out.println("Employee Name:  " + employee.getName() + "\nEmployee Age:" + employee.getAge()
				+ "\nEmployee Sex:" + employee.getSex() + "\n" + "Employee Citizen:" + employee.isCitizen());
	}

}
