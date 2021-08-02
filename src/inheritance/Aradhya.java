package inheritance;

public class Aradhya extends Ram {
    public void p3(){
        System.out.println("I am in p3 method of CLASS Aradhya");
    }


    public static void main(String[] args) {
        Aradhya obj = new Aradhya();
        obj.p1();
        obj.p2();
        obj.p3();
    }
}

