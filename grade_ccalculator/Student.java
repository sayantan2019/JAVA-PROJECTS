import java.util.*;
import java.util.Scanner;


 
public class Student
{
    
    private String name;
    private String sub[];
    private int marks[];
    private int TMarks;
    private double avgPer;
    private char grade;
    
    public Student(String name, String sub[], int marks[]){
        this.name = name;
        this.sub = sub;
        this.marks = marks;
        this.TMarks = calTotalMarks();
        this.avgPer = calAvgPer();
        this.grade = calGrade();
    }
    
    private int calTotalMarks()
    {
        int sum = 0;
        for (int mark : marks)
        {
            sum = sum + mark;
        }
        return sum;
    }
    
    private double calAvgPer()
    {
        return(double) TMarks /marks.length;
    }
    
    private char calGrade()
    {
        if(avgPer >= 90)
        {
            return 'A';
        }else if(avgPer >= 80)
        {
            return 'B';
        }else if(avgPer >= 70)
        {
            return 'C';
        }else if(avgPer >= 60)
        {
            return 'D';
        }else
        {
            return 'F';
        }
    }
    
    public void dResult()
    {
        System.out.println("Total Marks = "+TMarks);
        System.out.println("Average Percentage = "+avgPer+"%");
        System.out.println("Grade = "+grade);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name = ");
        String name = sc.nextLine();
        System.out.println("Enter the number of Subjects = ");
        int numSub = sc.nextInt();
        sc.nextLine();
        String sub[] = new String[numSub];
        int marks[] = new int[numSub];
        for(int i=0 ; i<numSub ; i++)
        {
            System.out.println("Enter the Subjects"+(i+1)+"= ");
            sub[i]=sc.nextLine();
            System.out.println("Enter the marks of"+sub[i]+"= ");
            marks[i]=sc.nextInt();
            sc.nextLine();
        }
        Student std = new Student(name,sub,marks);
        std.dResult();
    }
    
    
}
