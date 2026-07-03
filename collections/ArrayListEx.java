/*ArrayList 
* ArrayList has an intrenal array where it stores the actual data
* adding ,resizing elements ar all managed by ArrayList
 */
import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList <Integer> list= new  ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        /*added some numbers into the array */
        System.err.println(list);
        list.remove(2);
        list.remove(0);
        /*after removing some elements in array */
        System.out.println(list);
    }
}
