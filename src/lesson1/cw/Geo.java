package lesson1.cw;

public class Geo {
    String lat;
    String lng;

    public Geo() {
    }

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
