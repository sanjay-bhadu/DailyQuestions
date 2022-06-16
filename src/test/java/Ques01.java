import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        boolean ans=false;
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int temp= scanner.nextInt();
            if(map.containsKey(k-temp))
                ans=true;
            else{
                map.put(temp,temp);
            }
        }
        if(ans)
            System.out.println("true");
        else
            System.out.println("false");
        scanner.close();
    }
}
