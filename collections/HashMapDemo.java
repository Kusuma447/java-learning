import java.util.HashMap;
class HashMapDemo{
  public static void main(String[] args) {
    HashMap<Integer,String>map=new HashMap<>();
    map.put(1,"java");
    map.put(2,"python");
    map.put(2,"Spring Boot");
    System.out.println(map);
    System.out.println(map.get(1));
        System.out.println(map.size());
    System.out.println(map.containsKey(3));
    System.out.println(map.containsValue("java"));
    System.out.println(map.remove(1));




  }
}