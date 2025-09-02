import java.util.*;
public class LinkedLists {
    public static void main(String[]args){
        LinkedList<Integer>l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(20);
        l.add(4);
        l.add(5);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.size();
        System.out.println(l.size());
        
        l.removeAll(l);
        System.out.println("removed"+l);

    }
    
}
