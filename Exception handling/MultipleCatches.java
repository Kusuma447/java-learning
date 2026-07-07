
public class MultipleCatches{
    public static void main(String[] args){
        
        try{
int a=10/0;

        }
        catch(ArithmeticException e){
            System.out.println("Exception is catched by catch block");
        }
        catch(NullPointerException e){
            System.out.println("Exception is belongs to String");
        }
        finally{
            System.out.println("completed");
        }
    }
} 
    
