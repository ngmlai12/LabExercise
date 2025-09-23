package J13_Recording.poi;

public class SatelliteMap extends Map {

    public SatelliteMap() {
        super();
    }

    @Override
    public String getLink (Poi poi) {
        String latitude = poi.getLatitude();
        String longitude = poi.getLongitude();

        return super.getBASE_URL() + "/?q="
                + latitude + ","
                + longitude + "&ll="
                + latitude + ","
                + longitude + "&z="
                + super.getZoomLevel()+ "&t=k";
    }
}
