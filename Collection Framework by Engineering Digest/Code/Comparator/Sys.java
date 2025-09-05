package Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;

public class Sys {
    public static void main(String[] args) {
        LinkedList<Emp> emps = new LinkedList<>(Arrays.asList(
                new Emp("hari", 12000, "IT"),
                new Emp("amir", 1000, "CS"),
                new Emp("kanha", 82000, "IT"),
                new Emp("rahul", 82000, "IT"),
                new Emp("amit", 82000, "CS")
        ));

        // Sort using Comparator defined in Emp class
        emps.sort(new Emp());

        // Print sorted employees
        for (Emp emp : emps) {
            System.out.println(emp);
        }




    }
}



class Single{
    private static Single sin;
    private Single(){
        if (sin != null){
            throw  new RuntimeException("Already !!!");
        }
    }

    public static  Single getInstance(){
        if (sin == null){
            synchronized (Single.class){
                if (sin == null){
                    sin = new Single();
                }
            }
        }
        return sin;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ClassCastException("not");
    }


}









class Emp implements Comparator<Emp> {
    String dept;
    double salary;
    String name;

    public Emp() {
        // No-arg constructor needed for Comparator
    }

    public Emp(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Implementing compare logic
    @Override
    public int compare(Emp o1, Emp o2) {
        int deptCompare = o1.getDept().compareTo(o2.getDept());
        if (deptCompare != 0) return deptCompare;

        int salaryCompare = Double.compare(o2.getSalary(), o1.getSalary()); // descending
        if (salaryCompare != 0) return salaryCompare;

        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public String toString() {
        return "Emp{name='" + name + "', salary=" + salary + ", dept='" + dept + "'}";
    }
}
