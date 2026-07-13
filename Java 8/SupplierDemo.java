import java.util.function.Supplier;
public class SupplierDemo {
    public static void main(String[] args){
       Supplier<String>p=()->"welcome";
        p.get();
    }
}
