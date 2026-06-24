import java.util.ArrayList;
import java.util.List;
class StreamDemo{
    public static void main(String[] args){
      ArrayList <Integer> nums=new ArrayList<>();
      nums.add(10);
      nums.add(20);
      nums.add(30);
      nums.add(40);
      nums.add(50);
      nums.stream()
      .filter(n->n>20)
      .map(n->n*2)
      .forEach(System.out::println);

      //creating new list
      List<Integer> list=nums.stream().map(n->n*10).toList();
      System.out.println(list);
      //original list
      System.out.println(nums);




    }
}