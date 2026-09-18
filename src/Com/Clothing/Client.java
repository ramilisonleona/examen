package Com.Clothing;

import java.time.LocalDate;
import java.util.Objects;

public class Client {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final String address;
    private final String email;
    private final String phone;

    public Client(String firstName, String lastName, LocalDate birthDate, String address, String email, String phone) {
        this.firstName = Objects.requireNonNull(firstName);
        this.lastName = Objects.requireNonNull(lastName);
        this.birthDate = Objects.requireNonNull(birthDate);
        this.address = Objects.requireNonNull(address);
        this.email = Objects.requireNonNull(email);
        this.phone = Objects.requireNonNull(phone);
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public LocalDate getBirthDate() { return birthDate; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}