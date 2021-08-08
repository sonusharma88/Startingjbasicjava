package vehicle;

public class TwoWheeler extends Vehicle {

    public void demo(){
        System.out.println("This is a Two Wheeler");
    }

    public static void main(String[] args) {

        TwoWheeler obj = new TwoWheeler();
        obj.DisplayInfo();
        obj.demo();

    }

    @Override
    public void service() {

    }
}
