package lab2;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItems;

import java.util.List;

import org.junit.Test;

public class CongregationTest {

	@Test
	public void testGetList() {
		Congregation cgn=new Congregation();
		List<String> list = cgn.getList("Junit3");
		assertThat(list, hasItems("Junit3"));
	}

}
