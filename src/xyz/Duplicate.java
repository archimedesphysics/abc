package xyz;

import java.util.HashSet;
import java.util.Set;

public class Duplicate implements a,b {
	public static void main(String[] args) {
       int [] nums= {1,2,1,3,1,4,5};
       duplicate(nums); 
     
		
	}
	
	private static void duplicate(int []arr){
		
		String unique=""; 
		Set <Integer> setDuplicates= new HashSet(); 
		Set <Integer> setUnique= new HashSet(); 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]){
					setDuplicates.add(arr[i]); 
					
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (Integer duplicate : setDuplicates) {
				if (!(arr[i]==duplicate)){
					setUnique.add(arr[i]); 
					
				}
			}
		}
		
		for (Integer integer : setUnique) {
			unique=unique+","+integer.toString();  
		}
		System.out.println(unique);
		
		
		
	}
	
}
/*
 * 
 * 
 * */
 