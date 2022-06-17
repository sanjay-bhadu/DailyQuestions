import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class builderProblem {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int cost=0;
        int prev=-1;
        for(int i=0;i<n;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<k;j++)
            {
                int temp=scanner.nextInt();
                list.add(temp);
            }
            list.sort(Integer::compareTo);
            if(prev!=0)
            {
                cost=cost+ list.get(0);
                prev=0;
            }
            else{
                cost=cost+list.get(1);
                prev=1;
            }
        }
        System.out.println(cost);
    }
}
