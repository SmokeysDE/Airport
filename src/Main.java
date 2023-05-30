public class Main {

    public static void main(String[] args) {
        try {
            Thread t1 = new Thread(new CheckRnb());


            t1.start();


        }catch(Exception e){}

    }
}