
import java.util.Scanner;

public class stairCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of steps at time accessable");
        int l=scan.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the steps allowed to take at time");
        for(int i=0;i<l;i++)
        {
            int temp=scan.nextInt();
            arr[i]=temp;
        }
        int total=scan.nextInt();

    }
}
