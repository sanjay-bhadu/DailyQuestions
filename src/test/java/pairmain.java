public class pairmain {

    public static int car(pair p)
    {
        return p.getA();
    }
    public static int cdr(pair p){
        return p.getB();
    }

    public static void main(String[] args) {
        pair p=new pair(1,2);
        pair p1=new pair(2,3);
        System.out.println(car(p));
        System.out.println(cdr(p1));
    }

}
