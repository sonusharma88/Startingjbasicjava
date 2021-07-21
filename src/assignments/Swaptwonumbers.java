package assignments;

public class Swaptwonumbers {
    public static void main(String[] args){

        int x=10;
        int y=20;
        System.out.println("Before Swaping Value");
        System.out.println("value of x = "   +x);
        System.out.println("Value of y = "   +y);
        System.out.println("After Swaping Value");
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("value of x = "  +x);
        System.out.println("Value of y = "  + y);
    }
}
