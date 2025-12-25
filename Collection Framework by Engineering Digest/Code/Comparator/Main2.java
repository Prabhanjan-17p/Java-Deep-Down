package Comparator;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Ravi", 30000, "Developer"));
        empList.add(new Employee(102, "Anil", 25000, "Tester"));
        empList.add(new Employee(103, "Ravi", 20000, "Intern"));
        empList.add(new Employee(104, "Anil", 40000, "Manager"));

        Collections.sort(empList, new NameSalaryComparator());

        for (Employee e : empList) {
            System.out.println(e);
        }
    }
}


class Employee {
    int id;
    String name;
    double salary;
    String desc;

    Employee(int id, String name, double salary, String desc) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary + " " + desc;
    }
}


class NameSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {

        int nameCompare = e1.name.compareTo(e2.name);

        if (nameCompare != 0) {
            return nameCompare; // sort by name
        }

        return Double.compare(e1.salary, e2.salary); // then by salary
    }
}




