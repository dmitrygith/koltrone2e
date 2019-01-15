package com.reloadbet.pages;

public class RegistrationPage {

    public String firstNameField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='firstName']";
    public String lastNameField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='lastName']";
    public String genderField = "/html//select[@id='sex']";
    public String emailField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='email']";
    public String mobileField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='mobile']";
    public String dateOfBirthField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='dob']";
    public String addressField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='address1']";
    public String cityField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='address3']";
    public String countryField = "/html//select[@id='countryCode']";
    public String postcodeField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='postcode']";
    public String usernameField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='username']";
    public String passwordField = "//div[2]/input[@name='password']";
    public String confirmPasswordField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='password_confirmation']";
    public String currencyField = "/html//select[@id='currencyCode']";
    public String bonusCodeField = "/html//div[@id='osg-app']//section/form[@class='osg-form']//input[@name='custom1']";
    public String policyCheckBox = "/html//input[@id='tcApprovalRequired']";
    public String subscribeCheckBox = "/html//input[@id='sendEmail']";
    public String personalDataProcessingCheckBox = "/html//input[@id='consentCheckbox']";
    public String submitButtonRegistration = "/html//div[@id='osg-app']//section/form[@class='osg-form']//button[@class='osg-button osg-button--primary']";
}
