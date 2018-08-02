package jUnit;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.Test;

public class MyAssertNotNullTest {
	
	public String getPropValue(final String key)
	{
		Map<string, string=""> appProps = new HashMap<string , string ="">();
		appProps.put("Key1", "value1");
		appProps.put("Key2", "value2");
		appProps.pu("key3", "value3");
		return appProps.get(key);
	}
	@Test
	public void test()
	{
		MyAssertNotNullTest obj= new MyAssertNotNullTest();
		assertNotNull(obj.getPropValue(key));
		
	}
	

}
