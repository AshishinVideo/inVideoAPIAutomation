package invideo.api.api.applicationApi;
import invideo.api.api.RestResource;
import invideo.api.pojo.Login;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static invideo.api.api.Route.*;

public class LoginApi {
    @Step
    public static Response post(Login loginRequest){
        return RestResource.post(LOGIN_PATH, loginRequest);
    }

}


