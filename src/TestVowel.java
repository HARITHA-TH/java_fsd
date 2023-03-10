package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

	 

	 




public class TestVowel {

 

 @Test

 public void counttesting() {

 

 String input ="swetha";

 

 int expected=2;

 int actual=Vowels.vowelscount(input);

 assertEquals(expected,actual);

 

 }



 

 

 

 

}

	 


