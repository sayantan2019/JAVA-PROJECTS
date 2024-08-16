import java.util.List;
import java.util.Scanner;
import java.util.*;

public class student
{
    private String stdId;
    private String name;
    private List<Course> regCourse;
    public student(String stdId, String name){
        this.stdId= stdId;
        this.name = name;
        this.regCourse = new ArrayList<>();
    }
    
    public String getstdId(){
        return stdId;
    }
    
    public String getname(){
        return name;
    }
    
    public List<Course> getregCourse(){
        return regCourse;
    }
    
    public boolean regCourse(Course cor){
        if(regCourse.contains(cor) && cor.regStd()){
            regCourse.add(cor);
            return true;
        }
        return false;
    }
    
    
    
    
}
