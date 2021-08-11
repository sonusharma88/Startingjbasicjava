package exception_Handling;

public class Exception_demo {
    public void divid(int a , int b){
        System.out.println("Before divid method");

       /* SYNTAX : try {
                      code
                      }
                      catch(Exception E)
                      }
        */

        try {
            int result=a/b;
        }
        catch(Exception E){
            System.out.println("Exception occurd.." +E);
        }
finally {
            System.out.println("I M FINALLY BLOCK AND I WILL GET EXCEPTION EVERY TIME......");
        }


        System.out.println("After divid method");
        // System.out.println("result "  +result);
    }

    public static void main(String[] args) {
        Exception_demo obj = new Exception_demo();
        System.out.println("Inside main method");
         obj.divid(6,0);
        obj.divid(8,2);
        System.out.println("After inside main method ");
    }
}
