package J13_Recording.poi;

public class Map {
    private String BASE_URL = "http://maps.google.com";
    private String BASE_DIR_URL = "https://www.google.com/maps/dir";

    private int zoomLevel = 18;

    public String getBASE_URL() {
        return BASE_URL;
    }

    public int getZoomLevel() {
        return zoomLevel;
    }

    public void setZoomLevel(int zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    public String getLink(Poi poi) {
        String latitude = poi.getLatitude();
        String longitude = poi.getLongitude();

        return BASE_URL + "/?q="
                + latitude + ","
                + longitude + "&ll="
                + latitude + ","
                + longitude + "&z="
                + zoomLevel;
    }

    public String getDirection(Poi poi1, Poi poi2) {
        String latitude1 = poi1.getLatitude();
        String longitude1 = poi1.getLongitude();
        String latitude2 = poi2.getLatitude();
        String longitude2 = poi2.getLongitude();

        return BASE_DIR_URL + "/?api=1&origin="
                +latitude1 + ","
                + longitude1 + "&destination="
                + latitude2 + ","
                + longitude2;


    }
}
