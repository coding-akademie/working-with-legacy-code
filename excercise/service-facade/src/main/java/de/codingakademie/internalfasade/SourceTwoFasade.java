package de.codingakademie.internalfasade;

import org.json.JSONObject;

import de.codingakademie.core.SourceTwo;

public class SourceTwoFasade {
    private final SourceTwo source = new SourceTwo();

    public String getSource() {
        return new JSONObject().put("source", source.getTwo())
                               .toString();
    }
}
