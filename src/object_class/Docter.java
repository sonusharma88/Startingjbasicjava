package object_class;

public class Docter {
    String DocterName= "Vishnu Sharma";
    int age= 35;
    int fees= 500;
    String spacilization="General";
    int timing=10;
    public static void main(String[] args){

        Docter object=new Docter();
        System.out.println("printing values DocterName : " +object.DocterName);
        System.out.println("printing values spacilization : " +object.spacilization);
        System.out.println("printing values age : " +object.age);
        System.out.println("printing values fees : " +object.fees);
        System.out.println("printing values timing : " +object.timing);
    }



}
