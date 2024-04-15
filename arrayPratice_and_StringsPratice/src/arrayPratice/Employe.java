package arrayPratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employe{
	public static  void main(String[]args) { 
	String str="my name is is my sub sub for";
	String []st=str.split(" ");
			Map<String,Integer>words=new HashMap<>();
			for(String s:st) {
				words.put(s,words.getOrDefault(s, 0)+1);
			}
			for(Map.Entry<String,Integer>word:words.entrySet()) {
				System.out.println(word.getKey()+" --->"+word.getValue());
			}
}
}

	
	
	

	
		




			
			
			
