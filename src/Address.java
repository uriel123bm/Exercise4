public class Address {
private String cityName;
private  String streetName;

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String toString() {
        return "Address:" +
                "cityName='" + this.cityName + '\'' +
                ", streetName='" + this.streetName + '\'' +
                '}';
    }
}
