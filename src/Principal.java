import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Principal {
    public static void main(String[] args) throws IOException {
        String endereco = "https://v6.exchangerate-api.com/v6/39cd47326a15613f1fed2705/mais recente/USD";

        URL url = new URL(endereco);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        String req_result = jsonobj.get("result").getAsString();

        System.out.println(req_result);
    }
}
