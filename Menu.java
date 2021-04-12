import java.util.Scanner;

public class Menu {
    private ParticipantsUtility participantsUtility;
    private EventsUtility eventsUtility;

    Menu(ParticipantsUtility participantsUtility, EventsUtility eventsUtility) {
        this.participantsUtility = participantsUtility;
        this.eventsUtility = eventsUtility;
    }

    public void runMainMenu() {
        Scanner sc = new Scanner(System.in);
        mainMenu(sc);
        sc.close();
    }

    private void mainMenu(Scanner sc) {
        int option;
        System.out.println("1. Events");
        System.out.println("2. Participants");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");
        option = sc.nextInt();
        boolean shouldExit = false;
        if (option == 1)
            eventsMenu(sc);
        else if (option == 2)
            participantsMenu(sc);
        else if (option == 3)
            shouldExit = true;
        else
            System.out.println("Wrong option!");
        System.out.println();
        if (shouldExit)
            return;
        mainMenu(sc);
    }

    private void eventsMenu(Scanner sc) {
        int option;
        System.out.println("1. Create event");
        System.out.println("2. See event");
        System.out.println("3. Update event");
        System.out.println("4. Delete event");
        System.out.println("5. Display all events");
        System.out.println("6. Back");
        System.out.print("Select an option: ");
        option = sc.nextInt();
        boolean shouldExit = false;
        switch (option) {
        case 1:
            
            eventsUtility.createEvent();
            break;
        case 2:
            
            eventsUtility.getEvent();
            break;
        case 3:
            
            eventsUtility.updateEvent();
            break;
        case 4:
            
            eventsUtility.deleteEvent();
            break;
        case 5:
            
            eventsUtility.getAllEvents();
            break;
        case 6:
            shouldExit = true;
            break;
        default:
            // Wrong option
            System.out.println("Wrong option!");
            break;
        }
        System.out.println();
        if (shouldExit)
            return;
        eventsMenu(sc);
    }

    private void participantsMenu(Scanner sc) {
        int option;
        System.out.println("1. Create participant");
        System.out.println("2. See participant");
        System.out.println("3. Update participant");
        System.out.println("4. Delete participant");
        System.out.println("5. register participant for event");
        System.out.println("6. Display all participants");
        System.out.println("7. Back");
        System.out.print("Select an option: ");
        option = sc.nextInt();
        boolean shouldExit = false;
        switch (option) {
        case 1:
            // Create participant
            participantsUtility.createParticipant();
            break;
        case 2:
            // Read participant
            participantsUtility.getParticipant();
            break;
        case 3:
            // Update participant
            participantsUtility.updateParticipant();
            break;
        case 4:
            // Delete participant
            participantsUtility.deleteParticipant();
            break;
        case 5:
            // Register
            participantsUtility.registerParticipanttoEvent();
            break;
        
        case 6:
            
            participantsUtility.getAllParticipants();
            break;
        case 7:
            shouldExit = true;
            break;
        default:
            // Wrong option
            System.out.println("Wrong option!");
            break;
        }
        System.out.println();
        if (shouldExit)
            return;
        participantsMenu(sc);
    }
}