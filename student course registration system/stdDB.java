import java.util.Map;
import java.util.HashMap;
import javax.swing.Box;

public class stdDB
{
    private Map<String, stdDB> Std;
    public stdDB(){
        Std = new HashMap<>();
    }
    public void addStd(stdDB std){
        Std.put(stdgetstd(), std);
    }
    public stdDB getstd(String stdId){
        return Std.get(stdId);
    }
    
    public void dstds(){
        for(stdDB std: Std.values()){
            System.out.println(std);
            for(Box cor : std.getRegcor()){
                System.out.println(cor);
            }
            System.out.println();
        }
    }
}
