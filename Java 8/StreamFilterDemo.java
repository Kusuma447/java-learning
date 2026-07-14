import java.util.*;
class StreamFilterDemo{
   public static void main(String[] args) {
        ArrayList<Integer> n =new ArrayList<>();
        n.add(10);
        n.add(2);
        n.add(30);
        n.add(7);
        System.out.println(n);
       n.stream().filter(x->x%2==0).forEach(System.out::println);
    }
}