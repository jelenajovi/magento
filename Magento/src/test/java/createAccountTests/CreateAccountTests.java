package createAccountTests;

import org.example.pages.CreateAccountPage;
import org.example.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import productsTests.BaseTest;

public class CreateAccountTests extends BaseTest {

    @Test
    public void createAccountSuccessfully() {

        HomePage homePage = new HomePage(driver);
        homePage.clickOnCreateAccountLink();

        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.enterFirstName("Jelena");
        createAccountPage.enterLastName("Jov");
        createAccountPage.enterEmail("jelejov@gmail.com");
        createAccountPage.enterPassword("JEmi!9876");
        createAccountPage.enterPasswordConf("JEmi!9876");
        createAccountPage.createAccount();
    }

}
