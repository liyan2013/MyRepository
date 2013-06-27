package ssh.hibernate.domain;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/26/13
 * Time: 2:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Address {

    private Integer addressId;
    private String details;

    public Address(String details) {
        this.details = details;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}
