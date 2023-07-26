import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //if condition and else
        int age=32;
        if (age>=18){
            System.out.println("The person is eligible foe vote");
        }
        else{
            System.out.println("Not eligible");
        }

        //else if condition
        System.out.println("Enter first number");
        int num=sc.nextInt();

        if (num>0){
            System.out.println("the number is positive");
        } else if (num<0) {
            System.out.println("the number is negative");
        }
        else{
            System.out.println("The given is zero");
        }

        //Nested if
        Scanner c= new Scanner(System.in);
        System.out.println("Enter your age");
        int marraige=c.nextInt();
        if(marraige>=21){
            if (marraige>=21 && marraige<=27) {
                System.out.println("The person is elgible for marraige");
            }
            else if (marraige>=32 && marraige<40){
                System.out.println("Bussiness started");
            } else if (marraige>=40 ) {
                System.out.println("The person is expired");
            }
            else{
                System.out.println("enter correct age");
            }
        }

        //Switch case
        String days;
        System.out.println("Enter the Day:");
        days=c.next().toLowerCase();
        switch(days){
            case "sunday":
                System.out.println("First Day");
                break;
            case "monday":
                System.out.println("Second Day");
                break;
            case "tuesday":
                System.out.println("Third Day");
                break;
            case "wednesday":
                System.out.println("Fourth Day");
                break;
            case "thursday":
                System.out.println("Fifth Day");
                break;
            case "friday":
                System.out.println("Sixth Day");
                break;
            case "saturday":
                System.out.println("Weekend Day");
                break;
            default:
                System.out.println("Enter the Valid Day");
        }
        // Looping statement

//while loop
        int n=0;
        while(n<=10)
        {
            System.out.println(n);
            n=n+2;
        }
// Do-while Loop
        int a=1;
        do
        {
            System.out.println(a);
            a=+2;
        }while(a<=0);

        for(int i=1;i<=10;i=i+2)
        {
            System.out.println(i);
        }
        int b[]={1,2,3,4,5};
        for(int i=b.length-1;i>=0;i--)
        {
            System.out.println(b[i]);
        }
        for(int m:b)
        {
            System.out.println(m);
        }
//Nested Loop --Continue -- Break

        for(int i=0;i<6;i++)
        {
            if(i==2)
            {
                continue;
            }
            if(i==4)
            {
                break;
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
//Label
        a:
        for(int i=0;i<6;i++)
        {
            b:
            for(int j=0;j<=i;j++)
            {
                if(j==4)
                {
                    break b;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





