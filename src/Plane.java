import java.sql.Array;
import java.util.Arrays;

public class Plane {
        private int seats;

    public Plane(int seats) {
        this.seats = seats;
        int[] size = new int[seats];
    }

    public int getSeats() {
        return seats;
    }
}
