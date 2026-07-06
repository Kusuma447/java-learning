/*Queue  is a LIFO(first in first out) .
queue uses linkedlist internallly for storing the data.
why linkedlist is because it is easy to remove the first element .
*/
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args){
        Queue<String>name=new LinkedList<>();
        name.add("j"); //adding the data into queue
        name.add("java");
        name.add("k");
        System.out.println(name);
        name.poll(); //removing the item from queue which is in front
        System.out.println(name);
        name.peek(); //shows which is next name having front place
        System.out.println(name);
         name.poll();
        System.out.println(name);
    }
}
