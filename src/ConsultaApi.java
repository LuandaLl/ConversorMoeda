import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public Moedas consultaApi(String tipoMoeda, String moedaDesejada, double valorMoeda) throws IOException, InterruptedException {

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/b28d91e94b8880e76de72b5c/pair/" +tipoMoeda + "/" +
                moedaDesejada  + "/" +valorMoeda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moedas.class);
        }catch(Exception e){
            throw new RuntimeException("Não consegui obter informações");
        }

    }
}
