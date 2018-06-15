package cernerPractice;

 class Walk{
	public void walking(){
	System.out.println("I am walking");
 }
}
 class sleep extends Walk{
	public void sleeping(){
	System.out.println("I am sleeping");
	 }
}
public class multipleInherit extends sleep {
	public void read()
	{
		System.out.println("I am reading");
	}
 public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		
   multipleInherit obj=new multipleInherit();
   obj.walking();
   obj.sleeping();
   obj.read();
	}

}
