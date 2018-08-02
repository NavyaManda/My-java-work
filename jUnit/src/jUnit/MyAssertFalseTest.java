package jUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyAssertFalseTest {

	 public boolean isEvenNumber(int number)
	 {
		 boolean result=false;
		 if(number%2 == 0)
		 {
			 result=true;
			 
		 }
		 return result;
	 }
	  @Test
	  public void evenNumberTest()
	  {
		  MyAssertFalseTest obj= new MyAssertFalseTest();
		  assertFalse(obj.isEvenNumber(5));
		  assertTrue(obj.isEvenNumber(5));
	  }
}
