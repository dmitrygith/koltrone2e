package com.reloadbet.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.reloadbet.elements.DropDownAccMenu;
import com.reloadbet.pages.BetsHistoryPage;
import com.reloadbet.pages.ReloadHomePage;
import com.reloadbet.testData.TestAccount;
import com.reloadbet.testData.Url;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BetsHistoryCheck {

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
        BetsHistoryPage betsHistoryPage = new BetsHistoryPage();
        //Test
        $(dropDownAccMenu.accDropMenuButton).shouldBe(Condition.visible).click();
        /*String foo = $(By.xpath(dropDownAccMenu.menuContainer)).getText();
        System.out.println(foo);*/
       // $(dropDownAccMenu.betsHistoryLink).shouldBe(Condition.enabled).click();
        sleep(3000);

        $(betsHistoryPage.calendarForm).shouldBe(Condition.visible);



    }
}
//FIXME!!!