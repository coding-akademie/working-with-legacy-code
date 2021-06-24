package de.codingakademie.seam;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BuildSeamsInto {
    public static void main(String[] args) throws IOException {
        new BuildSeamsInto().main();
    }

    private void main() throws IOException {
        System.out.println("Hello User");

        URL url = new URL("https://www.timeanddate.com/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setDoOutput(true);

        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.flush();
        out.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();

        final String searchFor = "<span id=\"clk_hm\">";
        int pos = content.indexOf(searchFor);
        System.out.println(content.substring(pos + searchFor.length(), pos + searchFor.length() + 5));
        System.out.println("Bye");
    }
}
