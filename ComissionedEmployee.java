//made on 13th June by Erlina
public class ComissionedEmployee extends Employee implements Tax {
	double comission;
	
	public void ValidasiComission (double comission) {
		if (comission < 0.0) throw new RuntimeException("Comission can't be minus\\n");
		this.comission = comission;
	}
	
	public ComissionedEmployee (String name, double salary,double comission) {
		super(name, salary);
		ValidasiComission(comission);
	}
	
	public String getName () {
		return this.name;
	}
	
	public double getSalary () {
		return this.salary;
	}
	
	public double getComission () {
		return this.comission;
	}
	
	public double getTakeHomePay() {
		return this.getSalary() + this.getComission();
	}
	
	public double getTax () {
		return 0.1 * this.getTakeHomePay();
	}
	
}
