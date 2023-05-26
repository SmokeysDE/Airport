import java.util.*;

public class Hall {
    private int number;
    private ArrayList<String> floor;

    public Hall(int number) {
        this.floor = new ArrayList<String>();
        this.number =  number;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<String> getList() {
        return floor;
    }
    public int getListSize(){
        return floor.size();
    }
}