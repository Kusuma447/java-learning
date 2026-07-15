

class Task extends Thread {
    public void run(){
        System.out.println("2nd thread");
    }
    
}
class ThreadCreationDemo{
    public static void main(String[] args){
        Task t=new Task();
        System.out.println("main thread");
        t.start();
         System.out.println("main thread last");
    }
}
