
package storingobjects;
import java.util.Scanner;
class SumOfArray {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		int arr[]=new int [n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			
		}
		
		
		
		
		
		
	
		double average=sum/n;
		System.out.println("The sum of the array is: "+sum);
		System.out.println("The average of the array is: "+average);
		
	}
}
