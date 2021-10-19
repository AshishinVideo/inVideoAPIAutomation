package invideo.api.tests;

import invideo.api.api.StatusCode;
import invideo.api.api.applicationApi.LoginApi;
import invideo.api.api.applicationApi.SignupApi;
import invideo.api.pojo.Login;
import invideo.api.pojo.Signup;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static invideo.api.utils.FakerUtils.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SignupTests {


    @Test
    public void validSignup(){
        Signup requestsignup= signuprequestBuilder(generateName(),generateBrand(),"Password-1234",generateUserid(),generatePhonenumber());
        Response response = SignupApi.post(requestsignup);
        assertStatusCode(response.statusCode(), StatusCode.CODE_200);
    }
    //trying to sign up with already existing user
    @Test
    public void invalidSignup(){
        Signup requestSignup= signuprequestBuilder(generateName(),generateBrand(),"Password-1234","apiautoabfinalqtr25@example.in",generatePhonenumber());
        Response response = SignupApi.post(requestSignup);
        assertStatusCode(response.statusCode(), StatusCode.CODE_403);
    }

    @Step
    public Signup signuprequestBuilder(String fullname, String brand, String password, String email,String phonenumber){
        return Signup.builder().
                fullName(fullname).
                brandName(brand).
                email(email).
                password(password).
                route("invideo").
                link("https://staging.invideo.io/verify?mash=").
                phone(phonenumber).
                pageSource("https://staging.invideo.io/").
                buttonPosition("Top Right - Header").
                firstTouchPoint("/").
                lastTouchPoint("/").
                initialRawUrl("https://staging.invideo.io/").
                deviceId("1S-lO2f6SY1cbimhawuyWB").
                location("header").
                recaptchaResponse("qa").
                teamInvite(Boolean.TRUE).
                isInviteLinkUsed(Boolean.FALSE).
                teamId(null).teamRole(null).joinedVia(null).isMobile(Boolean.FALSE).
                referrer("app").
                profileDeviceId("1S-lO2f6SY1cbimhawuyWB").
                build();
    }
    @Step
    public void assertStatusCode(int actualStatusCode, StatusCode statusCode){
        assertThat(actualStatusCode, equalTo(statusCode.code));
    }
}
