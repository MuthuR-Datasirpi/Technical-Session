class A{
    void mani(){
        System.out.println("I am mani");
    }
    void sarmatha(){
        System.out.println("I am saramtha");
    }
}


interface B{
    void muthu();
    public static void st(){
        System.out.println("Hello im a static method");
    }
}

interface  C{
    void saras();
}

class D extends A implements B,C {


    @Override
    public void muthu() {
        System.out.println("implemented for muthyu");
    }


    @Override
    public void saras() {
        System.out.println("implemented for saras");
    }
}


public class Inter{
    public static void main(String[] args) {


        D obj=new D();
        obj.muthu();
        obj.mani();
        obj.sarmatha();
        obj.saras();
        B.st();


    }
}





