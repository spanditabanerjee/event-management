import java.util.ArrayList;

public class Participant {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private ArrayList<String> currentEvents;

    Participant(String name, String phone, String email, String address) {
        this.id = UID.generateParticipantUID();
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.currentEvents = new ArrayList<String>();
    }

    public String getId() {
        return this.id;
    }

    public Participant updateParticipant(String name, String phone, String email, String address) {
        if (!name.isBlank())
            this.name = name;
        if (!phone.isBlank())
            this.phone = phone;
        if (!email.isBlank())
            this.email = email;
        if (!address.isBlank())
            this.address = address;
        return this;
    }

    public void registerParticipanttoEvent(String eventId) {
        if (this.currentEvents.indexOf(eventId) == -1)
            this.currentEvents.add(eventId);
    }

    

    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " + this.email + ", " + this.phone + ", " + this.address + ", "
                + this.currentEvents;
    }

}
