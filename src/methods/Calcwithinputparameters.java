package methods;

public class Calcwithinputparameters {
    // calc program add, mul, div, sub

    public void add(int a, int b){
        int sum=a+b;
        System.out.println("add valuse: " +sum);
    }
    public void mul(int a,int b){
        int mul=a*b;
        System.out.println("mul: " +mul);
    }
     public void div(int a , int b){
        int result= a/b;
         System.out.println("division : " + result);
     }
     public void sub(int a,int b){
        int div=a-b;
         System.out.println("subtraction : " +div);
     }
    public static void main(String[] args){

        Calcwithinputparameters object=new Calcwithinputparameters();
        object.add(10,22);
        object.mul(22,44);
        object.div(10,2);
        object.sub(40,10);
    }
}
