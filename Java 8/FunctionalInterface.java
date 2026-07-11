@FunctionalInterface
interface Demo{
    String name(String n);
}
public class FunctionalInterface {
    public static void main(String[] args){
     Demo d=(n)->n+"Hello";
     String n="java";
     String c=d.name(n);
     System.out.println(c);
    }
}
