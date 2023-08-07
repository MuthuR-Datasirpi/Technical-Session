class Singlelevel {
    public void eat(){
        System.out.println("Tom");
    }

}

class Tiger extends Singlelevel{
    public void msg(){
        System.out.println("Jerry is like a tiger");
    }
}

class Driver{
    public static void main(String[] args) {
        Tiger obj=new Tiger();
        obj.msg();
        obj.eat();
    }
}
