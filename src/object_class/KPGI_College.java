package object_class;

public class KPGI_College {
    String CollegeName = "K.P.G.I.";
    String Branch = "B.Tech MBA BBA BCA POLYTECHNIC BTC D.PHARMA ";
    String ClassRoom = "AC Class";
    String Staffqualification = "M.Tech";
    int Placement = 100;
    int TotalStaff = 106;

    public static void main(String[] args){
        KPGI_College object = new KPGI_College();
        System.out.println("PRINTING Values College Name : "  +object.CollegeName);
        System.out.println("Printing Values Branch : "  +object.Branch);
        System.out.println("Printing Valuse ClassRoom : "  +object.ClassRoom);
        System.out.println("Printing Valuse Staffqualification : "  +object.Staffqualification);
        System.out.println("Printing Values Placement : "  +object.Placement);
        System.out.println("Printing Values Total staff : " +object.TotalStaff);

    }
}
