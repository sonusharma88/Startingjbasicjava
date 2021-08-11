package imp_topic;

public class StaticDemo {

    static int data = 456;

    public static void demo(){
        System.out.println("I M IN DEMO METHOD..");
    }

    public static void main(String[] args) {
       //  StaticDemo obj = new StaticDemo();
        // obj.demo();
        StaticDemo.demo();
        System.out.println(StaticDemo.data);
    }
}
