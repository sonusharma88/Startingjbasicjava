package vehicle;

public abstract class Vehicle {

    int engineno = 5432;
    int milege = 23;
    String brand = "TATA";



    // created method
    public void DisplayInfo(){

        System.out.println("Vehicle Details .."  + engineno + " " + brand + " " + milege);
    }

    // abstract using with out body method


public abstract void service();




    }


