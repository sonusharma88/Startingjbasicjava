package object_class;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class laptop {
    // properties
    String brand="HP";
    int RAM=8;
    String Processor="I5";
    String display= "HD";
    int modelno= 5643;
    // santax: ClassName objectname=new object name();

    public static void main(String[] args){
        laptop object=new laptop();
        System.out.println("PRINTING OBJECT VALUES BRAND : " +object.brand);
        System.out.println("PRINTING OBJECT VALUES RAM : "  +object.RAM);
        System.out.println("PRINTING OBJECT VALUES PROCESSOR : " +object.Processor);
        System.out.println("PRINTING OBJECT VALUES DISPLAY : " +object.display);
        System.out.println("PRINTING OBJECT VALUES MODELNO : " +object.modelno);

    }

}
