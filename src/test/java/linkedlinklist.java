import java.util.*;


import static java.lang.Math.abs;

public class linkedlinklist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        Iterator<Integer> iterator = linkedList.iterator();
        Iterator<Integer> iterator1=list.iterator();
        int len1=linkedList.size();
        int len2=list.size();
        int d=abs(len2-len1);
        if(d>0) {
          if(len1>len2)
          {
              while(iterator.hasNext() && iterator1.hasNext())
              {
                  if(d>0)
                  {
                      iterator.next();
                  }
                  else{
                      int temp1=iterator.next();
                      int temp2=iterator1.next();
                      if(temp1==temp2)
                      {
                          System.out.println(temp1);
                      }
                  }
                  d--;
              }
          }
          else{
              while(iterator.hasNext() && iterator1.hasNext()) {
                  if (d > 0) {
                      iterator1.next();
                  } else {
                      int temp1 = iterator.next();
                      int temp2 = iterator1.next();
                      if (temp1 == temp2) {
                          System.out.println(temp1);
                      }
                  }
                  d--;
              }
          }
        }
        else{
           while(iterator.hasNext() && iterator1.hasNext())
           {
               int temp1 = iterator.next();
               int temp2 = iterator1.next();
               if (temp1 == temp2) {
                   System.out.println(temp1);
               }
           }
        }
    }
}
