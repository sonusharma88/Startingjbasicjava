package inheritance;

public class A {
    public void m1(){    // created methods

        System.out.println("I am in m1 method of class A");
    }

        public void m2(){    // created methods

            System.out.println("I am in m2 method of class A");
        }

    public static void main(String[] args) {
        // created object
         A obj=new A();
         obj.m1();
         obj.m2();

    }
}
