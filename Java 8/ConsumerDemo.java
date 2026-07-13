import java.util.function.Consumer;
public class ConsumerDemo {
    public static void main(String[] args){
        Consumer<String>p=n->System.out.println(n);
        p.accept("java");
    }
}


