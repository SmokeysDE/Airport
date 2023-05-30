import java.util.ArrayList;
import java.util.HashMap;

public class CheckRnb implements Runnable {

    MoveC movePassenger = new MoveC();

    CheckIn check = new CheckIn(1);
    ArrayList<String> halle = new ArrayList<>();

    public CheckRnb(ArrayList<String> halle){
        for (String s : this.halle = halle) {

        }

    }

    @Override
    public void run() {
        Thread t1 = new Thread(movePassenger);
        int groesse = halle.size();
        int last = groesse-1;
        System.out.println(last);
        String lastPass = halle.remove(last);
        System.out.println(lastPass);



    }
}
