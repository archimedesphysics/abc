package xyz;

import java.util.Arrays;

public class Largest {
	public static void main(String[] args) {
		int [] arr={28,23,224,2,2}; 
		System.out.println(biggest(arr)); 
		
	}
	
	public static int  biggest(int[] arr){
		
	  Arrays.sort(arr);
		
		
		return arr[arr.length-1]; 
	}
	
	/*Feature : Login functionality 
	 * Background: I login to the page as a user
	 * Given: When I am on login page
	 * 
	 * Scenario:Login to the page 
	 * When I enter "<username>" and "<password>"
	 * And I click on submit button
	 * Then Title should be mainpage
	 * 
	 * 
	 * */
	
	
}
