public class Address {
    private String StreetName;
    private String City;
    private String Country;

    public Address(String sn, String city, String country) {
        StreetName = sn;
        City = city;
        Country = country;
    }

    public void SetAddress(String sn, String city, String country) {
        StreetName = sn;
        City = city;
        Country = country;
    }

    public String getStreetName() {
        return StreetName;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }
}
