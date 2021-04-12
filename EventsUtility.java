import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EventsUtility {
    private Database db;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    EventsUtility(Database db) {
        this.db = db;
    }

    public void createEvent() {
        try {
            String eventname, eventtype;
            ArrayList<String> eventtypes = new ArrayList<String>();
            System.out.println("Create new event:");
            System.out.print("Enter name: ");
            eventname = br.readLine();
            System.out.print("Enter event type: ");
            eventtype = br.readLine();
            for (String et : eventtype.split(",")) {
                eventtypes.add(et.trim());
            }
            Event newEvent = db.createEvent(eventname, eventtypes);
            System.out.println(newEvent.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getEvent() {
        try {
            String eventid;
            System.out.println("Get event details:");
            System.out.print("Enter event id: ");
            eventid = br.readLine();
            Event event = db.getEventById(eventid);
            System.out.println(event.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateEvent() {
        try {
            String eventid, eventname, eventtype;
            ArrayList<String> eventtypes = new ArrayList<String>();
            System.out.println("Update event:");
            System.out.print("Enter event id: ");
            eventid = br.readLine();
            System.out.print("Enter event name: ");
            eventname = br.readLine();
            System.out.print("Enter eventtype: ");
            eventtype = br.readLine();
            for (String et : eventtype.split(",")) {
                eventtypes.add(et.trim());
            }
            Event event = db.updateEvent(eventid, eventname, eventtypes);
            System.out.println(event.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteEvent() {
        try {
            String eventid;
            System.out.println("Delete event:");
            System.out.println("Enter event id: ");
            eventid = br.readLine();
            db.deleteEvent(eventid);
            System.out.println("Deleted event with id: " + eventid);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getAllEvents() {
        try {
            System.out.println("All event details:");
            ArrayList<Event> events = db.getAllEvents();
            events.forEach((event) -> System.out.println(event.toString()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}