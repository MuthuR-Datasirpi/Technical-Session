
public class Store {
    private String name;
    private String address;

    Store(String name, String address){
        this.name=name;
        this.address=address;
    }
    
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setaddress(String address){
        this.address=address;
    }
}

class StoreDriver{
    public static void main(String[] args) {
        Store s= new Store("Maanga", "Kilpaakam-627002");
        
        System.out.println("Old Name :"+s.getname());
        System.out.println("Old Address :"+s.getaddress());
        s.setname("Theynga");
        s.setaddress("meylpaakam-624932");

        System.out.println("The value has been updated");
        System.out.println("New Name :"+s.getname());
        System.out.println("New address :"+s.getaddress());
    }
}
