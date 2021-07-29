package collection;

import model_class.Employee;

import java.util.ArrayList;

public class ArrayListEmployee {
    public static void main(String[] args) {


        // ArrayList Syntax : ArrayList <DataType> objName = new ArrayList<DataType>():

        ArrayList<Employee> Employeelist = new ArrayList<>();

        // using  parameterized constructor

        Employee Employee1 = new Employee("Ashok", "Manager", 543, 54000);
        Employee Employee2 = new Employee("Akash", "MD", 543, 65551);
        Employee Employee3 = new Employee("Ramesh", "Assistant", 543, 54000);
        Employee Employee4 = new Employee("Raj", "Manager", 543, 54000);

        // add

        Employeelist.add(Employee1);
        Employeelist.add(Employee2);
        Employeelist.add(Employee3);
        Employeelist.add(Employee4);

        // using for loop
        for (Employee var : Employeelist) {

            System.out.println("Employee name  " + var.getName());
            System.out.println("Employee Post " + var.getPost());
            System.out.println("Employee id  " + var.getId());
            System.out.println("Employee  salary  " + var.getSalary());

        }
    }
}
