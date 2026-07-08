/*Custom Exception
we create our own exceptions based on the conditions */
class AgeNotValidException extends Exception{
  AgeNotValidException(String msg){
    super(msg);
  }
}
public class CustomException {
    public static void main(String[] args){
        int age=8;
        try{ 
        if(age<18){
            throw new AgeNotValidException("Not eligible to vote");
        }
    }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
