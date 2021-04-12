  
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ParticipantsUtility {
    private Database db;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    ParticipantsUtility(Database db) {
        this.db = db;
    }

    public void createParticipant() {
        try {
            String name, email, phone, address;
            System.out.println("Create new user:");
            System.out.print("Enter name: ");
            name = br.readLine();
            System.out.print("Enter email: ");
            email = br.readLine();
            System.out.print("Enter phone number: ");
            phone = br.readLine();
            System.out.print("Enter address: ");
            address = br.readLine();
            Participant newParticipant = db.createParticipant(name, phone, email, address);
            System.out.println(newParticipant.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getParticipant() {
        try {
            String id;
            System.out.println("Get participant details:");
            System.out.print("Enter participant id: ");
            id = br.readLine();
            Participant participant = db.getParticipantById(id);
            System.out.println(participant.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateParticipant() {
        try {
            String id, name, phone, email, address;
            System.out.println("Update participant:");
            System.out.print("Enter participant id: ");
            id = br.readLine();
            System.out.print("Enter name: ");
            name = br.readLine();
            System.out.print("Enter email: ");
            email = br.readLine();
            System.out.print("Enter phone number: ");
            phone = br.readLine();
            System.out.print("Enter address: ");
            address = br.readLine();
            Participant participant = db.updateParticipant(id, name, phone, email, address);
            System.out.println(participant.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteParticipant() {
        try {
            String id;
            System.out.println("Delete participant:");
            System.out.print("Enter participant id: ");
            id = br.readLine();
            db.deleteParticipant(id);
            System.out.println("Deleted participant with id: " + id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getAllParticipants() {
        try {
            System.out.println("All participant details:");
            ArrayList<Participant> users = db.getAllParticipants();
            users.forEach((participant) -> System.out.println(participant.toString()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void registerParticipanttoEvent() {
        try {
            String participantId, eventId;
            System.out.println("Register participant for event:");
            System.out.print("Enter participant id: ");
            participantId = br.readLine();
            System.out.print("Enter event id: ");
            eventId = br.readLine();
            db.registerParticipanttoEvent(participantId, eventId);
            System.out.println("Participant Registered");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}