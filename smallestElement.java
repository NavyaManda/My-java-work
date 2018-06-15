package cernerPractice;
import java.util.*;

public class smallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int max=0;
		System.out.println("enter the value of n");
		 int n= sc.nextInt();
		 int array[]= new int[n];
		System.out.println("enter the values");
		for(int i=0; i<(n-1); i++)
		{
			array[i]= sc.nextInt();
			
		}
		for (int i=0; i<(n-1); i++)
		{
			if(array[i]<max)
			{
				max=array[i];
			}
		}
		
		System.out.println(" "+max);
		sc.close();
		
		

	}

}
