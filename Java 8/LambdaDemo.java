/**
 * Lambda
 * implementing lambda .
 */
 interface Calculator {
   int add(int a,int b);
    
}
public class LambdaDemo{
    public static void main(String[] args) {
      Calculator c=(a,b)->a+b;
      int a=10;
      int b=9;
      int r=c.add(a,b);
      System.out.println(r);
    }
}