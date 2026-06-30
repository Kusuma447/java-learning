/*Encapsulation
*understood the core concept of encapsulation in real world
*we dont create setbalance(setter) method here because we dont need to set the balance explicitly.
*in real world scenario we can modify amount based on deposit an withdraw only
 */

class BankAccount {
    private int balance;
    public void deposit(int amount){
        if(amount>0){
        balance=balance+amount;
        }else{ 
        System.out.println("Invalid Amount");
        }
    }
    public void withdraw(int amount){
        if(amount<=0){
            System.out.println("Invalid Amount");
        }
        if(balance>=amount){ 
        balance=balance-amount;
        }else{
            System.out.println("Insufficient Balance");
        }
        
    }
    public int getbalance(){
        return balance;
    }

}
class Mini{
    public static void main(String[] args) {
        BankAccount b= new BankAccount();
        b.deposit(10000);
        b.withdraw(5000);
        System.out.println(b.getbalance());
    }
}
