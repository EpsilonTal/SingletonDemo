public abstract class Main {
    public static void main(String args[]) {
        System.out.println("Singleton");
        for(int i = 0; i < 99; i++) {
            Multithreading thread = new Multithreading();
            thread.start();
        }
    }
}
