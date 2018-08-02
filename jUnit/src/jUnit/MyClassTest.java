package jUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
	@Test
	public void testadd(){
		
		Myclass obj= new Myclass();
		int x= obj.add(2,2);
		assertEquals(4, x);
		String z= obj.concat("HELLO", "WORLD");
		assertEquals("HELLOWORLD", z);
	}

}
