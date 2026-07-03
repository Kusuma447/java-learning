interface LoginUser{
   public void login();
    void logout();
}
class Student implements LoginUser{
   public  void login(){
        System.out.println("student can login");
    }
    public void logout(){
        System.out.println("student can logout");
    }
}
class Faculty implements LoginUser{
   public void login(){
        System.out.println("faculty can login");
    }
    public void logout(){
        System.out.println("faculty can logout");
    }
}
class Interface{
    public static void main(String[] args){
        LoginUser l=new Student();
        l.login();
        l.logout();
        l=new Faculty();
        l.login();
        l.logout();
    }
}