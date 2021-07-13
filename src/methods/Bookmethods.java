package methods;

public class Bookmethods {
    // read, write, buy

    public void buymethods(){
        System.out.println("This is a buy book");
    }


    public void writemethods(){
        System.out.println("This is a write book");
    }


    public void readmethods(){
        System.out.println("This is a read book");
    }

    public static void main(String[] args){

        // calling are two staps 1 created object 2 object.methods name
        Bookmethods object = new Bookmethods();
        object.readmethods();
        object.writemethods();
        object.buymethods();
    }

}
