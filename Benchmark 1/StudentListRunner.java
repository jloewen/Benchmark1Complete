
/**
 * Write a description of class StudentClassRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class StudentListRunner
{
    public static void main(String[] args)
    {
        Student stu = null;
        System.out.println("Welcome to the student list.");
        boolean p = true;
        while(p == true)
        {
            System.out.println("What would you like to do? ('add' or 'delete') ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            
            if(input == "q")
            {
                p = false;
            }
            if(input.equals("add"))
            {
                stu.getStudent();
                stu.setStudent();
            }
            
            else if(input.equals("delete"))
            {
                stu.deleteStudent();
                stu.setStudent();
            }
            
            else
            {
                System.out.println("This is not a possible command.");
            }
            System.out.println("Here is your student: " + stu);
        }
    }
}