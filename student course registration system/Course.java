
public class Course
{
    private String courseCode;
    private String title;
    private String des;
    private int cap;
    private int enr;
    private String sehed;
    
    public Course(String courseCode, String title, String des, int cap, int enr, String sehed){
        this.courseCode = courseCode;
        this.title= title;
        this.des = des;
        this.cap = cap;
        this.enr = enr;
        this. sehed = sehed;
    }
    
    public String getcourse(){
        return courseCode;
    }
    
    public String gettitle(){
        return title;
    }
    
    public String getdes(){
        return des;
    }
    
    public int getcap(){
        return cap;
    }
    
    public int getenr(){
        return enr;
    }
    
    public String getsehed(){
        return sehed;
    }
    
    public boolean regStd(){
        if(enr<cap){
            enr++;
            return true;
            
        }
        return false;
    }
    
    public boolean dropStd(){
        if(enr>0){
            enr--;
            return true;
        }
        return false;
    }
    
    public int getAvlSlot(){
        return cap-enr;
    }
    
    public String tostring(){
        return "course code: "+courseCode+"Title \n"+title+"Description \n "+des+"Capacity \n "+cap+"Enrollment \n "+enr+"Schedule \n "+sehed; 
    }
    
}


