package storingobjects;

public class HotelMainClass {
	public static void main(String[] args) {
		Hotel h1=new Hotel("Taj",8.9);
		Hotel h2=new Hotel("ITC",8.3);
		Hotel h[]= {h1,h2};
		for(int i=0;i<h.length;i++)
		{
			System.out.println("The rating of "+ h[i].name + "  is "+h[i].ratings);
		}
		
	}
}

