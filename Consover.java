public class Consover {

    {
        System.out.println("This program is Constructor overloading");
    }
    Consover(double i){
        this(10);
        System.out.println("Muthu");
    }
    Consover(int a){
        this();
        System.out.println("im");

    }
    Consover(){
        System.out.println("Hii");
    }

    public static void main(String[] args) {
        Consover obj=new Consover(10.5);
    }


}
