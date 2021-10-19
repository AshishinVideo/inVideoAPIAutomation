package invideo.api.api;

import io.restassured.response.Response;

import java.util.HashMap;

import static invideo.api.api.Route.API;
import static invideo.api.api.Route.TOKEN;
import static invideo.api.api.SpecBuilder.*;
import static io.restassured.RestAssured.given;

public class RestResource {


    public static Response post(String path, Object request){
        return given(getRequestSpec()).
                body(request).
        when().post(path).
        then().spec(getResponseSpec()).
                extract().
                response();
    }



    public static Response get(String path, String token){
        return given(getRequestSpec()).
                auth().oauth2(token).
        when().get(path).
        then().spec(getResponseSpec()).
                extract().
                response();
    }

    public static Response update(String path, String token, Object requestPlaylist){
        return given(getRequestSpec()).
                auth().oauth2(token).
                body(requestPlaylist).
        when().put(path).
        then().spec(getResponseSpec()).
                extract().
                response();
    }
}
