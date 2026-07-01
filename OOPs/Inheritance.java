class Employee{
    private String name;
    private double salary;

    public Employee() {
        System.out.println("Employee");
    }
    
}
class Developer extends Employee{
    private String programmingLanguage;

    public Developer() {
        System.out.println("developer");
    }
    
}
public class  Inheritance{
    public static void main(String[] args) {
        Developer d=new Developer();

    }
    
}
