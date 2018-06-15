package cernerPractice;

public class Exceptions {

	public static void main(String args[]) {
	try{	// TODO Auto-generated method stub
		int a=50/0;
	}
	catch(Exception e){
	e.printStackTrace();
	}

	
	try{
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e){
		e.printStackTrace();
	}

}
}
