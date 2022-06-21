import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stripe {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int max=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int temp=scan.nextInt();
            if(temp>max)
            {
                max=temp;
            }
            list.add(temp);
        }
        for(int i=1;i<max;i++)
        {
            if(list.contains(i))
            {
                continue;
            }
            else{
                System.out.println(i);
                break;
            }
        }
    }
}
