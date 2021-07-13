package methods;

public class College {
    // study, fees, palacement,
      //  santax methods
    public void palacement(){
        System.out.println("This is a palacement");
    }
    public void feesmethods(){
        System.out.println("This is a fees");
    }

    public void studymethods(){
        System.out.println("This is a Study");
    }

    public static void main(String[] args){
        // calling
        College object = new College();
        object.studymethods();
        object.feesmethods();
        object.palacement();

    }

}
