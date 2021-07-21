package array;

public class DemoArray {
    // Methord
    public void Demo(){
        // Syntax Array -  Data Type[]Variable_Name = {, , , , , ,};

        int[] array={1,2,3,4,5,6,7,8,9,10,11,12};

         // ADVANCE LOOP -  FOR(Datatype Variable : Array){}

        for(int var:array){
            System.out.println("inside of values "  +var);

        }
    }


    public void DemoStringArray(){


    String[] names ={"Raj","Ramesh","Rakesh","yogendra","Suresh"};
    for(String var: names){
        System.out.println("values of Name " +var);
    }
    }

    public void Demodouble(){
        double[] salary={12.56,56.67,78.99,89.25,85.12};
        for(double var:salary){
            System.out.println("price of " +var);
        }
    }
    public static void main(String[] args) {

        // created of object
        DemoArray object = new DemoArray();
        object.Demo();
        object.DemoStringArray();
        object.Demodouble();
    }
}
