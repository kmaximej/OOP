package monday;
import java.time.LocalTime;
import java.util.Scanner;

public class Monday extends Weekaday {
    
    private static String alarmTime;
    
    public static void setAlarm(String time){
    alarmTime = time;
    }

    public static void showAlarm(){
        LocalTime now = LocalTime.now();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time for alarm in this format (HH:MM): ");
        alarmTime = input.nextLine();
        
        LocalTime alarm = LocalTime.parse(alarmTime);
        
        
        if(alarm.isBefore(now)){
            System.out.println("Alam is set for tomorrow!");
        }else if(alarm.isAfter(now)){
            System.out.println("I'll wake you up later!");
        }
        
        
    }
    
    
    
    public static void main(String[] args) {
   
    showAlarm();
        
    }
    
  
}
