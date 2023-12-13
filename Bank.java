/*
 Define a class to represent a bank account. Include the following members
 Data Members:
 Name of the depositor
 Account Number
 Type of account
 Balance amount in the account
 Member functions:
 To assign initial values
 To deposit an amount
 To withdraw an amount after checking the balance
 To display name and balance.
*/
import java.util.Scanner;
public class Bank
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the Name . :");
        String name = sc.next();
        System.out.println("Enter the ACcount Number :");
        int num = sc.nextInt();
        System.out.println("ENter the Type of Account . :");
        String acc_type = sc.next();
        System.out.println("Enter the Balance amount in the account :");
        double bal = sc.nextDouble();
        System.out.println("Enter the Deposit Amount:");
        double Depo = sc.nextDouble();
        System.out.println("Enter the Withdraw Amount:");
        double withdraw = sc.nextDouble();

        BanckAccount ba = new BanckAccount(name , num ,acc_type,bal);
        ba.deposit(Depo);
        ba.withdraw(withdraw);
        ba.dispaly();
       // return 0;


    }
}

class BanckAccount
{
    private String name ;
    private int num ; 
    private String acc_type;
    private double bal;

    public BanckAccount(String n , int number , String acc,double balance)
    {
        name = n;
        num = number;
        acc_type = acc;
        bal = balance;
    }
    public void deposit(double Depo)
    {
       // int damt1=0;
       // System.out.println("Enter the Deposit Amount :");
        //double damt1 = sc.nextDouble();
        bal  = bal + Depo;
        //System.out.println("Amount Deposit"+bal);
       // System.out.println("Balance: Rs. " + amount);

    }
    public void withdraw(double withdraw)
    {

   if(withdraw <= bal)  {
            bal = bal - withdraw;
           // System.out.println("Amount withdrawn: Rs. " +bal);
            //System.out.println("Balance: Rs. " + amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }


    public void dispaly()
    {
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs. " + bal);
    }


}

