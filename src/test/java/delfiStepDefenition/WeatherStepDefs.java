package delfiStepDefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WeatherStepDefs {

    private WeatherRequester wr = new WeatherRequester();
    private String cityName;
    private WeatherResponse weatherResponse;

    @Given("City name is (.*)")
    public void setCityName(String name) {
        cityName = name;
        System.out.println("step 1 GIVEN ");
    }

    @When("Requesting weather information")
    public void requestWeatherInformation() throws IOException {
        weatherResponse = wr.getWeather(cityName);
        System.out.println("step 2 WHEN ");
    }


    @Then("Coordinates are lon: (.) and lat: (.)")
    public void checkCoordinates(BigDecimal lon, BigDecimal lat) {
        assertEquals(lon, weatherResponse.getCoord().getLon());
        assertEquals(lat, weatherResponse.getCoord().getLat());
        System.out.println("step 3 THEN");
    }
}
