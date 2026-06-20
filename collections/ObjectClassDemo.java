class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    @Override
public String toString(){
    return name;
}
}

public class ObjectClassDemo{
    public static void main(String[] args){
        Student s1=new Student("Java");
         Student s2=new Student("Java");
          Student s3=s1;
          System.out.println(s1==s2);
           System.out.println(s1.equals(s2));
            System.out.println(s1==s3);
             System.out.println(s1.equals(s3));
              System.out.println(s1);


    }
}