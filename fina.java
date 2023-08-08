class Hello{
    //Final variable
    final int a;
    String c;
    {
        c="Welcome";
    }
    //constructor value in parameters
    Hello()
    {
        a=10;
    }
    //Final non static method

    final void muthu(){
        System.out.println("Im a non static final method");
    }
    //final static method
    final static void mani(){
        System.out.println("Im a static method");
    }

}

public class fina extends Hello{

    public static void main(String[] args) {
    fina obj=new fina();
    obj.muthu();
    obj.mani();

    }
}

