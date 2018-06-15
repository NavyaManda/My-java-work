package cernerPractice;
import java.util.*;

class MultiThreadDemo extends Thread{
	public void run(){
		try{
		System.out.println(" thread" +Thread.currentThread().getId()+ "is running");
		}
		catch(Exception e){
			System.out.println("Exception is caught");
			
		}
		
	}
}
public class MutiThreadingExample {
	
	public static void main(String args[])
	{
		
		int n=8;
		for(int i=0;i<n;i++)
		{
			MultiThreadDemo m= new MultiThreadDemo();
			m.start();
		}
	}
	
	

}
