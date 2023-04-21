import java.util.Scanner;

public class Menu {
    static Scanner inpout = new Scanner(System.in);
    static User user = new User();
    public static void sign(){
        System.out.println("""
                Please select to login
                <1>sign in
                <2>sign up""");
        int num;
        String username;
        String password;
        String password1;

         final String ADMIN_USERNAME = "a";
         final String  ADMIN_PASSWORD = "1";
        num = inpout.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("Please enter your username:");
                username = inpout.next();
                System.out.println("Please enter your password:");
                password = inpout.next();
                if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
                    Menu.admin();
                } else if (user.findUser(username, password)) {
                    System.out.println(username + password);
                    Menu.passenger(username, password);
                } else {
                    System.out.println("You are a soul");
                    Menu.sign();
                }
            }
            case 2 -> {
                System.out.println("Please choose a username:");
                username = inpout.next();
                System.out.println("Please choose a password:");
                password = inpout.next();
                do {
                    System.out.println("Please enter your password again:");
                    password1 = inpout.next();
                } while (!password.equals(password1));
                user.addUser(username, password);
                Menu.passenger(username, password);
            }
            case 0 -> Menu.sign();
        }
    }

    public static void admin(){
        System.out.println("""
                <1>add
                <2>update
                <3>remove
                <4>flight schedules
                <0>sing out""");
        int num;
        num = inpout.nextInt();
        switch (num){
            case 1:
                Admin.add();
                break;
            case 2:
                Admin.update();
                break;
            case 3:
                Admin.remove();
                break;
            case 4:
                Admin.flightSchedules();
                break;
            case 0:
                Menu.sign();
                break;
        }
    }

    public static void passenger(String userName , String password){
        System.out.println("""
                <1>change password
                <2>search flight tickets
                <3>booking ticket
                <4>ticket cancellation
                <5>booked tickets
                <6>add charge
                <0>sing out""");
        int num;
        num = inpout.nextInt();
        switch (num){
            case 1:
                Passenger.changePassword(userName ,password);
                break;
            case 2:
                Passenger.searchFlightTickets();
                break;
            case 3:
                Passenger.bookingTicket();
                break;
            case 4:
                Passenger.ticketCancellation();
                break;
            case 5:
                Passenger.bookedTickets();
                break;
            case 6:
                Passenger.addCharge();
                break;
            case 0:
                Menu.sign();
                break;
        }
    }
}
