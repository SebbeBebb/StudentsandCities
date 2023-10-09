public class City {
    private String country;
    private String cityName;

    City(String cityName, String country){
        this.country = country;
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public String getCityName() {
        return cityName;
    }
}
