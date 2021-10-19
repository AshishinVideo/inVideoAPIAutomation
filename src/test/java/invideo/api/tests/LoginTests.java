package invideo.api.tests;

import invideo.api.api.StatusCode;
import invideo.api.api.applicationApi.LoginApi;
import invideo.api.pojo.Error;
import invideo.api.pojo.Login;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static invideo.api.utils.FakerUtils.generateUserid;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginTests {

    @Test
    public void invalidLogin(){
        Login requestLogin= loginrequestBuilder(generateUserid(),"Password-1234");
        Response response = LoginApi.post(requestLogin);
        assertStatusCode(response.statusCode(), StatusCode.CODE_403);
    }
    @Test
    public void validLogin(){
        Login requestLogin= loginrequestBuilder("apiautoabfinalqtr6@example.in","Password-1234");
        Response response = LoginApi.post(requestLogin);
        assertStatusCode(response.statusCode(), StatusCode.CODE_200);
    }

    @Step
    public Login loginrequestBuilder(String userid, String password){
        return Login.builder().
                userid(userid).
                password(password).
                route("invideo").
                partnerToken("").
                referrer("app").
                profileDeviceId("1S-lO2f6SY1cbimhawuyWB").
                build();
    }@Step
    public void assertStatusCode(int actualStatusCode, StatusCode statusCode){
        assertThat(actualStatusCode, equalTo(statusCode.code));
    }
}
