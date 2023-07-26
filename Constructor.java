public class Constructor {
    int a;
    String b;
    Constructor(){
        System.out.println("Passing no arguments");
        System.out.println();
    }
    Constructor(int value, String name){
        System.out.println("Passing arguments in constructor");
        a=value;
        b=name;
    }
    void details(){
        System.out.println("entered details");
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }
    static int addition(int a, int b){
        System.out.println("addition");
        return a+b;
    }
    public static void main(String[] args) {
        Constructor obj= new Constructor();
        obj.a=10;
        obj.b="Muthu";
        //calling non-static method
        obj.details();
        //calling static method
        System.out.println(addition(40,10));
    }
}
