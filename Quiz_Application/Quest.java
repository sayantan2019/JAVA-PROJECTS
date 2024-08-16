
public class Quest
{
    private String quest;
    private String opt[];
    private int corrOpt;
    public Quest(String quest, String opt[], int corrOpt){
        this.quest = quest;
        this.opt = opt;
        this.corrOpt = corrOpt;
    }
    public String getquest(){
        return quest;
    }
    
    public String [] getopt(){
        return opt;
        
    }
    
    public int getcorrOpt(){
        return corrOpt;
    }
}
