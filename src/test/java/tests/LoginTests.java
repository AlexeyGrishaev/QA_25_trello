package tests;

import manager.RandomData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @Test
    public void validateLoginTest(){
        for (int i = 0; i < 5; i++) {
            System.out.println(RandomData.randomString((10)));

        }
        for (int j = 0; j <10;  j++) {
            System.out.println(RandomData.breedOfCats());

        }

    }
    @Test
    public void loginPositiveTest (){
        app.getHelperUser().login(user);
        Assert.assertTrue(app.getHelperUser().isElementPresent_btnAccount());
    }
}
