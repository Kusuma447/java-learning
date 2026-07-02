class Payment{
    void pay(){
        System.out.println("there are different types of payment methods.");
    }
}
class Upi extends Payment{
    void pay(){
        System.out.println("upi");
    }
}
class Bharathpay extends Payment{
    void pay(){
        System.out.println("Bharathpay");
    }
}
class Phpay extends Payment{
    void pay(){
        System.out.println("Phpay");
    }
}
class RuntimePoly{
    public static void main(String[] args){
        Payment p=new Upi();
        p.pay();
        p= new Bharathpay();
        p.pay();
        p= new Phpay();
        p.pay();
    }
}