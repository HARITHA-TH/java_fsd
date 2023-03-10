package ustbatchno3.junit5testcases;

import java.util.List;

public class WordFreq {

	public static long countname(List<String> names, List<String> targetname) {
		// TODO Auto-generated method stub
		return names.stream().count();
	}

}
