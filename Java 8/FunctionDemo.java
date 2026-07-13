
import java.util.function.Function;
public class FunctionDemo {
    public static void main(String[] args){
       Function<String,Integer>p=n->n.length();
        p.apply("java");
    }
}
