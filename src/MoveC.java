import java.util.ArrayList;

public class MoveC implements Runnable{
    PassCreate pass = new PassCreate();
    Hall hall2 = new Hall(2);
    CheckRnb checkRnb = new CheckRnb(hall2.getList());
    private int number = 1;


    @Override
    public void run() {
        try {
            Thread t1 = new Thread(pass);
            t1.start();
            while(true) {
                t1.sleep(300);
                System.out.println("Programm wird geladen");
                t1.sleep(300);
                System.out.println("in Halle " + pass.getHall() + " befinden sich " + pass.getList().toArray().length + " Passagiere.");
                t1.sleep(300);
                for (int i = 0; i < 10; i++) {
                    String p = pass.getList().remove(0);
                    for (int j = hall2.getListSize(); j < 10; j++) ;
                    hall2.getList().add(p);
                    System.out.println("In Halle "+ pass.getHall() +" befinden sich " + pass.getList().size() + " Passagiere");
                    t1.sleep(300);
                    System.out.println("In Halle "+ hall2.getNumber() +" befinden sich " + hall2.getListSize() + " Passagiere");
                    t1.sleep(300);
                    t1.run();
                }
                System.out.println("Halle 2 Passagiere " + hall2.getList());
                t1.run();
                if(hall2.getListSize()>=10){
                    break;
                }
            }
            CheckIn check = new CheckIn(number);
            Thread tCheck = new Thread(checkRnb);
            tCheck.start();
            Thread.sleep(1000);
            for(int i = check.getListSize();i < 10;i++){
                check.addList(checkRnb.getLast());
                tCheck.run();
                /*check.addList(s);*/
                System.out.println(check.getList());
                if(checkRnb.lastInt == 0){
                    break;
                }
            }
            check.addList(checkRnb.getLast());
            System.out.println(check.getList());
            Thread.sleep(1000);
            t1.run();
            for (int i = 0; i < 10; i++) {
                String p = pass.getList().remove(0);
                for (int j = hall2.getListSize(); j < 10; j++) ;
                hall2.getList().add(p);
                //System.out.println("In Halle "+ pass.getHall() +" befinden sich " + pass.getList().size() + " Passagiere");
                //t1.sleep(300);
                //System.out.println("In Halle "+ hall2.getNumber() +" befinden sich " + hall2.getListSize() + " Passagiere");
                t1.sleep(300);
                t1.run();
            }

            //System.out.println("Halle 2 Passagiere " + hall2.getList());



            System.out.println("Halle 2 Passagiere " + hall2.getList());
            System.out.println("Check In Passagiere " + check.getList());
            System.out.println("Halle 1 Passagiere " + pass.getList());

        }catch (InterruptedException e){

        }

    }

    public ArrayList<String> getHall() {
        return hall2.getList();
    }
    public int getLast() {
        int last = hall2.getListSize()-1;
        return last;
    }
}
