
import org.junit.jupiter.api.Test;
import steps.MainSteps;


public class LoginTest extends BaseTest {

    private final MainSteps mainPage = new MainSteps();

    @Test
    public void verifyOpenLoginForm(){
        mainPage.openMainPage();
        mainPage.clickOnLoginButton();
        mainPage.assertLoginPageIsOpen();
    }

    @Test
    public void verifyUserLogin(){
      //todo: відкрити мейн пейдж
      //todo: клікнути на лоігн кнопку
      //todo: ввести логін на сторінці Логіна
      //todo: ввести пароль на сторінці Логіна
      //todo: натиснути кнопку Увійти на сторінці Логіна
      //todo: перевірити що юзер залогінений
    }
}
