package tests;

import dto.UserDTO;
import manager.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public Logger logger = LoggerFactory.getLogger(TestBase.class);
    static ApplicationManager app = new ApplicationManager();
    UserDTO user = new UserDTO("lept901@gmail.com","81Veahsirg02");
    @BeforeSuite
    public void setUp() {
        app.init();
        logger.info("login with email --> "+user.getEmail()+" password --> "+user.getPassword());
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }

}
