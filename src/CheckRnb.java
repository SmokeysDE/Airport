import java.util.ArrayList;


public class CheckRnb implements Runnable {

    ArrayList<String> halle;
    int groesse;
    String last;
    String first;
    int lastInt;


    public CheckRnb(ArrayList<String> halle){
        for (String s : this.halle = halle) {

        }

    }

    @Override
    public void run() {
        int groesse = halle.size();
        int last = groesse - 1;
        String lastPass = halle.remove(last);
        setLast(groesse, lastPass, first, last);


    }
    public void setLast(int groesse, String lastPass, String first, int lastInt){
        this.groesse = groesse;
        this.last = lastPass;
        this.first = first;
        this.lastInt = lastInt;
    }

    public String getLast() {
        return last;
    }

    public int getGroesse() {
        return groesse;
    }

    public String getFirst() {
        return first;
    }

    public ArrayList<String> getList() {
        return halle;
    }

    public int getLastInt() {
        return lastInt;
    }
}