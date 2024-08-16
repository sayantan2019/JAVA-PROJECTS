import java.util.concurrent.TimeUnit;
import java.util.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Quiz
{
    private List<Quest>questList;
    private int score;
    private int TQuest;
    private Scanner sc;
    public Quiz(){
        questList = new ArrayList<>();
        score = 0;
        TQuest = 0;
        sc =new Scanner (System.in);
    }
    public void addQuest(Quest quest){
        questList.add(quest);
        TQuest++;
    }
    
    
    
    private void askQuest(Quest quest){
        System.out.println(quest.getquest());
        String opt[] = quest.getopt();
        for(int i=0;i<opt.length;i++){
            System.out.println((i+1)+"."+opt[i]);
        }
        
        long STime = System.currentTimeMillis();
        long ETime = STime + TimeUnit.SECONDS.toMillis(10);
        int userAns = -1;
        while(System.currentTimeMillis()<ETime){
            if(sc.hasNextInt()){
                userAns = sc.nextInt();
                break;
            }
        }
        if(userAns == quest.getcorrOpt()+1){
            score++;
            System.out.println("Incorrect answer"+opt[quest.getcorrOpt()]+"\n");
        }
    }
    
    private void dResult(){
        System.out.println("Your score"+score+"/"+TQuest);
    }
    
    public void start(){
        for(Quest quest : questList){
            askQuest (quest);
        }
        dResult();
    }
    
    public static void main(String args[]){
        Quiz q = new Quiz();
        q.addQuest(new Quest("What is the capital of India?",new String[]{"New Delhi","Kolkata","Bangalore","Jharkhand","Odisha"},1));
        q.addQuest(new Quest("What is not a oops language?",new String[]{"python","java","c","c++","javaScript"},3));
        q.addQuest(new Quest("What is animal in India?",new String[]{"Bear","Royal Bengal Tiger","cat","polar bear"},1));
        q.start();
    }
    
    
}
