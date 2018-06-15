package cernerPractice;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s= "aba eee mnm";
  String[] arr=s.split(" ");
  for(int i=0; i<arr.length;i++)
  {
	  System.out.println(arr[i]);
	  System.out.println(isPalindrome(arr));
  }
  


  public isPalindrome(String[] arr){
	String temp=" ";
	String rev= arr; 
	int len=arr.length();
	
	for(int i=len-1; i>=0;i--)
	
		
		 { 
			temp= temp+(arr.charAt(i));
			 
		 }
		 


		 if(temp.equals(rev))
		 {
			 System.out.println("true");
		 }
		 else 
		 {
			 System.out.println("false");
		 }
  
  }
	}


