package cernerPractice;
class eat{
	public void eating()
	{
		System.out.println("I am eating");
		
	}
	}
	class drink extends eat(){
		public void drinking()
		{
			System.out.println("I am drikinh=g water");
			}
	}
	

public class HierarchyInherit extends eat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  drink obj=new drink();
  obj.eating();
  obj.drinking();
  
	}

}
