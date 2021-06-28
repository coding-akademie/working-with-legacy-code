package de.codingakademie.publicfasade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ServerFasadeShould {
    @Test
    void report_compound_answer_with_additonal_responses() {
        Server server = new Server();
        final String answer = server.getCompoundAnswer();

        assertEquals("-", answer);
    }
}
