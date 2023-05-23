import java.util.*;

public class Hall {
    private int number;
    private ArrayList<Object> floor;

    public Hall(ArrayList floor, int number) {
        this.floor = new ArrayList<Object>();
        this.number =  number;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Object> getFloor() {
        return floor;
    }
}