/*HashMap uses hashfuntion to store key-value pairs.
it stores in buckets using some implementation.
it checks the buckets based on the que by again a hashfunction.
it directly goes to particular bucket based on the calculations,
so thats why it is o(1)
 */

import java.util.HashMap;
class HashMapEx{
    public static void main(String[] args) {
        HashMap <Integer, String> map =new HashMap<>();
        map.put(101,"javaAccount");
        map.put(102,"pythonAccount");
        map.put(103,"SPringBootAccount");
        System.out.println(map);
        System.out.println(map.get(102));
    }
}