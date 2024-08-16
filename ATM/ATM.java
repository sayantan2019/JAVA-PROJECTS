import java.util.*;
import java.util.Scanner;

/*public class ATM{
    private userAct userA;
    private Scanner sc;
    public ATM(userAct userA)
    {
        this.userA = userA;
        this.sc = new Scanner(System.in);
    }
    
    public void dMenu()
    {
        System.out.println("Welcome to ATM");
        System.out.println("1. bal");
        System.out.println("2. deposit");
        System.out.println("3. Withdrawl");
        System.out.println("4. Exit");
    }
    
    public void withdrawl()
    {
        System.out.print("Enter withdrawal amt ");
        double amt = sc.nextDouble();
        if(userA.withdrawl(amt))
        {
            System.out.println("Successfully Withdrwal");
        }
        else
        {
            System.out.println("Invalid");
        }
        
    }
    
    public void deposite(){
        System.out.print("Enter deposit amt ");
        double amt = sc.nextDouble();
        if (userA.deposite(amt)) {
            System.out.println("Successfully deposited" + amt);
        } else {
            System.out.println("Invalid deposit amt");
        }
    }
    
    public void checkBal()
    {
        double bal= userA.checkBal();
        System.out.println("Your current bal "+bal);
    }
    public void start()
    {
        while(true)
        {
            dMenu();
            System.out.println("Choose a option");
            int ch =sc.nextInt();
            switch(ch)
            {
                case 1:
                    checkBal();
                    break;
                case 2:
                    
                    deposite();
                    break;
                case 3:
                    
                    withdrawl();
                    break;
                case 4:
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Please try again");
                    break;
            }
        }
    }
}*/

public class ATM {
    private double bal;

    public ATM() {
        bal = 0.0;
    }

    public double getbal() {
        return bal;
    }

    public boolean deposit(double amt) {
        if (amt > 0) {
            bal += amt;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amt) {
        if (amt > 0 && amt <= bal) {
            bal -= amt;
            return true;
        }
        return false;
    }
}



