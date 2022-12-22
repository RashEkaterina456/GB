package lesson6;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CheckWeather {
    private final static String SCHEME = "http";
    private final static String BASE_HOST = "dataservice.accuweather.com";
    private final static String FORECAST = "forecasts";
    private final static String API_VERSION = "v1";
    private final static String FORECAST_TYPE = "daily";
    private final static String FORECAST_PERIOD = "5day";
    private final static String CITY_KEY = "474212_PC";
    private final static String API_KEY = "vyYDRAGpczJRODGxcdqqiVGQHNtXDWfp";
    private final static String LANGUAGE = "ru-ru";

    public static <HttpUrl, Request, Response> void main(String[] args) throws InterruptedException {
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout()
                .get()
                .wait(10, TimeUnit.SECONDS.ordinal())
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();

        HttpUrl url = new HttpUrl.Builder()
                .scheme(SCHEME)
                .host(BASE_HOST)
                .addPathSegment(FORECAST)
                .addPathSegment(API_VERSION)
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(FORECAST_PERIOD)
                .addPathSegment(CITY_KEY)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", LANGUAGE)
                .addQueryParameter("details", "false")
                .addQueryParameter("metric", "true")
                .build();

        System.out.println("URL value: " + url);

        Request request = new Request.Builder()
                .addHeader("accept", "*/*")
                .url(url)
                .build();

        try {
            Response response = client.newCall(request).execute();
            String body = response.toString().string();
            System.out.println("Body: " + body);
            System.out.println("Response code: " + response.code());
            System.out.println("Response headers:" + response.headers());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
