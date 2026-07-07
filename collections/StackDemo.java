/*Stack is a FIFO(first in lastout) .
Stack stores iteam in LiFO order.
the item which added last will be removed first.
*/

import java.util.Stack;
public class StackDemo {
    public static void main(String[] args){
       Stack<String>name=new Stack<>();
        name.add("j"); //adding the data into queue
        name.add("java");
        name.add("k");
        System.out.println(name);
        name.pop(); //removing the item from queue which is last
        System.out.println(name);
        name.peek(); //shows the reamining order of names
        System.out.println(name);
         name.pop();
        System.out.println(name);
    }
}
