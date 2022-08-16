package classes;

import java.io.Serializable;

/**
 * Provider's information
 */

public class Provider extends Login implements Serializable {
    Long id;
    String storeName;
    Address address;
    String corporateName;

    public Provider(String username, String password,Long id, String storeName, Address address, String corporateName) {
        super(username, password);
        this.id = id;
        this.storeName = storeName;
        this.address = address;
        this.corporateName = corporateName;
    }

    public Provider(String username, String password) {
        super(username, password);
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }
}
