/* objects execution flow
   when object created default values were intialized by JVM.
   instance variables were intialized after that.
   then constructor were called and values were intializzed.
 */
class Student{
    int age=0;
    String name="null";
    Student(){
        age=10;
        name="java";
    }
}
class ObjectsDemo{
    public static void main(String[] args){
        Student s=new Student();
        System.out.println(s.age);
        System.out.println(s.name);
    }
}