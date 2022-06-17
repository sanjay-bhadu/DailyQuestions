import java.util.ArrayList;
import java.util.List;

public class arrayMultiply {
    public static void main(String[] args) {

        int[] arr=new int[]{1,2,3,4,5};
        int multiply=1;
        for (int k : arr) {
            multiply = multiply * k;
        }
        List<Integer> list=new ArrayList<>();
        for (int j : arr) {
            list.add(multiply / j);
        }
        System.out.println(list);
    }
}
