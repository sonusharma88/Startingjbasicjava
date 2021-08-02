package inheritance;

public class Ram {

    public void p1(){
        System.out.println("I am in p1 method of CLASS Ram");

    }
       public void p2(){
           System.out.println("I am in p2 method of CLASS Ram");

       }
    public static void main(String[] args) {
        Ram obj = new Ram();
        obj.p1();
        obj.p2();
    }

}
