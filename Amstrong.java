package cernerPractice;

public class Amstrong {
	public static void main(String args[])
	{
		
		int sum=0;
		String s= "408";
		for(int i=0;i<s.length();i++)
		{
			sum= (int)(sum+
				Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))), 3));
		}
		if(s.equals(String.valueOf(sum)))
		{
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
		}
	}
/*Here I am calculating the cube of each number by math.pow function and for loop then 
 *  comparing
 * the obtained value with given string using equals method if both values are equal 
 * then the given string I am printing it as an armstrong number 
 */

