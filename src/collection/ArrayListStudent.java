package collection;

import model_class.Student;

import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {



    // Arraylist Syntax : ArrayList <datatype> objName=new ArrayList<datatype>();

    ArrayList<Student> StudentList = new ArrayList<>();
    // using created parameterised constructor
    Student Student1 = new Student("Ramesh", 43, 546342, "cse");
    Student Student2 = new Student("Raj", 45, 546346, "ME");
    Student Student3 = new Student("Manisha", 44, 5463454, "IT");
    Student Student4 = new Student("Upadhya", 54, 5463675, "CSE");

    // adding
        StudentList.add(Student1);
        StudentList.add(Student2);
        StudentList.add(Student3);
        StudentList.add(Student4);
        // using advance loop
        for(Student var: StudentList){
            System.out.println("Printing Name  " +var.getName());
            System.out.println("Printing Age  " +var.getAge());
            System.out.println("Printing Roll No  " +var.getRollno());
            System.out.println("Printing Branch " +var.getBranch());
        }

    }
}






