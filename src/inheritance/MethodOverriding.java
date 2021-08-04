package inheritance;

public class MethodOverriding extends MethodOverloading {
    public void demo(){
        // Method Overriding  same Method Signature but different method Body

        System.out.println("This is a Method Overriding ");
    }

    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.demo();
        obj.demo(5);
        obj.demo(85);

    }
}
