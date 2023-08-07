package pac2;
import pac1.*;

public class Pc extends Game{

    Pc(int x) {
        super(x);
    }
    public static void main(String[] args) {
        Pc ob = new Pc(10);
        // System.out.println(obj.name);
        // System.out.println(obj.display(12, 90));
          
          System.out.println(ob.school);
        //!protected
        System.out.println(ob.add(5));
    }
}



