package assignments.spring.q1;

public class Address {

    String street;
    String city;
    String state;
    int zip;
    String country;


    @Override
    public String toString() {
        return "Address [city=" + city + ", country=" + country + ", state=" + state + ", street=" + street + ", zip="
                + zip + "]";
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
