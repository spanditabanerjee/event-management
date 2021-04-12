public class UID {
    private static int eventUID = 1;
    private static int participantUID = 1;

    public static String generateEventUID() {
        return "evt" + eventUID++;
    }

    public static String generateParticipantUID() {
        return "prpt" + participantUID++;
    }
}
