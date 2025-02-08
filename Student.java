package storingobjects;

public class Student {

	int age;
	Student(int age)
	{
		this.age=age;
	}
	public static void main(String[] args) {
		Student s1=new Student(20);
		Student s2=new Student(21);
		
		/*Student s[]= new Student[2];
		s[0]=s1;
		s[1]=s2;*/
		Student s[]= {s1,s2};
		for(int i=0;i<s.length;i++)
		{
			System.out.println("age is: "+ s[i].age);
		}
		
		
		
		
	}
}
