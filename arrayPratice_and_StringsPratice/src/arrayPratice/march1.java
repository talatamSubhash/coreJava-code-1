package arrayPratice;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class march1 {
 //private static IntStream b;

public static void main(String[] args) {
	
	String str="is is our is";
	String[] stre=str.split("\\s+");
	Map<String,Integer>wordFreqMap=new HashMap<>();
	for( String stri:stre) {
		wordFreqMap.put(stri,wordFreqMap.getOrDefault(stri, 0)+ 1);
}
	for(Map.Entry<String,Integer>words:wordFreqMap.entrySet()) {
		System.out.println(words.getKey()+"--> "+words.getValue());
	}
}
}

//        String str = "is this i our what i for is subbu our i";
//        String[] words = str.split("\\s+");
//
//        Map<String, Integer> wordFreqMap = new HashMap<>();
//
//        for (String word : words) {
//            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
//        }
//
//        for (Map.Entry<String, Integer> entry : wordFreqMap.entrySet()) {
//            System.out.println(entry.getKey() + " --> " + entry.getValue());
//        }
//    }
//}
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
//		    int count=countTwoInRange(43);
		  //System.out.println(count);
//		  		    }
//		  		    public static int countTwoInRange(int n) {
//		  				int count=0;
//		  				for(int i=0;i<=n;i++) {
//		  					count+=counTwos(i);
//		  		    }
//		  				return count;
//		  			}
//		  		
//		  		    
//		  			public static int counTwos(int num) {
//		  				int count=0;
//		  				while(num>0) {
//		  					if(num%10==2) {
//		  						count++;
//		  						
//		  					}
//		  					num/=10;
//		  				}
//		  				return count;
//		  			}

