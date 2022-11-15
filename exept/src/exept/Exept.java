
package exept;


public class Exept {

   
    public static void main(String[] args) {
        try{
       int n1 = 10;
       int n2 = 0;
       int sum = n1/n2;
        System.out.println(sum);
        
    }catch(Exception e){
            System.out.println("not divided");
    }
        
    }
    
}
