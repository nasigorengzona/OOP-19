//made on 13th June by Erlina
public class Employee {
	String name;
	protected double salary;
	
	//validasi agar nama tidak ""
	public void ValidasiName (String name) {
		if (name.equals("")) throw new RuntimeException("Name is not valid\n");
		this.name = name;
	}
	//validasi agar salary !< 0	
	public void ValidasiSalary (double salary) {
		if (salary < 0.0) throw new RuntimeException("Salary can't be minus\\n");
		this.salary = salary;
	}
	
	//constructor;
	public Employee (String name, double salary) {
		ValidasiName(name);
		ValidasiSalary(salary);
	}
	
	public String getName () {
		return this.name;
	}
	
	public double getSalary () {
		return this.salary;
	}
	
	public double getTakeHomePay( ) {
		return this.getSalary();
	}

	public double getTax () {
		return 0.1 * this.getTakeHomePay();
	}
	
}
