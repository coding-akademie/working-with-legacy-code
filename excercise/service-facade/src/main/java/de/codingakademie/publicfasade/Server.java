package de.codingakademie.publicfasade;

import org.json.JSONObject;

import de.codingakademie.internalfasade.SourceOneFasade;
import de.codingakademie.internalfasade.SourceTwoFasade;

public class Server {
    private final SourceOneFasade sourceOneFasade = new SourceOneFasade();
    private final SourceTwoFasade sourceTwoFasade = new SourceTwoFasade();

    public String getCompoundAnswer() {
        String one = sourceOneFasade.getSource();
        String two = sourceTwoFasade.getSource();

        JSONObject jone = new JSONObject(one);
        final int vone = jone.getInt("source");

        JSONObject jtwo = new JSONObject(two);
        final float vtwo = jone.getFloat("source");

        final float value = vone + vtwo * 9;
        String jsonString = new JSONObject().put("compound-answer", value)
                                            .put("addition-information", "Hello my World!")
                                            .put("details", new JSONObject().put("key1", "value1"))
                                            .toString();
        return jsonString;
    }
}
