package com.reloadbet.registration;

import com.codeborne.selenide.Selenide;
import com.reloadbet.pages.RegistrationPage;
import com.reloadbet.testData.RandomData;
import com.reloadbet.testData.Url;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationNewAcc {


    @Test
    public void registrationNewAcc() {

        Url url = new Url();
        RegistrationPage registrationPage = new RegistrationPage();
        Random random = new Random();
        RandomData randomData = new RandomData();
        Selenide.open(url.stageReloadRegistrationPageUrl,
                "",
                "stage",
                "stagetest");

        $(By.xpath(registrationPage.firstNameField)).setValue(RandomData.dataRandom(9));
        $(By.xpath(registrationPage.lastNameField)).setValue(RandomData.dataRandom(13));
        $(By.xpath(registrationPage.addressField)).setValue(RandomData.dataRandom(23));
        $(By.xpath(registrationPage.cityField)).setValue(RandomData.dataRandom(7));
        $(By.xpath(registrationPage.usernameField)).setValue(RandomData.dataRandom(13));
        $(By.xpath(registrationPage.bonusCodeField)).setValue(RandomData.dataRandom(5));
        $(By.xpath(registrationPage.mobileField)).setValue(RandomData.phoneRandom());
        $(By.xpath(registrationPage.dateOfBirthField)).setValue(RandomData.dObRandom());
        $(By.xpath(registrationPage.postcodeField)).setValue(randomData.postCode);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        $(By.xpath(registrationPage.emailField)).sendKeys("username"+ randomInt +"@test.com");
        $(By.xpath(registrationPage.passwordField)).setValue(randomData.passwordNewAcc);
        $(By.xpath(registrationPage.confirmPasswordField)).setValue(randomData.passwordNewAcc);
        $(By.xpath(registrationPage.personalDataProcessingCheckBox)).click();
        $(By.xpath(registrationPage.policyCheckBox)).click();
        $(By.xpath(registrationPage.subscribeCheckBox)).click();
        $(By.xpath(registrationPage.genderField)).click();
        $(By.xpath(registrationPage.genderField)).selectOption(2);
        $(By.xpath(registrationPage.countryField)).selectOption(3);
        $(By.xpath(registrationPage.currencyField)).selectOption(3);
        $(By.xpath(registrationPage.submitButtonRegistration)).click();

        System.out.println("OK");
    }
}
