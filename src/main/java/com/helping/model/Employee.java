package com.helping.model;

import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "EMPLOYEE")
public class Employee extends AuditModel {

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

    @Column(name = "CURRENT_DOMAIN")
    @NotBlank
    private String currentDomain;

    @Column(name = "SEARCHING_DOMAIN")
    @NotBlank
    private String searchingDomain;

    @Column(name = "SKILLS")
    @NotBlank
    private String skills;

    @Column(name = "EMPLOYEE_STATUS")
    @NonNull
    private Boolean employeeStatus;

    @Column(name = "PASSWORD")
    @NotBlank
    private String password;

    @Column(name = "LINKEDIN_LINK")
    @NotBlank
    private String linkedinLink;

    @Column(name = "NAUKARI_LINK")
    @NotBlank
    private String naukariLink;

    @Column(name = "WHATSAPP_NUMBER")
    @Size(max = 10, min = 10, message = "Whatsapp number must be of 10 digits only")
    @NotBlank
    private String whatsappNumber;

    @Column(name = "CURRENT_COMPANY")
    @NotBlank
    private String currentCompany;

    @Column(name = "CURRENT_PACKAGE")
    @NonNull
    private Long currentPackage;

    @Column(name = "EXPECTED_PACKAGE")
    @NonNull
    private Long expectedPackage;

    @Column(name = "CURRENT_LOCATION")
    @NotBlank
    private String currentLocation;

    @Column(name = "EXPECTED_LOCATION")
    @NotBlank
    private String expectedLocation;

    @Column(name = "NOTICE_PERIOD")
    @NotBlank
    private String noticePeriod;


    public Employee() {

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

    public String getCurrentDomain() {
        return currentDomain;
    }

    public void setCurrentDomain(String currentDomain) {
        this.currentDomain = currentDomain;
    }

    public String getSearchingDomain() {
        return searchingDomain;
    }

    public void setSearchingDomain(String searchingDomain) {
        this.searchingDomain = searchingDomain;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Boolean getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(Boolean employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public String getCurrentCompany() {
        return currentCompany;
    }

    public void setCurrentCompany(String currentCompany) {
        this.currentCompany = currentCompany;
    }

    public Long getCurrentPackage() {
        return currentPackage;
    }

    public void setCurrentPackage(Long currentPackage) {
        this.currentPackage = currentPackage;
    }

    public Long getExpectedPackage() {
        return expectedPackage;
    }

    public void setExpectedPackage(Long expectedPackage) {
        this.expectedPackage = expectedPackage;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getExpectedLocation() {
        return expectedLocation;
    }

    public void setExpectedLocation(String expectedLocation) {
        this.expectedLocation = expectedLocation;
    }

    public String getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(String noticePeriod) {
        this.noticePeriod = noticePeriod;
    }
}
