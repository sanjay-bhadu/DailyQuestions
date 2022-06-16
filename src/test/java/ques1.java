import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //uses this to implement the time
        Timer timer =new Timer();

        // this is where task will initiate after particular time;
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                //we can add function here to run at particular time;
                //System.out.println("Let's Go.. Task Completed");
                System.out.println("Enter the numbers");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a+b);
                timer.cancel();

            }
        };
        timer.schedule(task,12000);
    }
}
