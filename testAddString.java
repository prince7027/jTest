package jUnitTestPaackage;
import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
public class testAddString{
	@Test
	public void test() {
		jUnitFunctions Junit=new jUnitFunctions();
		String result =Junit.addStrings("Hello","World");
		assertEquals("HelloWorld",result);
	}
}
