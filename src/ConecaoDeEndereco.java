import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConecaoDeEndereco {

    public Double convestoDeMoeda (String moedaAtual, String moedaConvestida) {
        Gson gson = new Gson();
        Moeda moeda1 = null;

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/39cd47326a15613f1fed2705/latest/"+moedaAtual);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();


        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            moeda1 = gson.fromJson(response.body(), Moeda.class);
            return moeda1.getMoedaConvestida().get(moedaConvestida);
        } catch (Exception e) {
            throw new RuntimeException("Não Consequir obter o endereco a parti do cep."+e.getMessage());
        }
    }
}
