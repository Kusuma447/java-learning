class Animal{
    void sound(){
        System.out.println("sound");
    }
}
class buffalo extends Animal{
    void sound(){
        System.out.println("umbhaaaa");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("meow..");
    }
}
class Polymorphism{
    public static void main(String[] args){
        Animal a=new cat();
         a.sound();
    }
}