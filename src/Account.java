import java.util.*;
public class Account
{
    private int accno;
    private String type;
    private double amt;

    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        this.accno = sc.nextInt();
        this.type = sc.next();
        this.amt = sc.nextDouble();
        

    }

    public void display()
    {
        System.out.println("Account Number is " + this.accno);
        System.out.println("Type: " + this.type);
        System.out.println("Amt: " + this.amt);
    }

    public Account()
    {
       
    }

    public Account(int acc,String type,double amt)
    {
        this.accno = acc;
        this.type = type;
        this.amt = amt;
    }
}

class AccountDemo
{
    public static void main(String[] args)
    {
        Account a1 = new Account();
       
        a1.accept();
        a1.display();
        Account a2 = new Account(2839,"loan",18239.00);
        a2.accept();
        a2.display();
        
        
    }

        
}