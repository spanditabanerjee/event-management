import java.util.ArrayList;
import java.util.HashMap;
//import java.sql.*;

public class Database {
    private HashMap<String, Participant> participants;
    private HashMap<String, Event> events;

    //private String server, database, username, password;

    // @SuppressLint("NewApi")
    //public Database(String server) {
        //this.server =server;
        //database = "event_mgmt";
        //username = "spandy";
        //password = "spy";
    //}
    //public Connection connect() {
        //Connection connection = null;
        //String ConnectionURL = "jdbc:jtds:sqlserver://" + server + ";databasename=" + database + ";user=" + username + ";password=" + password + ";";
        //try {
            //Class.forName("net.sourceforge.jtds.jdbc.Driver");
            //connection = DriverManager.getConnection(ConnectionURL);
        //} catch (Exception e) {
        //}
        //return connection;
    //}

    Database() {
        participants = new HashMap<String, Participant>();
        events = new HashMap<String, Event>();
    }

    public ArrayList<Participant> getAllParticipants() {
        ArrayList<Participant> participantsArray = new ArrayList<Participant>();
        participants.forEach((key, val) -> participantsArray.add(val));
        return participantsArray;
    }

    public Participant getParticipantById(String id) {
        return participants.get(id);
    }

    public Participant createParticipant(String name, String phone, String email, String address) {
        if (name.isBlank() || phone.isBlank())
            return null;
        Participant newParticipant = new Participant(name, phone, email, address);
        participants.put(newParticipant.getId(), newParticipant);
        return newParticipant;
    }

    public Participant updateParticipant(String id, String name, String phone, String email, String address) {
        return participants.get(id).updateParticipant(name, phone, email, address);
    }

    public void deleteParticipant(String id) {
        participants.remove(id);
    }

    public void registerParticipanttoEvent(String Id, String eventId) {
        Participant participant = this.participants.get(Id);
        if (participant != null ) {
            participant.registerParticipanttoEvent(eventId);
        }
    }

    

    public ArrayList<Event> getAllEvents() {
        ArrayList<Event> eventsArray = new ArrayList<Event>();
        events.forEach((key, val) -> eventsArray.add(val));
        return eventsArray;
    }

    public Event getEventById(String eventid) {
        return events.get(eventid);
    }

    public Event createEvent(String eventname, ArrayList<String> eventtype) {
        Event newEvent = new Event(eventname, eventtype);
        events.put(newEvent.getId(), newEvent);
        return newEvent;
    }

    public Event updateEvent(String eventid, String eventname, ArrayList<String> eventtype) {
        return events.get(eventid).updateEvent(eventname, eventtype);
    }

    public void deleteEvent(String eventid) {
        events.remove(eventid);
    }
}
