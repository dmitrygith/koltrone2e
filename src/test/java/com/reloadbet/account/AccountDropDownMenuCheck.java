package com.reloadbet.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.reloadbet.elements.DropDownAccMenu;
import com.reloadbet.pages.ReloadHomePage;
import com.reloadbet.testData.TestAccount;
import com.reloadbet.testData.Url;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class AccountDropDownMenuCheck {
    @Test
     void loginUser() {
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

    @Test
     void dropDownMenu() {
        DropDownAccMenu dropDownAccMenu = new DropDownAccMenu();

        //Test
        $(dropDownAccMenu.accDropMenuButton).shouldBe(Condition.visible).click();
        $(dropDownAccMenu.betsHistoryLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.myTransactionsLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.bonusesLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.withdrawMoneyLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.pendingWithdrawalsLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.personalDetailsLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.logoutLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.nameAccAndNum).shouldBe(Condition.visible);
        $(dropDownAccMenu.balanceTitleMoneyHomepage).shouldBe(Condition.visible);
        $(dropDownAccMenu.moneySum).shouldBe(Condition.visible);
    }
}

