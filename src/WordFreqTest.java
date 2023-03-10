package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;


public class WordFreqTest {
	
	@Test
public void countFrequency() {
	List<String> names=Arrays.asList("sharath","kumar","sharath","sharath","sharath","sharath");
	
	List<String> targetname=Arrays.asList("sharath","kumar");
	List<Integer> expected=Arrays.asList(5,1);
	long actual=WordFreq.countname(names,targetname);
	assertEquals(expected,actual);
	

}

}