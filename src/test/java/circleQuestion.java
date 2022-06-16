import java.util.Random;

public class circleQuestion {
    public static void main(String[] args) {
        Random random=new Random();
        int  r=1000;
        double count=0;
        while(r!=0)
        {
            double x=random.nextDouble(-1,1);
            double y=random.nextDouble(-1,1);
            double c=(x*x)+(y*y);
            if(c<=1.000)
            {
                count++;
            }
            r--;
        }
        double pie=4*(count/1000);
        System.out.println(pie);
    }
}
