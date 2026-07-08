/*Throws
 when we are throwing an exception we need to catch it when ever we are calling it.
 throws is just for declaring that it will throw an Error be careful.
 we write throe to throw actual error.*/

import java.io.*;
class Ex{
    public void readFile() throws IOException{ 
    throw new IOException("this method throws an exception File not found.");
    }
}
public class ThrowsDemo {
    public static void main(String[] args){
        Ex x=new Ex();
        try{ 
        x.readFile();
        }
        catch(IOException e){
            System.out.println("Exception is catched");
        }
    }
}
