abstract class Abrat {

    Abrat(){
        System.out.println("Abstract Method");
    }
    public static void print(){
        System.out.println("static method");
    }
    public void print_1(){
        System.out.println("Non- static method");
    }

    abstract public void Abrat_method(); 

}

class Second extends Abrat{

   public void Abrat_method(){
    System.out.println("Abstract method has succesfully done");
   }

}



class AbratDriver{
     public static void main(String[] args) {
        Abrat aT= new Second();
        Second sD= (Second)aT;

        sD.Abrat_method();

    }


}

