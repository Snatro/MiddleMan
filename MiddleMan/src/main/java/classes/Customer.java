package classes;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

/**
 *  Customer's information
 */
public class Customer extends Login implements Serializable {

    long id;
    String name;
    String surname;
    LocalDateTime dateOfBirth;
    Address address;

    public Customer(String username, String password, long id, String name, String surname, Address address,
                    LocalDateTime dateOfBirth) {
        super(username, password);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
}
