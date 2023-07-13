import java.util.*;

public class Canara {
    
    private String id;

    private String name;

    private int balance=0;

     Canara(String id, String name) {

        this.id=id;

        this.name=name;
    }

    Canara(String id, String name,int balance) {

        this.id=id;

        this.name=name;

        this.balance=balance;

    }
    public String getID() {

        return id;
    }
    public String getName() {

        return name;

    }

    public  int getBalance() {

        return balance;
    }
    public int credit(int amount) {

        balance+=amount;

        return balance;

    }

    public int debit(int amount) {

        if(balance>=amount) {

            balance-=amount;
        }

        else {

            System.out.println("No sufficient balance");
        }

        return balance;
    }

    public int transferTo(Canara another, int amount) {
        if(balance>=amount) {
            balance=balance-amount;
            another.balance=another.balance+amount;
            System.out.println("Transfer amount to given Account"+ amount);
        }
        else {

            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString() {
        return "Account [id = "+id+" "+"name = "+name+" "+" balance = "+balance+"]";
    }


    public static void main(String[] args) {

        
        Scanner sc=new Scanner(System.in);
        Canara bank=new Canara("#12345", "Muthu");
        Canara bank2=new Canara("#456718", "Rohan");
        System.out.println("Enter amount need to be credited");
        int value=sc.nextInt();

    
        System.out.println("Enter amount need to be debit");
        int value1=sc.nextInt();
 
        bank.credit(value);
        bank.debit(value1);
        System.out.println(bank);

        System.out.println(bank2.getBalance());
        bank.transferTo(bank2,500);
        System.out.println("Second Account Details"+bank2);
        System.out.println (" Current account1"+bank.getBalance());
        System.out.println("Account 2  balance"+bank2.getBalance());
        

    }
    

}