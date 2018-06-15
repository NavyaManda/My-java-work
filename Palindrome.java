package cernerPractice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int x=121;
 int temp=x;
 int rev, sum=0;
 while(x>0)
 {
 rev=x%10;
 sum= (sum*10)+rev;
 
 x=x/10;
 }
 
 if(temp==sum)
 {
	 System.out.println("palindrome");
 }
 
 else{
 System.out.println("not a palindrome");
 }
	}

}
