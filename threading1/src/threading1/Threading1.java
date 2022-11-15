
package threading1;

import static java.lang.Thread.sleep;
class test implements Runnable{

    @Override
    public void run() {
        System.out.println(" multithreading ");
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
          
        }
    }
}


public class Threading1 {

    
    public static void main(String[] args) {
        test t = new test();
        Thread th = new Thread(t);
        th.start();
        
        
        System.out.println(" main class");
        
       
    }
    
}
