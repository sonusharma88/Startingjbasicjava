package inheritance;

public class MethodOverloading {
    public void demo(){
        // Syntax : Method Overloading  same Method Name but different parameters

        System.out.println("This is a demo Method ");
    }

    public void demo(int a) {
        // Syntax : Method Overloading Method same but different parameters
        System.out.println("This is a Method Overloded  " + a);
    }

        public void demo(int a, int b) {
            // Syntax : Method Overloading Method same but different parameters
            System.out.println("This is a Method Overloded  " + a + b);
        }



    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.demo();
        obj.demo(2);
        obj.demo(37);
    }
}
