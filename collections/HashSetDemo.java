import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args){
        HashSet<Integer>list=new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
    System.out.println(list);
    System.out.println(list.contains(10));
    System.out.println(list.remove(10));
    System.out.println(list);
    System.out.println(list.size());

        
    }
    
}
