class BasicThrow{
    public static void main(String[] args){
        int price=100;
        int quantity=-5;
        if(quantity<0){
            throw new IllegalArgumentException("The given value is Invalid ,Please Try again.");
        }
        System.out.println("Program completed Successfully");//it will not print if it throws an error .it will be printed only if the quantity is valid;
    }
}