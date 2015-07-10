import java.net.*;
import java.io.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception {
        URL api = new URL("https://itunes.apple.com/search?term=kalai&country=US");
        URLConnection itunes = api.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                itunes.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}