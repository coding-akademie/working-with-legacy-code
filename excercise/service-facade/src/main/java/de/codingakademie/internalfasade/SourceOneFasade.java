package de.codingakademie.internalfasade;

import org.json.JSONObject;

import de.codingakademie.core.SourceOne;

public class SourceOneFasade {
    private final SourceOne source = new SourceOne();

    public String getSource() {
        return new JSONObject().put("source", source.getOne())
                               .toString();
    }
}
