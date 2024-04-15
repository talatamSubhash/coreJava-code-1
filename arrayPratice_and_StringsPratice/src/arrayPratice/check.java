package arrayPratice;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class check {

    public static void main(String[] args) {
        // Define the two maps
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(102, "Ratan");
        studentMap.put(105, "Sathya");
        studentMap.put(103, "James");
        studentMap.put(104, "Jhonson");
        studentMap.put(101, "subbu");

        Map<Integer, String> branchMap = new HashMap<>();
        branchMap.put(103, "CSE");
        branchMap.put(102, "ECE");
        branchMap.put(103, "CSE");
        branchMap.put(101, "uSE");
        branchMap.put(104, "CSE");
        
       
        // Create a list of tuples containing the student ID and branch name
        List<Map.Entry<Integer, String>> studentBranchList = new ArrayList<>();//studentMap
                                                                                //branchMap
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            int studentId = entry.getKey();
            String branchName = branchMap.get(studentId);
            if (branchName != null && branchName.equals("CSE")) {
                studentBranchList.add(entry);
            }
        }

        // Print the list of tuples
        for (Map.Entry<Integer, String> entr : studentBranchList) {
            System.out.println("Student ID: " + entr.getKey() + ", Name: " + entr.getValue());
        
        }
       // System.out.println(studentMap.getKey());
    }

}
