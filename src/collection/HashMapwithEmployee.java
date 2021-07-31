package collection;

import model_class.Employee;

import java.util.HashMap;

public class HashMapwithEmployee {

    public void demo(){
        // Syntax : HashMap <key_datatype,Valu_datatype> objName = new HashMap <>();
        HashMap <Integer,Employee> Employeelist= new HashMap<>();

        // usining parametrized constructor with created object

        Employee Employee1 = new Employee("Mukesh","Manager",765,9876500);
        Employee Employee2 = new Employee("Ashish","Manager",761,987659);
        Employee Employee3 = new Employee("Manoj","Manager",763,9876500);
        Employee Employee4 = new Employee("Ram","Manager",766,987653);
        Employee Employee5 = new Employee("Aradhya","Manager",769,987659);

        // adding

        Employeelist.put(1,Employee1);
        Employeelist.put(2,Employee2);
        Employeelist.put(3,Employee3);
        Employeelist.put(4,Employee4);
        Employeelist.put(5,Employee5);

        // using variable

        Employee var = Employeelist.get(1);
        Employee var2 = Employeelist.get(2);
        Employee var3 = Employeelist.get(3);
        Employee var4 = Employeelist.get(4);
        Employee var5 = Employeelist.get(5);



        System.out.println( var.getName() +   " "  +  var.getPost() +  " "  +  var.getId() +  " "  +  var.getSalary());
        System.out.println( var2.getName() +   " "  +  var2.getPost() +  " "  +  var2.getId() +  " "  +  var2.getSalary());
        System.out.println( var3.getName() +   " "  +  var3.getPost() +  " "  +  var3.getId() +  " "  +  var3.getSalary());
        System.out.println( var4.getName() +   " "  +  var4.getPost() +  " "  +  var4.getId() +  " "  +  var4.getSalary());
        System.out.println( var5.getName() +   " "  +  var5.getPost() +  " "  +  var5.getId() +  "  "  +  var5.getSalary());

    }

    public static void main(String[] args) {

        HashMapwithEmployee obj = new HashMapwithEmployee();
        obj.demo();
    }
}
