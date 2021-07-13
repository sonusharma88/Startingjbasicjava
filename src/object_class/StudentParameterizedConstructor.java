package object_class;

public class StudentParameterizedConstructor {
    // Parameterized Constructor is used to  parameters
    //Parameterized Constructor is not usd Value
    String name;
    int rollno;
    String branch;
    String corse;

    public StudentParameterizedConstructor(String name, int rollno, String branch, String corse) {
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
        this.corse = corse;
    }

    public static void main(String[] args) {
        //Santax classname object=new classname();
        StudentParameterizedConstructor object = new StudentParameterizedConstructor("Raj", 5443, "cse", "B.tech");
        System.out.println(object.name);
        System.out.println(object.rollno);
        System.out.println(object.branch);
        System.out.println(object.corse);

        StudentParameterizedConstructor object1 = new StudentParameterizedConstructor("sapna", 54890, "civil", "poly");


        System.out.println(object1.name);
        System.out.println(object1.rollno);
        System.out.println(object1.branch);
        System.out.println(object1.corse);
    }


}
