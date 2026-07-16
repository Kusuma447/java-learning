class Test implements Runnable{
    public void run(){
        System.out.println("child thread");
    }
}
class RunnableInterface{
    public static void main(String[] args){
        Runnable r=new Test();
        Thread t=new Thread(r);
        t.start();
        System.out.println("main thread");
    }
}