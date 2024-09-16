package murach.models;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String isLike;
    private String isSendEmail;
    private String hearUsOption;
private String contactMeBy;

    public User() {
        isLike = "";
        isSendEmail = "";
       hearUsOption = "";
        contactMeBy = "";
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth = "";
    }

    public User(String firstName, String lastName, String email, String dateOfBirth, String isLike, String isSendEmail, String hearUsOption, String contactMeBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.isLike = isLike;
        this.isSendEmail = isSendEmail;
        this.hearUsOption = hearUsOption;
        this.contactMeBy = contactMeBy;
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

    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHearUsOption() {
        return hearUsOption;
    }

    public void setHearUsOption(String hearUsOption) {
        this.hearUsOption = hearUsOption;
    }

    public String getSendEmail() {
        return isSendEmail;
    }

    public void setSendEmail(String sendEmail) {
        isSendEmail = sendEmail;
    }

    public String getLike() {
        return isLike;
    }

    public void setLike(String like) {
        isLike = like;
    }

    public String getContactMeBy() {
        return contactMeBy;
    }

    public void setContactMeBy(String contactMeBy) {
        this.contactMeBy = contactMeBy;
    }
}

