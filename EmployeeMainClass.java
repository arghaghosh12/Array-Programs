package storingobjects;

class EmployeeMainClass {

	public static void main(String[] args) {	
		Employee[] e= new Employee[3];
		e[0]=new Employee("Dip",56.3);
		e[1]=new Employee("Kishalay",23.5);
		e[2]=new Employee("animesh",24.3);
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].name +" salary is "+ e[i].salary);
		}
		
	}
}
