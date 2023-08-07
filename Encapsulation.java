public class Encapsulation {
    private String schoolname;
    private String principal;
    private int noOfStudents;
    private String address;

    Encapsulation(String schoolname,String principal,int noOfStudents, String address){
        this.schoolname=schoolname;
        this.principal=principal;
        this.noOfStudents=noOfStudents;
        this.address=address;
    }

    public void details(){
        System.out.println(schoolname);
        System.out.println(principal);
        System.out.println(noOfStudents);
        System.out.println(address);
    }

    public String getschoolname()
    {
        return schoolname;
    }
    public String getprincipal()
    {
        return principal;
    }
    public void setprincipal(String principal)
    {
        this.principal=principal;
    }
    public int getnoOfStudents(){
        return noOfStudents;
    }
    public void noOfStudents(int noOfStudents){
        this.noOfStudents=noOfStudents;
    }
    public String getaddress(){
        return address;
    }

}

class Driver{
    public static void main(String[] args) {
        Encapsulation a=new Encapsulation("Angelo", "Muthu", 10000, "bilcates");
        a.details();
        System.out.println(a.getaddress());
        System.out.println(a.getprincipal());
        a.setprincipal("mani");
        System.out.println(a.getprincipal());
    
    }

}
