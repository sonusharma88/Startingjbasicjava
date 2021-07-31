package collection;

import model_class.Student;

import java.util.HashMap;

public class HashMapWithStudent {



    public void Demo(){

        // HashMap SYNTAX : HashMap<key_DataType,Value_DataType> objName=new HashMap<>();
        HashMap<Integer, Student> HashMapstudent=new HashMap<Integer, Student>();

        // using parametrised constructor
        Student Student1= new Student("raj",33,123432,"cse");
        Student Student2= new Student("Ramesh",87,128766,"cse");
        Student Student3= new Student("sonu",64,877587655,"cse");
        // adding
            HashMapstudent.put(1,Student1);
            HashMapstudent.put(2,Student2);
            HashMapstudent.put(3,Student3);


            // ye variable banaya h
            Student var=HashMapstudent.get(1);

            System.out.println(var.getName() + " " +var.getAge()+ " " +var.getRollno() + " " +var.getBranch());
    }




    public static void main(String[] args) {
        HashMapWithStudent object = new HashMapWithStudent();
        object.Demo();
    }
}
