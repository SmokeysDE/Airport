import java.util.ArrayList;

public class PassCreate implements Runnable{

    private Hall hall = new Hall(1);

    int i=1;

    @Override
    public void run() {


        for (int j = hall.getListSize(); j < 10; j++) {

            Passenger p = new Passenger(i);
            getList().add(p.getPass());
            i +=1;
        }
    }

    public int getHall(){
        return hall.getNumber();
    }
    public ArrayList<String> getList(){
        return hall.getList();
    }

}