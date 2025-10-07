
class Location {

    String name;
    double longitude;
    double latitude;

    public void test() {
        System.out.println("test1");
    }

    public Location(String name, double longitude, double latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Location(String name) {
        this.name = name;
        this.longitude = 13.23;
        this.latitude = 13.23;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLongitude(String name) {
        this.longitude = longitude;
    }

    void setLatitude(String name) {
        this.latitude = latitude;
    }

    String getName(String name) {
        return name;
    }

    double getLongitude(String name) {
        return longitude;
    }

    double getLatitude(String name) {
        return latitude;
    }

    @Override
    public String toString() {
        return name + "\t" + longitude + "\t" + latitude;
    }
}
