package delfiStepDefenition;

        import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
        import delfiStepDefenition.model.Coordinates;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    private Coordinates coord;

    public Coordinates getCoord() {
        return coord;
    }

    public void setCoord(Coordinates coord) {
        this.coord = coord;
    }
}