package Comparator;

import java.util.*;

class Employee2 {
    private int id;
    private String name;
    private double salary;
    private String desc;

    // Constructor
    public Employee2(int id, String name, double salary, String desc) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.desc = desc;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + salary + " | " + desc;
    }
}

public class Main3 {
    public static void main(String[] args) {

        List<Employee2> empList = new ArrayList<>();

        empList.add(new Employee2(101, "Ravi", 30000, "Developer"));
        empList.add(new Employee2(102, "Anil", 25000, "Tester"));
        empList.add(new Employee2(103, "Ravi", 20000, "Intern"));
        empList.add(new Employee2(104, "Anil", 40000, "Manager"));
        empList.add(new Employee2(105, "Suresh", 28000, "Support"));

        // Sort by Name (ASC) then Salary (ASC)
        empList.sort(
                Comparator.comparing(Employee2::getName)
                        .thenComparing(Employee2::getSalary)
        );

        // Display sorted employees
        for (Employee2 e : empList) {
            System.out.println(e);
        }
    }
}
