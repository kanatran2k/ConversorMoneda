import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConsultaAPI {

    public Convertidor obtenerTasa(String monedaBase, String monedaDestino) {
        // Almacenar en una variable la clave de la API
        String apiKey = "370977b9532ff39e073b30cd";

        try {
            // Contruir la URL para la API e incluir la selección del usuario
            URI url = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey +
                    "/pair/" + monedaBase + "/" + monedaDestino);

            // Crear el cliente HTTP
            HttpClient cliente = HttpClient.newHttpClient();

            // Construir la solicitud
            HttpRequest solicitud = HttpRequest.newBuilder().uri(url).build();

            // Enviar la solicitud y guardar la respuesta como String
            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

            // Convertir el JSON en un objeto Conversor usando Gson
            var gson = new Gson()
                    .fromJson(respuesta.body(), Convertidor.class);
            return gson;

        } catch (IOException | InterruptedException e) {
            System.out.println("!Advertencia¡ ha ocurrido un Error al consultar la API: " + e.getMessage());
            return null;
        }
    }
}
