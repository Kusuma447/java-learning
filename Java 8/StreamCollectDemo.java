import java.util.*;
import java.util.stream.Collectors;
class StreamCollectDemo{
   public static void main(String[] args) {
        ArrayList<Integer> n =new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(7);
        System.out.println(n);
       List<Integer> a =n.stream().filter(x->x%2==0).collect(Collectors.toList());
       System.out.println(a);
    }
}