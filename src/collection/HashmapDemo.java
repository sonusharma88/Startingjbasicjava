package collection;

import java.util.HashMap;

public class HashmapDemo {
    public void kishan(){

        // SYNTAX-: HashMap <Key_data type, value_data type> object Name = new HashMap <key_data type , value_data type>();
        HashMap<Integer,String> HashMap = new HashMap<Integer,String>();
        HashMap.put(1,"sonu");
        HashMap.put(2,"Raj");
        HashMap.put(3,"Rakesh");
        HashMap.put(4,"Hanshika");
        HashMap.put(5,"Rani");

        System.out.println("Hashmap printing values "  +HashMap.get(1));
        System.out.println("Hashmap printing values "  +HashMap.get(2));
        System.out.println("Hashmap printing values "  +HashMap.get(3));
        System.out.println("Hashmap printing values "  +HashMap.get(4));
        System.out.println("Hashmap printing values "  +HashMap.get(5));


    }

    public static void main(String[] args) {

        HashmapDemo obj=new HashmapDemo();
        obj.kishan();
    }
}
