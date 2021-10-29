package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> studentList = new ArrayList<>();

    public boolean addStudent(String studentName) {
        if (studentName.indexOf(" ")>0) {
             studentList.add(studentName);
             return true;
        }
        return false;
    }

    public List<String> getStudentList() {
        return studentList;
    }
}



