abstract class One{

    One(){
        System.out.println("Constructor");
    }
    void muthu(){
        System.out.println("Iam from muthu method");
    }
    public static  String mani(String name){
        return name;
    }
    abstract void Abstract();

}
class Two extends One{
    @Override
    void Abstract() {
        System.out.println("Abstract ");
    }
}

class Three extends Two{
    void Abstract(){
        System.out.println("Abstract implementation");
    }
}

public class Abstract {
    public static void main(String[] args) {
        One obj=new Three();
        obj.muthu();
        System.out.println(obj.mani("sar"));
        obj.Abstract();
    }
}

