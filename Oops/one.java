class ovrload{
    public static String greet(){
        return "Hello";
    }
    public static String greet(String name){
            return "Hello "+ name;
    }

    public static void main(String[] args){
        System.out.println(greet());
        System.out.println(greet("sansa"));
    }
}