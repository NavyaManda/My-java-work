package cernerPractice;
import java.io.BufferedReader;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;
public class JollyJumper {
	public static String isJollyJumper(int[] input){
		List<Integer> tempArr= new ArrayList<Integer>();
		for(int i=0; i<input.length-1;i++){
			int diff= Math.abs(input[i]-input[i+1]);
			if(diff==0||diff>input.length-1)
				return"not jolly";
			tempArr.add(diff);
		}
		return"jolly";
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file= new FileReader("test.txt");
		@SuppressWarnings("resource")
		BufferedReader br= new BufferedReader(file);
		String s="";
		while((s=br.readLine())!=null){
			System.out.println(s+ ": ");
			String lines[]= s.split(" ");
			int[] input= new int[lines.length];
			for(int i=0; i<input.length; i++)
				input[i]= Integer.parseInt(lines[i]);
		}
		System.out.println(isJollyJumper(input));
		}
		

	}

}
