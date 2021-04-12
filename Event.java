import java.util.ArrayList;
public class Event {
    private String eventid;
    private String eventname;
    private ArrayList<String> eventtype;

    Event(String eventname, ArrayList<String> eventtype) {
        this.eventid = UID.generateEventUID();
        this.eventname = eventname;
        this.eventtype = eventtype;
    }

    public String getId() {
        return this.eventid;
    }

    public Event updateEvent(String eventname, ArrayList<String> eventtype) {
        if (!eventname.isBlank())
            this.eventname = eventname;
        if (!eventtype.isEmpty())
            this.eventtype = eventtype;
        return this;
    }

    @Override
    public String toString() {
        return this.eventid + ", " + this.eventname + ", " + this.eventtype;
    }

}
    

