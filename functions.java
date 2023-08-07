
class Muthu{

    
    String name;
    int value;
    String address;

    String declare(Muthu r,String name)
    {
        r.name=name;
        return name;
    }


    public static void main(String[] args) {

    Muthu m=new Muthu();
    Muthu obj=new Muthu();
    Muthu obj2=new Muthu();
    m.declare(obj, "Mani");
    m.declare(obj2, "sarmatha");


    System.out.println(obj.name);
    System.out.println(obj2.name);


        
    }






}