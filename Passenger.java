import java.util.Scanner;

public class Passenger {
    static Scanner input = new Scanner(System.in);

    static User user = new User();
    static Ticket ticket = new Ticket();
    static String str;
    public static void changePassword(String userName , String password){
        String newPass = password;
        System.out.print("Please enter your password:\t");
        String pass = input.next();
        if (password.equals(pass)) {
            System.out.print("Please enter your new password:\t");
             newPass = input.next();
             user.changePassword(userName , newPass);
            System.out.println("Your password has been successfully changed:)");
        }
        else {
            System.out.println("Old password is not correct!");
        }
        Menu.passenger(userName , newPass);
    }
    public static void searchFlightTickets() {
        System.out.println("What is your search mode?\t");
        System.out.println("flightId\torigin\tdestination\tdate\ttime\tprice\tseats");
        String research = input.next();
        switch (research){
            case "flightId":
                System.out.print("Please search the flight Id:\t");
                str = input.next();
                ticket.researchTicketOfFlightID(str);
                break;
            case "origin":
                System.out.print("Please search the origin:\t");
                str = input.next();
                ticket.researchTicketOfOrigin(str);
                break;
            case "destination":
                System.out.print("Please search the destination:\t");
                str = input.next();
                ticket.researchTicketOfDestination(str);
                break;
            case "date":
                System.out.print("Please search the date:\t");
                str = input.next();
                ticket.researchTicketOfDate(str);
                break;
            case "time":
                System.out.print("Please search the time:\t");
                str = input.next();
                ticket.researchTicketOfTime(str);
                break;
            case "price":
                System.out.println("Please search the price:\t");
                double str = input.nextDouble();
                ticket.researchTicketOfPrice(str);
                break;
            case "seats":
                System.out.println("Please search the seats:\t");
                int st = input.nextInt();
                ticket.researchTicketOfSeats(st);
                break;
        }
    }
    public static void bookingTicket(){
    }
    public static void ticketCancellation(){
    }
    public static void bookedTickets(){
    }
    public static void addCharge(){
    }
}
