/*Abstract class and methods
* abstract class defined as partial implement
*abstract class have abstract method defines as that abstract class dont know about the implementation of child classes so it only
says ,if u extends me then u need to implement the method in your own (based on the condition of child class) */

abstract class Payment{
     void receipt(){
        System.out.println("transaction completed");
     }
     abstract void pay();
}
class UpiPayment extends Payment{
    void pay(){
        System.out.println("Upi Payment"); 
    }
}
class CardPayment extends Payment{
    void pay(){
        System.out.println("credit card"); 
    }
}
class AmazonPay{
    public static void main(String[] args){
        Payment p=new UpiPayment();
        p.pay();
         p=new CardPayment();
        p.pay();
    }
}