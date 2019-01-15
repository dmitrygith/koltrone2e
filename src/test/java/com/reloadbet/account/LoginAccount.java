package com.reloadbet.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.reloadbet.BaseClass;
import com.reloadbet.pages.ReloadHomePage;
import com.reloadbet.testData.TestAccount;
import com.reloadbet.testData.Url;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class LoginAccount extends BaseClass {

    @Test

    public void loginUser() {
        Url url = new Url();
        ReloadHomePage reloadHomePage = new ReloadHomePage();
        TestAccount testAccount = new TestAccount();
        Selenide.open(url.stageReloadHomePageUrl,
                "",
                "stage",
                "stagetest");
        //Test
        $(reloadHomePage.loginName).setValue(testAccount.reloadLog1);
        $(reloadHomePage.password).setValue(testAccount.reloadPass1);
        $(reloadHomePage.login).click();
        $(reloadHomePage.depositButton).shouldBe(Condition.visible);
    }

}