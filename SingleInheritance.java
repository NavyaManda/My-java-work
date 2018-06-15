package cernerPractice;

class inherit{
	public void  parent(){
		System.out.println("this is parent class method");
	}
}

public class SingleInheritance extends inherit{
	public static void main(String args[])
	{
		SingleInheritance obj= new SingleInheritance();
		obj.parent();
	}

}
