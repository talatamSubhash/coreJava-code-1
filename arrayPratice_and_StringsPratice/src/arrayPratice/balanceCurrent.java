package arrayPratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class balanceCurrent {
public static void main(String[]args) {
	Map<Integer,String>branchName=new HashMap<>();
	branchName.put(101,"mech");
	branchName.put(102,"ece");
	branchName.put(103, "mech");
	branchName.put(104,"cse");
	branchName.put(105, "mech");
	
	Map<Integer,String>studentName=new HashMap<>();
	studentName.put(101,"subbu");
	studentName.put(102,"sri");
	studentName.put(103,"venky");
    studentName.put(104,"maha");
    studentName.put(105,"mani");
      
    List<Map.Entry<Integer,String>>students=new ArrayList<>();
		for(Map.Entry<Integer,String>entry:studentName.entrySet()) {
			int studentId=entry.getKey();
			String branch=branchName.get(studentId);
			if(branch!=null&&branch.equals("mech")) {
				students.add(entry);
			}
			
		}
		for(Entry<Integer, String> stud:students) {
		System.out.println(stud.getKey()+stud.getValue());
	}



}
}
