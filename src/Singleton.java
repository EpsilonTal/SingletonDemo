/*
Classical Java implementation of singleton
Design patterns
 */
public class Singleton {
    private static Singleton object;
    /*
    Private constructor to force use of
    getInstance() to create Singleton object
     */
    private static int threadNumber;
    private Singleton(int threadId) {
        this.threadNumber = threadId;
    }

    public static Singleton getInstance(int threadId) {
        if(object == null) {
            synchronized (Singleton.class) {
                System.out.println("Creating a singleton ... ...");
                System.out.println(threadId);
                object = new Singleton(threadId);
            }
        } else {
            System.out.println("Singleton has been created already");
            System.out.println(threadNumber);
        }


        return object;
    }
}
