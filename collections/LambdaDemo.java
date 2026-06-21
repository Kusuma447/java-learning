interface Maths{
   int show(int a,int b);
}
class LambdaDemo{
     public static void main(String[] args) {
        Maths add=(a,b) -> a+b;
         Maths sub=(a,b) -> a-b;
          Maths mul=(a,b) -> a*b;
           Maths div=(a,b) -> a/b;
           System.out.println(add.show(10,2));
            System.out.println(sub.show(10,2));
             System.out.println(mul.show(10,2));
              System.out.println(div.show(10,2));
        
    }
}