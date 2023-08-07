public class Multilevel {
    public void eat(){
        System.out.println("Tom");
    }
}

class Tiger extends Singlelevel{
    public void msg(){
        System.out.println("Jerry is like a tiger");
    }
}

class Rat extends Tiger{
 public void rat(){
        System.out.println("I'm a rat");
    }

}

class Maindriver{
    public static void main(String[] args) {
        Rat obj =new Rat();
        obj.rat();
        obj.msg();
        obj.eat();
    }

}