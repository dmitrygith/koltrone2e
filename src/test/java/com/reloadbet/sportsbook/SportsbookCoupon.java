package com.reloadbet.sportsbook;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.reloadbet.elements.ErrorCodes;
import com.reloadbet.pages.ReloadHomePage;
import com.reloadbet.pages.SportsBookPage;
import com.reloadbet.testData.TestAccount;
import com.reloadbet.testData.Url;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class SportsbookCoupon {

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

    @Test
    public void sportsbookLoad() {
        ReloadHomePage reloadHomePage = new ReloadHomePage();
        SportsBookPage sportsBookPage = new SportsBookPage();
        ErrorCodes errorCodes = new ErrorCodes();

        $(reloadHomePage.sportsbookTab).click();
        $(sportsBookPage.outcomeTest).click();
        System.out.printf("OK");
       /* $(sportsBookPage.lastMinuteWidget).shouldBe(Condition.visible);
        $(sportsBookPage.popularBetsWidget).shouldBe(Condition.visible);
        $(sportsBookPage.betslipTab).shouldBe(Condition.visible);
        $(sportsBookPage.myBetsTab).shouldBe(Condition.visible);
        $(sportsBookPage.popularLeaguesModul).shouldBe(Condition.visible);
        $(sportsBookPage.sportsMenuModul).shouldBe(Condition.visible);
        $(sportsBookPage.liveWidget).shouldBe(Condition.visible);
        $(errorCodes.noDataAvailable).shouldNotBe(Condition.visible);
        $(sportsBookPage.carouselPromo).shouldBe(Condition.visible);
        $(sportsBookPage.promo1).shouldBe(Condition.visible);
        $(sportsBookPage.promo2).shouldBe(Condition.visible);
        $(sportsBookPage.promo3).shouldBe(Condition.visible);
        $(sportsBookPage.promo4).shouldBe(Condition.visible);
        $(sportsBookPage.footerDiv).shouldBe(Condition.visible);
*/
    }

    @Test
    public void sportsMenu() {
        SportsBookPage sportsBookPage = new SportsBookPage();

        $(sportsBookPage.footballCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.tennisCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.basketballCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.volleyballCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.iceHockeyCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.hundballCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.americanFootballCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.rugbyUnionCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.futsalCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.cricketCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.boxingCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.ufcMmaCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.eSportsCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.snookerCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.cyclingCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.dartsCoupon).shouldBe(Condition.visible);
        $(sportsBookPage.golfCoupon).shouldBe(Condition.visible);
    }

    @Test
    public void footballExtension() {
        SportsBookPage sportsBookPage = new SportsBookPage();

        $(sportsBookPage.footballCoupon).click();

    }
}
