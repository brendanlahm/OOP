import java.lang.String;
import java.util.List;

public abstract class Tour {

    // Private attributes
    private String name;
    private String date;
    private String type;
    private int duration;
    private int length;
    private List<Participant> participants;

    // Constructor
    public Tour(String name, String date, String type, int duration, int length, List<Participant> participants) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.duration = duration;
        this.length = length;
        this.participants = participants;
    }

    // Getter for Tour Name
    public String getName() {
        return name;
    }

    // Method for printing attributes
    public String toString() {
        StringBuilder participantNames = new StringBuilder();
        for (Participant p : participants) {
            participantNames.append(p.getParticipantName()).append(", ");
        }

        // Remove the trailing comma and space
        if (participantNames.length() > 0) {
            participantNames.setLength(participantNames.length() - 2);
        }

        // Print a summary of the Tour
        return "\nHiking Tour Report:" +
                "\nName = " + name +
                "\nDate = " + date +
                "\nType = " + type +
                "\nDuration = " + duration + " hours" +
                "\nLength = " + length + " km" +
                "\nParticipants = " + participantNames.toString();
    }
}
