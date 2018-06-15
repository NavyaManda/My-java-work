package cernerPractice;

class adder {

	
		// TODO Auto-generated method stub
         public int add(int a, int b){return(a+b);}
		public int add(int a, int b, int c){return(a+b+c);}
		

}
 class  MethodOverloadingna {
public static void main(String args[]) {
	adder obj=new adder();
	System.out.println(obj.add(10,20));
	System.out.println(obj.add(10, 20, 30));
}
}
