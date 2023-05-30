import java.util.ArrayList;

public class CheckRnb implements Runnable {

    MoveC movePassenger = new MoveC();

    CheckIn check = new CheckIn(1);

    @Override
    public void run() {
        try {
            ArrayList<String> hallList = movePassenger.getHall();
            Thread tCheck = new Thread(movePassenger);
            tCheck.start();

            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Warte");
        }catch (ArrayIndexOutOfBoundsException e){}

    }
}
