package cernerPractice;
//import java.util.*;
import java.io.*;
import java.util.Arrays;

public class BinarySearch {
	public  void  binary_search(){
	int array[]={30,50,20,40,10};
	int x=40;
	
	Arrays.sort(array);
	for(int i=0;i<array.length-1; i++)
	{
	System.out.println(array[i]);
	}
   int last=(array.length-1);
	int first= 0;
	int key=(first+last)/2;
 int mid= array[key];
while(first<last){
 if(x==array[key])
 {
	 System.out.println("element found at index" +key);
	 break;
 }

 
 if(array[key]<x)
 {
	 last=key-1;
 }
 if(array[key]>x)
	 
 {
	 first=mid+1;
	 
	 
 }
 key=(first+last)/2;
}
 }
	public static void main(String args[]){
		BinarySearch bs=new BinarySearch();
		bs.binary_search();
	}
}
