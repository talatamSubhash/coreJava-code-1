package arrayPratice;
import java.util.*;
import java.lang.*;
public class Strings {
public static void main(String[]args) {
	
	
	        String str = "1,2,3,-3,7,*10";
	      
	      //  int result = calculateExpression(str);
	        
	       
	  
	
	        String[] elements = str.split(",");
	        int sum = 0;
	        int multiplier = 1;

	        for (String element : elements) {
	            if (element.startsWith("*")) {
	                multiplier = Integer.parseInt(element.substring(1));
	            } else {
	                sum += Integer.parseInt(element);
	            }
	        }
	        System.out.println(sum*multiplier );


	       
	    }
	}
