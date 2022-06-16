import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ques2 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("hello");
        set.add("hell");
        set.add("how");
        set.add("harris");
        set.add("harry");
        set.add("sanjay");
        set.add("sumit");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            String temp= iterator.next();
            if(temp.startsWith(s))
                System.out.println(temp);
        }
    }
}
