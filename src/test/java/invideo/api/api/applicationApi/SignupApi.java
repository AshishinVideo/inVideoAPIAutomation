package invideo.api.api.applicationApi;
import invideo.api.api.RestResource;
import invideo.api.pojo.Login;
import invideo.api.pojo.Signup;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static invideo.api.api.Route.LOGIN_PATH;
import static invideo.api.api.Route.SIGNUP_PATH;

public class SignupApi {
    @Step
    public static Response post(Signup signuprequest){
        return RestResource.post(SIGNUP_PATH, signuprequest);
    }

}
