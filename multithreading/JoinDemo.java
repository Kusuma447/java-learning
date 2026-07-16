
class Test implements Runnable{
    public void run(){
        System.out.println("child thread");
    }
}
class JoinDemo{
    public static void main(String[] args)throws InterruptedException{ 
        Runnable r=new Test();
         System.out.println("main");
        Thread t=new Thread(r);
        t.start();
        t.join();
        Thread.sleep(1000);
        System.out.println("main thread");
    }
}

