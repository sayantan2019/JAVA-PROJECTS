import java.util.*;
import java.util.Scanner;
import java.util.Random;

class Number_Gussing_Game{
public static int generateNumber(int min, int max){
    Random rd = new Random();
    return rd.nextInt((max-min)+1)+min;
    
}

public static boolean askToPlay(Scanner sc){
    System.out.println("Do you want to play another round? (y/n) = ");
    return sc.next().equalsIgnoreCase("y");
}

public static int playround(Scanner sc, int maxAttmp){
    int numToGuess = generateNumber(1, 100);
    int attempt = 0;
    boolean hasGuessCorrect = false;
    System.out.println("Thinking of a no. between 1 and 100, guess it? ");
    System.out.println("you have"+maxAttmp+"attempts to guess the number");
    while(attempt < maxAttmp && !hasGuessCorrect){
        System.out.println("Enter your guess");
        int userGuess = sc.nextInt();
        attempt++;
        hasGuessCorrect = chGuess(userGuess, numToGuess);
    }
    if(!hasGuessCorrect){
        System.out.println("Sorry no more attemps, your attemps are"+numToGuess);
        
    }
    return hasGuessCorrect? 10 : 0;
}    

    public static boolean chGuess(int guess, int numToGuess){
        if(guess == numToGuess){
            System.out.println("Congratulation! your guess is correct");
            return true;
            
        } else if(guess<numToGuess) {
            System.out.println("Your guess is too low");
        }else{
            System.out.println("Your guess is too high");
        }
        return false;
        
    } 
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int maxAttmp = 3;
        int score =0;
        boolean playAgain;
        
        do{
            score = score + playround(sc, maxAttmp);
            playAgain = askToPlay(sc);
        }while (playAgain);
        
        System.out.println("your final score = "+score);
        sc.close();
    }
}