package Comparable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));
        students.sort(null);
        System.out.println(students);
    }
}

class  Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student o) {
        //Case - 2 (Using Double Class Properties)
        return Double.compare(o.getCgpa() , this.getCgpa()); // For Descending Order
//        return Double.compare(this.getCgpa() , o.getCgpa()); // For Ascending Order

        //Case -1 (Using Ordinary method)
        //For Ascending Order
//        if ((this.getCgpa() - o.getCgpa()) > 0) return 1;
//        else if ((this.getCgpa() - o.getCgpa()) < 1) return -1;
//        else return 0;

        //For Descending Order
//        if ((o.getCgpa() - this.getCgpa()) > 0) return 1;
//        else if ((o.getCgpa() - this.getCgpa()) < 1) return -1;
//        else return 0;
    }
}