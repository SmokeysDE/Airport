public class Passenger {

    private int number;
    private int ttl = 30000;

    public Passenger (int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getTtl() {
        return ttl;
    }

    public void raiseTtl(int add_time) {
        this.ttl += add_time;
    }
    public String getPass(){
        String name = "P" + number;
        return name;
    }
}
