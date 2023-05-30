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
        return super.getList();
    }

    @Override
    public int getListSize() {
        return super.getListSize();
    }
    public int getLast(){
        int last = check.size()-1;
        return last;
    }
}

