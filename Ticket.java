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

    public Ticket() {
        defaultTicket();
    }

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
    public void defaultTicket(){

        addFlight("QW_vg_12" , "Yard" , "Tehran" , "2023.4.18" ,"12:30" , 500000.0, 10);
        addFlight("QW_de_13" , "Shiraz" , "Tehran" , "2023.4.25" ,"12:30" , 90000.0, 4);
        addFlight("QW_ty_14" , "Mashhad" , "Gilian" , "2023.5.10" ,"04:45" , 350000.0, 20);
        addFlight("QV_nm_15" , "Yard" , "Tabriz" , "2023.5.15" ,"10:00" , 200000.0, 6);
        addFlight("QV_li_16" , "Azerbaijan" , "Sari" , "2023.5.29" ,"03:15" , 150000.0, 13);
        addFlight("QV_pz_17" , "Esfehan" , "Kish" , "2023.6.03" ,"00:00" , 900000.0, 1);
    }
    public void researchTicketOfFlightID(String str){
        printTicket(str);
    }
    public void researchTicketOfOrigin(String str){

        printTicket(this.origin.indexOf(str));
    }
    public void researchTicketOfDestination(String str){
        printTicket(this.destination.indexOf(str));
    }
    public void researchTicketOfDate(String str){
        printTicket(this.date.indexOf(str));
    }
    public void researchTicketOfTime(String str){
        printTicket(this.time.indexOf(str));
    }
    public void researchTicketOfPrice(double str){
        printTicket(this.price.indexOf(str));
    }
    public void researchTicketOfSeats(int st){
        printTicket(this.seats.indexOf(st));
    }
}