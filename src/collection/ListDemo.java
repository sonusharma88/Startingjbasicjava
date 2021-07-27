package collection;

import java.util.ArrayList;

public class ListDemo {
    public void demo(){

      //  SYNTAX: ArrayList object_Name = new ArrayList();
        ArrayList list = new ArrayList();
        list.add("RAJ");
        list.add("MUKESH");
        list.add("SUNEETA");
        list.add("SONY");
        list.add("ARADHYA");
        // ADVANCE LOOP USE
        for(Object var: list){

            System.out.println("printing list name is ..."  +var);
        }
        }

    public static void main(String[] args) {

        ListDemo obj = new ListDemo();
        obj.demo();

    }
}
