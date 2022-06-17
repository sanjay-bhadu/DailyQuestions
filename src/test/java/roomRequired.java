
import java.util.Scanner;

public class roomRequired {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scan.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        int room=0;
        for(int i=0;i<=max;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j][0]<=i && arr[j][1]>i)
                {
                    count++;
                }
            }
            if(count>room)
            {
                room=count;
            }
        }
        System.out.println(room);
    }
}
