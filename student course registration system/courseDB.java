import java.util.List;
import java.util.Scanner;
import java.util.*;

public class courseDB
{
    private List<Course> cors;
    public courseDB(){
        cors = new ArrayList<>();
    }
    public void addcor(Course cor){
        cors.add(cor);
    }
    public Course getCourse(String courseCode){
        for(Course cor: cors){
            if(cor.getcourseCode().equalsIgnoreCase (courseCode)){
                return cor;
            }
            
        }
        return null;
    }
    
    public void dcor(){
        for(Course cor: cors){
            System.out.println(cor);
            System.out.println("Avaible Status "+cor.getAvlSlot()+"\n");
        }
    }
}
