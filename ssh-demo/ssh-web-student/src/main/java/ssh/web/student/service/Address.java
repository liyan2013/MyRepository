package ssh.web.student.service;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/26/13
 * Time: 5:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Address {

    private Integer addressId;
    private String country;
    private String state;
    private String city;
    private String street;
    private String houseNumber;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
