package cernerPractice;
class adding{
	public int sum(int a , int b){ return(a+b);}
	public double sum(double a, double b){return(a+b);}
}
public class MethodOverloadingda {
	public static void main(String args[]){
		adding obj=new adding();
		System.out.println(obj.sum(10,20));
		System.out.println(obj.sum(12.8,13.9));
		
	}

}
