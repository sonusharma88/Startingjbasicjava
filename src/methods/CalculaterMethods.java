package methods;

public class CalculaterMethods {

    // add, sub, div, mul,
    public void mulmethods(){
        System.out.println("This is a mul");
    }

    public void divmethods(){
        System.out.println("This is a Div");
    }


  public void submethods(){

        System.out.println("This is a sub");
  }



    public void addmethods(){

        System.out.println("This is a Add");
    }



    public static void main(String[] args){



        CalculaterMethods object = new CalculaterMethods();
        object.addmethods();
        object.submethods();
        object.divmethods();
        object.mulmethods();
    }



}
