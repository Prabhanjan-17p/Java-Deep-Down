public class Satya {
    public static void main(String[] args) {
        Student s1 = new Student("kanha");
        Teacher t1 = new Teacher("A1",s1);
        t1.getStudentNameTechBy();
    }
}

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class Teacher{
    String tName;
    Student s;

    public Teacher(String tName, Student s) {
        this.tName = tName;
        this.s = s;
    }
    public void  getStudentNameTechBy(){
        System.out.println(s.name);
    }
}
