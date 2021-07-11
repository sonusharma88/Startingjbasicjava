package object_class;

public class Employee {
    String name="Ram Sharma";
    int employeeid= 4543;
    int salary=67545;
    String post="Manager";
    public static void main(String[] args){
        Employee object=new Employee();
        System.out.println("PRINTING OBJECT VALUES NAME: "  +object.name);
        System.out.println("PRINTING OBJECT VALUES EMPLOYEE ID : " +object.employeeid);
        System.out.println("PRINTING OBJECT VALUES POST : " +object.post);
        System.out.println("PRINTING OBJECT VALUES SALARY : " +object.salary);
    }
}
