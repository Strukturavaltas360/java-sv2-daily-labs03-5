package day05;

public class Class {

    public static void main (String[]args){
        Journal journal = new Journal();
        String name = "Molnár Ágnes";
        String name1 = "Madonna";
        String name2 = "Kiss Ferenc";

        journal.addStudent(name);
        journal.addStudent(name1);
        journal.addStudent(name2);

        System.out.println(journal.getStudentList());
    }

}
