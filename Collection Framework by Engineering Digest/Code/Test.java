import java.util.*;

//public class Test implements Comparator<StudentEn> {
public class Test implements Comparator<Dept> {
    public static void main(String[] args) {
        //For Student Class
//        List<StudentEn> list = new ArrayList<>(Arrays.asList(
//                new StudentEn("micky","ct",1),
//                new StudentEn("kanha","java",1),
//                new StudentEn("Arun","Math",9)));
//        Collections.sort(list,new Test());
//        System.out.println(list);


        //For Dept class
        List<Dept> list1 = new ArrayList<>(Arrays.asList(
                new Dept("Rohit", "HR", 32000.0),
                new Dept("Rohit", "HR", 30000.0),         // same name, same dept, different salary
                new Dept("Rohit", "Finance", 48000.0),    // same name, different dept
                new Dept("Sneha", "Development", 52000.0),
                new Dept("Sneha", "Development", 50000.0), // same name, same dept, different salary
                new Dept("Sneha", "QA", 45000.0),         // same name, different dept
                new Dept("Ankit", "Development", 52000.0),
                new Dept("Ankit", "Development", 49000.0), // same name, same dept, different salary
                new Dept("Maya", "Support", 40000.0),
                new Dept("Maya", "Support", 41000.0),      // same name, same dept, higher salary
                new Dept("Zara", "Design", 46000.0),
                new Dept("Zara", "Design", 44000.0),       // same name, same dept, lower salary
                new Dept("Aryan", "Admin", 38000.0)
        ));

        Collections.sort(list1,new Test());
        list1.stream().forEach(x -> System.out.println(x));

    }

    //For Dept Class
    @Override
    public int compare(Dept o1, Dept o2) {
        int nameSame = o1.getName().compareTo(o2.getName());
        if (nameSame == 0){
            int deptSame = o1.getDeptName().compareTo(o2.getDeptName());
            if (deptSame == 0){
                return Double.compare(o1.getSalary(),o2.getSalary());
            }
            return deptSame;
        }
        return nameSame;
    }

    //For Student
//    @Override
//    public int compare(StudentEn o1, StudentEn o2) {
//        int result = o1.getRollNo().compareTo(o2.getRollNo());
//        if (result == 0) {
//            return o1.getName().compareTo(o2.getName()); // if rollNo is same, compare by name
//        }
//        return result;
//    }


}

class StudentEn{
    String name;
    String sub;
    Integer rollNo;

    public StudentEn(String name, String sub, Integer rollNo) {
        this.name = name;
        this.sub = sub;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", sub='" + sub + '\'' +
                ", rollNo=" + rollNo ;
    }
}

class Dept{
    private String name;
    private String deptName;
    private double salary;

    public Dept(String name, String deptName, double salary) {
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+" :: "+deptName+" :: "+salary;
    }
}
