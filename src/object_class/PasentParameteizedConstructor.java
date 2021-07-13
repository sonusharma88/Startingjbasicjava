package object_class;

public class PasentParameteizedConstructor {
    String name;
    int age;
    String disease;

    public PasentParameteizedConstructor(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
    public static void main(String[] args){
        PasentParameteizedConstructor object=new PasentParameteizedConstructor("ramveer",29,"covid");
        System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.disease);
    }
}
