package invideo.api.tests;

import invideo.api.api.StatusCode;
import invideo.api.api.applicationApi.LoginApi;
import invideo.api.pojo.Error;
import invideo.api.pojo.Login;
import invideo.api.utils.DataLoader;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static invideo.api.utils.FakerUtils.generateUserid;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Feature("Login API")
public class LoginTests extends BaseTest{

    @Test
    public void invalidLogin(){
        Login requestLogin= loginrequestBuilder(generateUserid(),"Password-1234");
        Response response = LoginApi.post(requestLogin);
        assertStatusCode(response.statusCode(), StatusCode.CODE_403);
    }
    @Description("API should return 200 status when logged in with valid credentials")
    @Test(description = "Should login with valid credentials")
    public void validLogin() throws IOException {
        Login requestLogin= loginrequestBuilder("apiautoabfinalqtr6@example.in","Password-1234");
        Response response = LoginApi.post(requestLogin);
        DataLoader.getInstance().setToken(response.jsonPath().get("token"));
       System.out.println("This is token " + DataLoader.getInstance().getToken());
        assertStatusCode(response.statusCode(), StatusCode.CODE_200);
    }

    @Step("Login request")
    public Login loginrequestBuilder(String userid, String password){
        return Login.builder().
                userid(userid).
                password(password).
                route("invideo").
                partnerToken("").
                referrer("app").
                profileDeviceId("1S-lO2f6SY1cbimhawuyWB").
                build();
    }
    @Step("Status code should be as expected")
    public void assertStatusCode(int actualStatusCode, StatusCode statusCode){
        assertThat(actualStatusCode, equalTo(statusCode.code));
    }
}
