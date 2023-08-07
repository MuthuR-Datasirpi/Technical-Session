 class parent {
    public void one(){
        System.out.println("hello everyone");
    }
}

class child1 extends parent{
    public void two(){
        System.out.println("Im a child 1");
    }

}

class child2 extends parent{
    public void three(){
        System.out.println("Im a child 2");
    }

}

public class Hierachi{
    public static void main(String[] args) {
        child1 obj= new child1();
        obj.two();
        obj.one();
        child2 obj2=new child2();
        obj2.three();
        obj2.one();
    }
}