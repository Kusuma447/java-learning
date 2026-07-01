class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    public void display(){
        System.out.println(name);
    }
}
class ThisKeyword{
    public static void main(String[] args){
        Student s=new Student("hello");
        s.display();
        
    }
}