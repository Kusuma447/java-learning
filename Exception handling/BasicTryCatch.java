class BasicTryCatch{
    public static void main(String[] args){
        
        try{
int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Exception is catched by catch block");
        }
        finally{
            System.out.println("completed");
        }
    }
}