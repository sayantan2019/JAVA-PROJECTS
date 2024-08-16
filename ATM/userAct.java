import java.util.*;
import java.util.Scanner;


public class userAct{
    private double bal;
    public userAct(double bal)
    {
        this.bal = bal;
    }
    
    public boolean deposite(double amt)
    {
        if(amt>0)
        {
            bal =bal + amt;
            return true;
        }
        
        return false;
    }
    
    public boolean withdrawl(double amt)
    {
        if(amt>0 && amt <= bal)
        {
            bal = bal - amt;
            return true;
        }
        return false;
    }
    
    public double checkBal()
    {
        return bal;
    }
}

