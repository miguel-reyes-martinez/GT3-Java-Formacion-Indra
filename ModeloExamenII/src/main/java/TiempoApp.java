import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class TiempoApp {

	public static void main(String[] args) {
		String urlTiempoBarcelona = "https://api.open-meteo.com/v1/forecast?latitude=41.39&longitude=2.16&hourly=temperature_2m";
		String urlTiempoBuenosAires = "https://api.open-meteo.com/v1/forecast?latitude=-34.61&longitude=-58.38&hourly=temperature_2m";
		String urlTiempoMadrid = "https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&hourly=temperature_2m";
		String urlTiempoBerlin = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m";

		try {
			
			JsonObject tiempoJsonBarcelona = getJsonObjectFromUrl(urlTiempoBarcelona);
			double temperaturaBarcelona = obtenerTemperaturaPromedio(tiempoJsonBarcelona);
			System.out.println("Tiempo actual en Barcelona: " + temperaturaBarcelona + "°C");
			generarRecomendacion(temperaturaBarcelona);

			JsonObject tiempoJsonBuenosAires = getJsonObjectFromUrl(urlTiempoBuenosAires);
			double temperaturaBuenosAires = obtenerTemperaturaPromedio(tiempoJsonBuenosAires);
			System.out.println("Tiempo actual en Buenos Aires: " + temperaturaBuenosAires + "°C");
			generarRecomendacion(temperaturaBuenosAires);

			JsonObject tiempoJsonMadrid = getJsonObjectFromUrl(urlTiempoMadrid);
			double temperaturaMadrid = obtenerTemperaturaPromedio(tiempoJsonMadrid);
			System.out.println("Tiempo actual en Madrid: " + temperaturaMadrid + "°C");
			generarRecomendacion(temperaturaMadrid);

			JsonObject tiempoJsonBerlin = getJsonObjectFromUrl(urlTiempoBerlin);
			double temperaturaBerlin = obtenerTemperaturaPromedio(tiempoJsonBerlin);
			System.out.println("Tiempo actual en Berlín: " + temperaturaBerlin + "°C");
			generarRecomendacion(temperaturaBerlin);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static JsonObject getJsonObjectFromUrl(String url) throws IOException {
		URL apiUrl = new URL(url);
		JsonReader reader = new JsonReader(new InputStreamReader(apiUrl.openStream()));
		return new Gson().fromJson(reader, JsonObject.class);
	}

	private static double obtenerTemperaturaPromedio(JsonObject tiempoJson) {
		JsonArray temperaturas = tiempoJson.getAsJsonObject("hourly").getAsJsonArray("temperature_2m");
		int numTemperaturas = temperaturas.size();

		double suma = 0.0;
		for (JsonElement temperaturaElemento : temperaturas) {
			double temperatura = temperaturaElemento.getAsDouble();
			suma += temperatura;
		}

		double temperaturaPromedio = suma / numTemperaturas;
		return temperaturaPromedio;
	}

	private static void generarRecomendacion(double temperatura) {
		if (temperatura > 10) {
			System.out.println("Recomendación: Llevar abrigo ligero.");
		} else {
			System.out.println("Recomendación: Llevar abrigo cálido.");
		}
	}
}
