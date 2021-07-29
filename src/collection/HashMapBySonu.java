package collection;

import java.util.HashMap;

public class HashMapBySonu {
    public void Demo(){

        // Synatax : HashMap<key_DataType,Value_DataType> OBjName= new HashMap<key_DataType,Value_DataType>();

        HashMap<Integer,String > cityname=new HashMap<Integer,String>();

        cityname.put(1,"KANPUR");
        cityname.put(2,"PUNE");
        cityname.put(3,"AGRA");
        cityname.put(4,"PINAHAT");
        // getting use
        System.out.println("HashMap Printing Valus " +cityname.get(1));
        System.out.println("HashMap Printing Valus " +cityname.get(2));
        System.out.println("HashMap Printing Valus " +cityname.get(3));
        System.out.println("HashMap Printing Valus " +cityname.get(4));
        System.out.println("HashMap Printing Valus " +cityname.get(5));


    }

    public static void main(String[] args) {
        // created object
        HashMapBySonu obj=new HashMapBySonu();
        obj.Demo();

    }


}
