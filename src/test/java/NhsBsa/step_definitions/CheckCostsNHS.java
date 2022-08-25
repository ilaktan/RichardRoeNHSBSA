package NhsBsa.step_definitions;

import NhsBsa.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckCostsNHS {
    Pages pages = new Pages();

    @Given("User open browser")
    public void user_open_browser() {
        pages.genericFunctions().get();
    }
    @When("User on the website page")
    public void user_on_the_website_page() {
        pages.genericFunctions().userOnTheWebsiteHomepage();
    }

    @Then("User click the I am OK with cookies")
    public void userClickTheIAmOKWithCookies() {
        pages.checkCostsNHS().userClickTheIAmOKWithCookies();
    }

    @Then("User select the {string}")
    public void userSelectThe(String arg0) {
        pages.checkCostsNHS().userSelectThe(arg0);

    }

    @And("User click the {string}")
    public void userClickThe(String arg0) {
        pages.checkCostsNHS().userClickThe(arg0);
    }

    @Then("Is User GP practice in Scotland or Wales? {string}")
    public void isUserGPPracticeInScotlandOrWales(String arg0) {
        pages.checkCostsNHS().yesNoQuestion(arg0);
    }

    @And("User enter date of birth {string} {string} {string}")
    public void userEnterDateOfBirth(String arg0, String arg1, String arg2) {
        pages.checkCostsNHS().userEnterDateOfBirth(arg0,arg1,arg2);
    }

    @Then("User is living with a partner {string}")
    public void userIsLivingWithAPartner(String arg0) {
        pages.checkCostsNHS().yesNoQuestion(arg0);
    }

    @Then("User or partner  claim any benefits or tax credits {string}")
    public void userOrPartnerClaimAnyBenefitsOrTaxCredits(String arg0) {
        pages.checkCostsNHS().yesNoQuestion(arg0);
    }

    @Then("User or partner  get paid Universal Credit {string}")
    public void userOrPartnerGetPaidUniversalCredit(String arg0) {
        pages.checkCostsNHS().userOrPartnerGetPaidUniversalCredit(arg0);

    }



    @Then("and your partner have a combined take-home pay of £{int} or less in your last Universal Credit period {string}")
    public void andYourPartnerHaveACombinedTakeHomePayOf£OrLessInYourLastUniversalCreditPeriod(int arg0, String arg1) {
        //pages.checkCostsNHS().andYourPartnerHaveACombinedTakeHomePayOf£OrLessInYourLastUniversalCreditPeriod(arg0,arg1);
        pages.checkCostsNHS().yesNoQuestion(arg1);
    }

    @Then("User should see {string}")
    public void userShouldSee(String arg0) {
        pages.checkCostsNHS().userShouldSee(arg0);
    }



    @And("Is you in full-time education? {string}")
    public void isYouInFullTimeEducation(String arg0) {
        pages.checkCostsNHS().yesNoQuestion(arg0);
    }





    @Then("Do User have an injury or illness caused by serving in the armed forces? {string}")
    public void doUserHaveAnInjuryOrIllnessCausedByServingInTheArmedForces(String arg0) {
        pages.checkCostsNHS().yesNoQuestion(arg0);
    }

    @Then("Do User have diabetes? {string}")
    public void doUserHaveDiabetes(String arg0) {
        pages.checkCostsNHS().yesNoQuestion(arg0);
    }

    @Then("Do User have glaucoma? {string}")
    public void doUserHaveGlaucoma(String arg0) {
        pages.checkCostsNHS().yesNoQuestion(arg0);
    }

    @Then("Do you live permanently in a care home? {string}")
    public void doYouLivePermanentlyInACareHome(String arg0) {
        pages.checkCostsNHS().yesNoQuestion(arg0);
    }


    @Then("Do User have more than £ {string} in savings, investments or property? {string}")
    public void doUserHaveMoreThan£InSavingsInvestmentsOrProperty(String arg0, String arg1) {
        pages.checkCostsNHS().yesNoQuestion(arg1);


    }

    @Then("User close browser")
    public void userCloseBrowser() {
        pages.genericFunctions().closeDriver();
    }

    @Then("Do User live with a partner? {string}")
    public void doUserLiveWithAPartner(String arg0) {
        pages.checkCostsNHS().yesNoQuestion(arg0);
    }

    @Then("User joint Universal Credit, User have any of these {string} {string}")
    public void userJointUniversalCreditUserHaveAnyOfThese(String arg0, String arg1) {
        //ages.checkCostsNHS().userJointUniversalCreditUserHaveAnyOfThese(arg1);
        pages.checkCostsNHS().yesNoQuestion(arg1);
    }

    @Then("Is User pregnant or have User given birth in the last twelve months? {string}")
    public void isUserPregnantOrHaveUserGivenBirthInTheLastTwelveMonths(String arg0) {
        pages.checkCostsNHS().yesNoQuestion(arg0);
    }
}
