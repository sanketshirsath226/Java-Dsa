import java.util.Scanner;

// WeekEnd and WeekDays
public class Switch {
    public static void main(String[] args) {  
        int days;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter day:");
        days=in.nextInt();
        switch(days)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println("Weekdays");
            break;
            case 6:
            case 7:System.out.println("Weekends");
            break;
        }
        in.close();
    }
}
