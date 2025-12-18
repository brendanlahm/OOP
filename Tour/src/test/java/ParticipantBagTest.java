import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.ArrayList;

public class ParticipantBagTest {

    @Test
    void testParticipantBagPass() {
        List<Participant> participantsPass = new ArrayList<>(List.of(
        new Participant("Brad", 10, new ArrayList<>(List.of(
                        new Item("Sports drink", 1.5),
                        new Item("Power bars", 1.0)
                ))),
        new Participant("Zac", 7, new ArrayList<>(List.of(
                        new Item("Cheese sandwiches", 0.7),
                        new Item("Jacket", 1.0)
                )))
        ));

        ParticipantBag tourPass = new ParticipantBag("Test-Tour", "28.05.2025", "Family Hiking Tour", 4, 20, participantsPass);

        // Assert that the participants will pass the Test
        Assertions.assertTrue(tourPass.isChildLoadValid(participantsPass));
    }

    @Test
    void testParticipantBagFail() {
        List<Participant> participantsFail = new ArrayList<>(List.of(
                new Participant("Brad", 10, new ArrayList<>(List.of(
                        new Item("Water bottle", 1.5),
                        new Item("Camping gear", 6.0),
                        new Item("Sports drink", 1.5),
                        new Item("Power bars", 1.0)
                ))),
                new Participant("Zac", 7, new ArrayList<>(List.of(
                        new Item("Cheese sandwiches", 0.7),
                        new Item("Picnic basket", 4.8),
                        new Item("Climbing equipment", 7.5),
                        new Item("Jacket", 1.0)
                )))
        ));

        ParticipantBag tourFail = new ParticipantBag("Test-Tour", "28.05.2025", "Family Hiking Tour", 4, 20, participantsFail);

        // Assert that the participants will fail the Test
        Assertions.assertFalse(tourFail.isChildLoadValid(participantsFail));
    }
}
