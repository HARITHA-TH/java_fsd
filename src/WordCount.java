package ustbatchno3.junit5testcases;
import java.util.List;


public class WordCount
{
    

	public static long countname(List<String> names, String targetname) {
		
		return names.stream().filter(n->n.equalsIgnoreCase(targetname)).count();
	}
}
