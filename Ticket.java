import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {

    static Scanner input = new Scanner(System.in);
    private ArrayList<String> flightId = new ArrayList<>();
    private ArrayList<String> origin = new ArrayList<>();
    private ArrayList<String> destination = new ArrayList<>();
    private ArrayList<String> date = new ArrayList<>();
    private ArrayList<String> time = new ArrayList<>();
    private ArrayList<Double> price = new ArrayList<>();
    private ArrayList<Integer> seats = new ArrayList<>();

    public void addFlight(String flightId, String origin, String destination,
                          String date, String time, Double price, Integer seats) {
        this.flightId.add(flightId);
        this.origin.add(origin);
        this.destination.add(destination);
        this.date.add(date);
        this.time.add(time);
        this.price.add(price);
        this.seats.add(seats);
//        System.out.println(this.flightId.get(0));
//        if (this.flightId.size() > 1){
//            System.out.println(this.flightId.get(1));
//        }
        printTicket(flightId);
    }

    public void removeFlight(String flightId) {

        printTicket(flightId);
        int tempIndex = this.flightId.indexOf(flightId);
        this.flightId.remove(tempIndex);
        this.origin.remove(tempIndex);
        this.destination.remove(tempIndex);
        this.date.remove(tempIndex);
        this.time.remove(tempIndex);
        this.price.remove(tempIndex);
        this.seats.remove(tempIndex);

//        System.out.println(this.date.isEmpty());
    }

    public void updateFlight(String flightId) {
        int tempIndex = this.flightId.indexOf(flightId);
        System.out.print("What parameter do you want to change?\t");
        System.out.println("flightId\torigin\tdestination\tdate\ttime\tprice\tseats");
        String update = input.next();
        switch (update) {
            case "flightId":
                System.out.println("Please enter the new flight Id:\t");
                this.flightId.set(tempIndex, input.next());
                break;
            case "origin":
                System.out.println("Please enter the new origin:\t");
                this.origin.set(tempIndex, input.next());
                break;
            case "destination":
                System.out.println("Please enter the new destination:\t");
                this.destination.set(tempIndex, input.next());
                break;
            case "date":
                System.out.println("Please enter the new date:\t");
                this.date.set(tempIndex, input.next());
                break;
            case "time":
                System.out.println("Please enter the new time:\t");
                this.time.set(tempIndex, input.next());
                break;
            case "price":
                System.out.println("Please enter the new price:\t");
                this.price.set(tempIndex, input.nextDouble());
                break;
            case "seats":
                System.out.println("Please enter the new seats:\t");
                this.seats.set(tempIndex, input.nextInt());
                break;
        }
        printTicket(flightId);
    }

    public void printTicket(String flightId) {
        int tempIndex = this.flightId.indexOf(flightId);
        System.out.print("flight Id:\t" + this.flightId.get(tempIndex));
        System.out.print("\torigin:\t" + this.origin.get(tempIndex));
        System.out.print("\tdestination:\t" + this.destination.get(tempIndex));
        System.out.println("date:\t" + this.date.get(tempIndex));
        System.out.print("\ttime:\t" + this.time.get(tempIndex));
        System.out.print("\tprice:\t" + this.price.get(tempIndex));
        System.out.print("\tseats:\t" + this.seats.get(tempIndex));
    }

    public void printTicket(int index) {
        String str = this.flightId.get(index);
        printTicket(str);
    }

    public void flightSchedulesFlight() {
        System.out.println(this.flightId.size());
        for (int i = 0 ; i < this.flightId.size() ; i++) {
            printTicket(i);
        }
    }
}