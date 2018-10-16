package abc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Interview {

	public static void main(String[] args) {

		System.out.println(longest("abc adas aaaaa xyztfh asdas xxxxxxxxxxxx"));
		System.out.println(isRepeating("aaaa"));
	}

	public static String longest(String sentence) {

		String str="";
		String [] strArr=sentence.split(" "); 
		Map<Integer, String> map= new TreeMap();
		int count=0; 
		
		for (String each : strArr) {
			if(!(isRepeating(each))){
				map.put(each.length(), each);
				if(each.length()>count){
					count=each.length(); 
				}
				}
		}
		return map.get(count); 
	}

	public static boolean isRepeating(String str) {
		boolean bool = true;
		List<String> lst = new ArrayList<>();
		Set<String> set = new HashSet();
		for (int i = 0; i < str.length(); i++) {
			lst.add(""+str.charAt(i));
			set.add(""+str.charAt(i));
		}
		if ((lst.size()==set.size())) {
			bool = false;
		}

		return bool;
	}
	
	
}
