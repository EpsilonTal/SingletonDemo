import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import static java.lang.Math.toIntExact;

public class Multithreading extends Thread {
    String EXCEPTION_MESSAGE = "Exception";
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            Singleton mySingleton = Singleton.getInstance(toIntExact(getId()));
        } catch (Exception e) {
            System.out.println(EXCEPTION_MESSAGE);
        }
    }
}
