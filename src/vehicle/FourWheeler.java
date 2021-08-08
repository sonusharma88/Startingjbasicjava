package vehicle;

public class FourWheeler extends Vehicle {

public void demo() {
    System.out.println("This is a Four Wheeler.");
}
    public static void main(String[] args) {

        FourWheeler obj = new FourWheeler();
        obj.DisplayInfo();
        obj.demo();

    }

    @Override
    public void service() {

    }
}
