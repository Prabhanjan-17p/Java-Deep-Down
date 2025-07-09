package Comparator;

import java.util.ArrayList;
import java.util.List;

class  Student{
    private  String name;
    private  double cgpa;

    public  Student(String name , double cgpa){
        this.cgpa = cgpa;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student [" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ']';
    }
}

public class StudentCompare {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        //Sort using lambda
//        students.sort(((o1, o2) -> { // For Ascending
//            if ((o1.getCgpa() - o2.getCgpa()) > 0) return 1;
//            else if ((o1.getCgpa() - o2.getCgpa()) < 1) return -1;
//            else return 0;
//        }));

        students.sort(((o1, o2) -> {  // // For Descending
            if ((o2.getCgpa() - o1.getCgpa()) > 0) return 1;
            else if ((o2.getCgpa() - o1.getCgpa()) < 1) return -1;
            else return 0;
        }));

        for (Student s : students){
            System.out.println(s);
        }
    }
}
