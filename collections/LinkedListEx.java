import java.util.LinkedList;
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList <String> list= new  LinkedList<>();
        list.add("java");
        list.add("spring");
        list.add("boot");
        /*added some names into the list */
        System.err.println(list);
         list.remove("spring");
        /*after removing some names in list */
        System.out.println(list);
        list.set(1,"kafka");
         System.out.println(list);
    }
}


