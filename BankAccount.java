import java.util.Scanner;

public class BankAccount {
    double balance;
    int accountNo;

    BankAccount(){

    }

    BankAccount(int act){
        accountNo = act;
    }

    public void deposit(double amt){
        balance = balance + amt ;
        System.out.println("After Deposit:" +balance);
    }

    public void withdraw(double amt){
        double a;
        balance = balance - amt ;
        System.out.println("After withdraw:" +balance);
    }
    public static void main(String[] args){
        int actno;
        //Account number
        System.out.print("Enter the Account number:");
        Scanner sc= new Scanner(System.in);
        actno = Integer.parseInt(sc.nextLine());
        BankAccount b1 = new BankAccount(actno);
        //Amount to deposit
        BankAccount b = new BankAccount();
        System.out.print("Enter the amount to deposit:");
        Scanner s= new Scanner(System.in);
        double amt = Double.parseDouble(s.nextLine());
        b.deposit(amt);
        //Amount to withdraw
        System.out.print("Enter the amount to withdraw:");
        Scanner s1= new Scanner(System.in);
        double amt1 = Double.parseDouble(s1.nextLine());
        b.withdraw(amt1);
    }
    }

