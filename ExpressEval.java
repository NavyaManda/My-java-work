package cernerPractice;

public class ExpressEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="776 ab+c";
		String number=input.trim().split(" ")[0];
		String expression=input.trim().split(" ")[1];
		int operatorIndex=0;
		long output=0;
		if(expression.contains("+")){
			operatorIndex=expression.indexOf("+");
			output=
			Long.parseLong(number.substring(0 , operatorIndex))+
			Long.parseLong(number.substring(operatorIndex, number.length()));
					
		}
		else{
			operatorIndex=expression.indexOf(" -");
			output=
		    Long.parseLong(number.substring(0,operatorIndex))-
		    Long.parseLong(number.substring(operatorIndex, number.length()));
		}
		System.out.println(output);
		

	}

}
