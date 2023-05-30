import java.util.ArrayList;

public class CheckIn extends Hall {

    private ArrayList<String> check;



    public CheckIn(int number) {
        super(number);
        this.check = new ArrayList<String>();
    }

    @Override
    public int getNumber() {
        return super.getNumber();
    }

    @Override
    public ArrayList<String> getList() {
        return check;
    }

    @Override
    public int getListSize() {
        return check.size();
    }
    public int getLast(){
        int last = check.size()-1;
        return last;
    }
}

