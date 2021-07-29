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
    }

}
