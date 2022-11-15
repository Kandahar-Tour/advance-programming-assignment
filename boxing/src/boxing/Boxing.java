
package boxing;


public class Boxing {

   
    public static void main(String[] args) {
      
        //atouboxing
        int a=10;
        Integer b = new Integer(a);
        System.out.println(a);
        System.out.println(b);
        
        
        //unboxing
         Integer c = new Integer(20);
         int e=c;
         System.out.println(e);
        System.out.println(c);
    }
    
}
