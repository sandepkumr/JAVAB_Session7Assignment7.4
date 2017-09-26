/**
 * 
 */
package assignment7_4;

import java.util.Arrays;

/**
 * @author ravasa01
 *
 */
public class Assignment7_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] stringArray = {"listen", "pot", "part", "opt", "trap", "silent", "top", "this", "hello", "hits", "what", "shit"};
		String [] sortedArray = new String[stringArray.length];
		
		for (int i=0; i<stringArray.length; i++) {
			
			char[] chr= stringArray[i].toCharArray();
			Arrays.sort(chr);
			
			sortedArray[i]= new String(chr);	
		}
		
		for (int i=0; i<stringArray.length; i++) {
			for (int j=1; j<stringArray.length-1; j++) {
				
				
			}
				
		}
		
		System.out.println(Arrays.toString(sortedArray));

	}

}
