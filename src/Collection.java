
package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeMap;


public class Collection {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("ahmad");
        a.add("nabi");
        a.add("ahmad");
        a.add("ahmad");
        a.add("ahmad");
        a.remove(2);
        a.set(1, "sakhi");
        System.out.println(a.get(1));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        System.out.println(a);
        
        
        LinkedList l = new    LinkedList();
         l.add("karim");
         l.add("karim");
         l.add("karim");
         l.add("karim");
         l.add(2, "sakhi");
         l.addFirst("nabi");
         l.addLast("jalal");
         System.out.println(  l.getFirst());
         System.out.println(  l.hashCode());
         System.out.println(l);
           
           
        Stack s = new Stack();
         s.add("nabi");
         s.add("karim");
         s.add("mansoor");
         s.add("nabi");
         System.out.println(s);
           
           
    
         
         HashMap hm = new HashMap();
          hm.put(1, "jan");
          hm.put(2, "feb");
          hm.put(3, "mar");
          System.out.println( hm.get(1));
          
          
          
         TreeMap t = new TreeMap();
      
          t.put(1, "tree");
          t.put(2, "tree");
          t.put(3, "tree");
          System.out.println( t.get(1));
    }
  
  
  
    
    
}
