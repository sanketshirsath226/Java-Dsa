package Assignment;
import java.util.Scanner;

/*
Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
*/

public class DisplayGrade {
    public static void main(String[] args) {
        int marks;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Marks:"); 
        marks=in.nextInt();
        System.out.println("Grade:"+CheckGrade(marks));
        in.close();
    }
    static String CheckGrade(int marks)
    {
        if(marks>=91 && marks<=100)
        {
            return "AA";
        }
        else if(marks>=81 && marks<=90)
        {
            return "AB";
        }
        else if(marks>=71 && marks<=80)
        {
            return "BB";
        }
        else if(marks>=61 && marks<=80)
        {
            return "BC";
        }
        else if(marks>=51 && marks<=60)
        {
            return "CD";
        }
        else if(marks>=41 && marks<=50)
        {
            return "DD";
        }
        else if(marks<=40)
        {
            return "Fail";
        }
        else
        {
            return "Invalid Marks";
        }
    }
}
