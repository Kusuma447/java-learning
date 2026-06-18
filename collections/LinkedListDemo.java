import java.util.LinkedList;
class LinkedListDemo{
    public static void main(String[] args){
        LinkedList <Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.set(1,60));
        System.out.println(list.contains(30));
        System.out.println(list.size());
        System.out.println(list.remove(2));
    }
}