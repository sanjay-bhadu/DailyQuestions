import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class quesContinuousSubarray {

    public static int max(List<Integer> list)
    {
        list.sort(Integer::compareTo);
        return list.get(list.size()-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            int temp=scanner.nextInt();
            list.add(temp);
            if(i>=k-1)
            {
                System.out.println(list);
               int max=list.stream()
                        .max(Integer::compareTo).get();
                System.out.println(max);
                list.remove(0);
            }
        }
    }
}
