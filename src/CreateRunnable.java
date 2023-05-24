public class CreateRunnable implements Runnable{

    int number;
    CreateRunnable(int number){

        this.number = number;
    }

    @Override
    public void run() {
        Passenger p = new Passenger(number);
        System.out.println("Der Passagier NR: " + number + " wurde erstellt");

    }
}
