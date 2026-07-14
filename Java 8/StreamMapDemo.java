import java.util.*;
class StreamMapDemo{
   public static void main(String[] args) {
        ArrayList<Integer> n =new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(7);
        System.out.println(n);
       n.stream().map(x->x*2).forEach(System.out::println);
    }
}