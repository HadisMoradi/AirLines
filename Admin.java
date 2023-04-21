import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    static Scanner input = new Scanner(System.in);
    static Ticket ticket = new Ticket();
    public static void add(){

        System.out.print("Type the Flight Id: ");
        String S1 = input.next();
        System.out.print("Type the Origin: ");
        String S2 = input.next();
        System.out.print("Type the Destination: ");
        String S3 = input.next();
        System.out.print("Type the Date: ");
        String S4 = input.next();
        System.out.print("Type the Time: ");
        String S5 = input.next();
        System.out.print("Type the Price: ");
        Double S6 = input.nextDouble();
        System.out.print("Type the Seats: ");
        Integer S7 = input.nextInt();

        ticket.addFlight(S1 , S2 , S3 , S4 , S5 , S6 , S7);
        Menu.admin();
    }

    public static void update(){
        System.out.println("Please enter your flight Id:\t");
        ticket.updateFlight(input.next());
        Menu.admin();
    }

    public static void remove(){
        System.out.print("Please enter flight Id:\t");
        ticket.removeFlight(input.next());
        Menu.admin();
    }

    public static void flightSchedules(){
        ticket.flightSchedulesFlight();
        Menu.admin();
    }

}
