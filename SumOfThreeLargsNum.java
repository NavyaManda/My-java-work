package cernerPractice;
import java.util.*;
import java.io.*;
import java.util.Arrays;

public class SumOfThreeLargsNum {
	
	public static void SumOfThreeLargestNum(int arr[], int arr_size){
		int i, first, second, third;
		if(arr_size<3)
		{
			System.out.println("Invalid Input");
		}
		first=second=third=0;
		for(i=0; i<arr_size; i++)
		{
			if(arr[i] > first)
		{
				third=second;
				second=first;
				first=arr[i];
			
		}
			else if(arr[i]>second) 
			{
				third=second;
				second=arr[i];
				
			}
			else if(arr[i]>third)
			{
				third=arr[i];
			}
		}
			System.out.println("   " +first+" " +second+" "+third);
			System.out.println("" +(first+second+third));
			
		
		
	}


public static void main(String args[])
{
	int arr[]={9,2,10,8,56};
	int n= arr.length;
	SumOfThreeLargestNum(arr,n);
}
}
