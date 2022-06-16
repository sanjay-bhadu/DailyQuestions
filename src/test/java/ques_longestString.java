import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ques_longestString {
    public static int lengthOfLongest(int k,String s)
    {
        if(s.length()<k)
            return 0;
        else {
            Set<Character> set = new HashSet<>();
            for(int i=0;i<s.length();i++)
            {
                set.add(s.charAt(i));
            }
            if(set.size()==k)
                return s.length();
            else
                return 0;
        }

    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        String temp=scan.nextLine();
        String s=scan.nextLine();
        int lenght=0;
        for(int i=0;i<s.length()-k;i++)
        {
            for(int j=i+k;j<s.length();j++)
            {
                String sub=s.substring(i,j);
                int r=lengthOfLongest(k,sub);
                if(r>lenght)
                    lenght=r;
            }
        }
        System.out.println(lenght);
    }
}
