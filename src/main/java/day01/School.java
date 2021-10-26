package day01;

public class School {

    public static void main(String[] args) {

        Students students = new Students();
        students.addHeight(160);
        students.addHeight(180);
        students.addHeight(170);

        System.out.println(students.isHeightsIncreasing());
    }
}
