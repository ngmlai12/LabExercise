package J13_Recording.poi;

public class Poi {
    private String name;
    private String latitude;
    private String longitude;

    public Poi(String name, String latitude, String longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getCoordinate (){
        return latitude+","+longitude;
    }

    public String toString(){
        return "Name: "+name+", Coordinate: "+getCoordinate();
    }
}
