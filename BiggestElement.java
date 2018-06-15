package cernerPractice;

import java.util.Scanner;


public class BiggestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		int n= sc.nextInt();
		int max=0;
		
		int array[]= new int[n];
		System.out.println("enter array elements");
		
		for(int i=0; i<n; i++)
		{
			array[i]= sc.nextInt();
			
		}
		
		
		for(int i=0; i<(n-1); i++)
		{
			if(array[i]>max)
			{
				max=array[i];
				
			}
		
		}
		System.out.println(" " +max);
		sc.close();
		
	
	
}
}
