package Map.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashMap_Equals_Hashcode_Method {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();
        Student s1 = new Student("Allen",1);
        Student s2 = new Student("Blake",2);
        Student s3 = new Student("Allen",1);
        map.put(s1,"Engineer");
        map.put(s2,"Designer");
        map.put(s3,"Manger");

        //s1 and s3 are not replace because of s1 and s3 are 2 different memory stored in different different location
        // To avoid this we used hashcode and equals method.
        System.out.println("Size of Map : "+map.size());
        System.out.println("Value of S1 : "+map.get(s1));
        System.out.println("Value of S3 : "+map.get(s3));


        //In case of String it replace the value automatic
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("kanha",70);
        map1.put("Hari",82);
        map1.put("kanha",91);
        System.out.println("Size is : "+map1.size());
        System.out.println("Mark of kanha : "+map1.get("kanha"));
    }
}

class  Student{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id); // Objects Method call
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return  false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Student std = (Student) obj;
        return id == std.getId() && Objects.equals(name , std.getName());
    }

    @Override
    public String toString() {
        return "Id: "+id+" , Name: "+name;
    }
}
