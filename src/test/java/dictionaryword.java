import java.util.ArrayList;
import java.util.List;

public class dictionaryword {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Nope");
        list.add("Hey");
        list.add("fox");
        list.add("trip");
        list.add("go");
        List<String> ans=new ArrayList<>();
        String s="foxgotripp";
        for(int i=1;i<=s.length();i++)
        {
            String sub1=s.substring(0,i);
            String sub2=s.substring(i,s.length());
            if(list.contains(sub1))
            {
                ans.add(sub1);
                s=sub2;
                i=0;
            }
            System.out.println(sub1+" "+sub2);
        }
        if(s.length()==0)
            System.out.println(ans);
        else
            System.out.println("null");
    }
}
