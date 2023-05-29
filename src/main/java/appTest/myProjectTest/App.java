package appTest.myProjectTest;
import appTest.myProjectTest.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String name = "ahmad";
        Student student = new Student(name);
        student.check(name);
         name = "";
         System.out.print("\n");
        Student student1 = new Student(name);
        student1.check(name);
        
        
    }
}
