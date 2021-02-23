/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

public class Address {
    private Street StreetName;
    private String City;
    private String Country;
    
    public Address (Street sn, String city, String country){
        StreetName=sn;
        City=city;
        Country=country;
    }
    
    public void SetAddress (Street sn, String city, String country){
        StreetName=sn;
        City=city;
        Country=country;
    }
    
    public Street getStreetName(){
        return StreetName;
    }
    
    public String getCity(){
        return City;
    }
    
    public String getCountry(){
        return Country;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", this.StreetName, this.City, this.Country);
    }

}
