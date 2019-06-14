//made on 13th June by Erlina
public class Payroll {
	public static void main(String []args) {
		Employee e = new Employee("Budi",2000.0);
		ComissionedEmployee ce = new ComissionedEmployee("susi",2000.0, 500.0);
		
		System.out.printf("TAX dari %s : %.2f\n", e.getName(), e.getTax());
		System.out.printf("TAX dari %s : %.2f\n", ce.getName(), ce.getTax());
	}

}
