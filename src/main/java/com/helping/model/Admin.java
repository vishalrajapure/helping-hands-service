package com.helping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ADMIN")
public class Admin extends AuditModel {

    @Id
    @Column(name = "MOBILE_NUMBER")
    @Size(max = 10, min = 10, message = "Mobile number must be of 10 digits only")
    @NotBlank
    private String mobileNumber;

    @Column(name = "FIRST_NAME")
    @NotBlank
    private String firstName;

    @Column(name = "LAST_NAME")
    @NotBlank
    private String lastName;

    @Column(name = "EMAIL")
    @NotBlank
    private String email;


    @Column(name = "WHATSAPP_NUMBER")
    @Size(max = 10, min = 10, message = "Whatsapp number must be of 10 digits only")
    @NotBlank
    private String whatsappNumber;

    @Column(name = "PASSWORD")
    @NotBlank
    private String password;

    @Column(name = "JOBS_IN_TEXT")
    @NotBlank
    private String jobsInText;


    @Column(name = "LINKEDIN_LINK")
    @NotBlank
    private String linkedinLink;

    @Column(name = "NAUKARI_LINK")
    @NotBlank
    private String naukariLink;


    public Admin() {

    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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

    public String getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobsInText() {
        return jobsInText;
    }

    public void setJobsInText(String jobsInText) {
        this.jobsInText = jobsInText;
    }

    public String getLinkedinLink() {
        return linkedinLink;
    }

    public void setLinkedinLink(String linkedinLink) {
        this.linkedinLink = linkedinLink;
    }

    public String getNaukariLink() {
        return naukariLink;
    }

    public void setNaukariLink(String naukariLink) {
        this.naukariLink = naukariLink;
    }
}
