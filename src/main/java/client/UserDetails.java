package client;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

//@Data
@JsonIgnoreProperties
public class UserDetails implements Serializable {

    private static final long serialVersionUID= 1L;
    private String userId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
