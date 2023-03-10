package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WordCountTest {
	@Test
	public void countofnames(){
		
		List<String> names=Arrays.asList("sharath","kumar","sharath","sharath","sharath","sharath");
		String targetname="sharath";
		long expected=5;
		long actual=WordCount.countname(names,targetname);
		assertEquals(expected,actual);
}
}
