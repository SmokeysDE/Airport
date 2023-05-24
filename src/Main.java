public class Main {

    public static void main(String[] args) {
        try {
            Thread t1 = new Thread(new CreateRunnable(1));
            Thread t2 = new Thread(new CreateRunnable(2));

            t1.start();
            Thread.sleep(2500);
            t2.start();
            Thread.sleep(2500);
        }catch(Exception e){}

    }
}