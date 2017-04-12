package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class removingdupliTest {

	@Test
	public void test() {
		removingdupli rd=new removingdupli();
		String result=rd.remov("pushpa");
		assertEquals("pusha",result);
		
		
		
	}

}
