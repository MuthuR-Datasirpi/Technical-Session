public class Staicmethod {
    static int a;
    static double b;
    static char c;
    static boolean bo;
    static  String n;
    public static void details(){
        System.out.println("Default values");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(bo);
        System.out.println(n);
    }
     void addition(){
         System.out.println("Parent class");
    }
}
class StaticDriver extends Staicmethod{
    void addition(){
        System.out.println("Child class");
    }
    void values(){
        super.addition();
    }
    public static void main(String[] args) {
        StaticDriver obj= new StaticDriver();
        obj.values();
        Staicmethod.details();
    }
}
