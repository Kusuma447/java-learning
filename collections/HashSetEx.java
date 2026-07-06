/* Hashset (internally uses Hashmap while storing data).
    HashSet doesnot allow duplicates.
    the value stored based on the hashcode -> bucket -> storing in that bucket.
    if the same value appears twice it will be having same hashcode ans bucket no. when it is went to bucket here checks with equals()
    if it is same it will ignore the new one and stick with old one.


 */

import java.util.HashSet;
public class HashSetEx{
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        set.add("java");
        set.add("spring");
        set.add("java");//by storing same value it will not allow this duplication and stick with old value
        System.out.println(set);
    }
}