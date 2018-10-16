package xyz;

public class MergeString {

	public static void main(String[] args) {
	System.out.println(mergeStrings("abc", "def"));
	System.out.println(mergeStrings("abcx", "def"));
	System.out.println(mergeStrings("abc", "defx"));	
	}
	
	 public static String mergeStrings(String a, String b) {
		 String str="";
		 if(a.length()>=b.length() ){
			 for (int i = 0; i < b.length(); i++) {
					 str=str+a.charAt(i)+b.charAt(i);
				}
			 str=str+a.substring(b.length(), a.length());
			 return str; 
		 }else{
			 for (int i = 0; i < a.length(); i++) {
				 str=str+a.charAt(i)+b.charAt(i);
			}
		 str=str+b.substring(a.length(), b.length());
		 return str;
			 
		 }
		 
 
       
       
	  }
	 
	
	
}
