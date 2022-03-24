package DesignPattern.Singleton;

public class Admin {

    public static void main(String[] args) {
        Adminrights newAdmin=Adminrights.getInstance();
        System.out.println(newAdmin);

    }

}

class Adminrights{
    private static Adminrights instance;  // this for lazy instialization

    private Adminrights(){
        //blank
    }

    public static Adminrights getInstance(){
        if(instance==null){
            instance=new Adminrights();
        }
        return instance;
    }
}
