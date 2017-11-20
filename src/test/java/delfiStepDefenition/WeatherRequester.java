package delfiStepDefenition;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class WeatherRequester {
    private String urlPrefix = "http://samples.openweathermap.org/data/2.5/weather?q=";
    private String urlPostfix = ",uk&appid=b1b15e88fa797225412429c1c50c122a1";
    public WeatherResponse getWeather(String cityName) throws IOException {
        String url = urlPrefix+cityName+urlPostfix;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
        String jasonResponse = response.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherResponse weatherResponse = objectMapper.readValue(jasonResponse, WeatherResponse.class);

        return weatherResponse;
    }


}
