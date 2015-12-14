package uits.jv.threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadB extends Thread implements Runnable{

    @Override
    public void run() {
//       for(int i = 0; i < 10; i++){
//            try {
//               Thread.sleep(100);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ThreadA.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            System.out.println("ThreadB");
// }
        while (App.counter > 0) {
            App.counter -= 10;
            System.out.println("ThreadB   " + App.counter);
        }
    }
    
}
