
/*without overriding both equals and hashcode .*/

import java.util.HashMap;
 class Student{
    int rollNo;
    String name;
    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
   /*  public boolean equals(Object obj){
        Student other=(Student)obj;
        return this.rollNo==other.rollNo;
    }
    public int hashCode(){
        return rollNo;
    }*/
}
public class StudentTest2{
    public static void main(String[] args){
        HashMap<Student,String>map=new HashMap<>();
        Student s1=new Student(101,"j");
        Student s2=new Student(101,"j");
        map.put(s1,"CSE");
        System.out.println(map.get(s2));
        s2.equals(s1);
        s2.hashCode();
    }
}