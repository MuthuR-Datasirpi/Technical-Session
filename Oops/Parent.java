public class Parent {
     void details(){
        System.out.println("Parent class");    
     }
}

class Child1 extends Parent{
    void print(){
        System.out.println("Child_1");  
    }
}

class Child2 extends Child1{
    void last(){
        System.out.println("Child_2");
    }
}

class ParentDrive{
    public static void main(String[] args) {
        Child2 c2=new Child2();
        System.out.println("Accessing from child2");
        c2.last();
        c2.print();
        c2.details();
        System.out.println("");
        Child1 c1=new Child1();
                System.out.println("Accessing from child1");
            c1.print();
            c1.details();

    }
}


