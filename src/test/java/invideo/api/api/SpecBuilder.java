package invideo.api.api;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.HashMap;

public class SpecBuilder {

    public static RequestSpecification getRequestSpec(){
        HashMap<String, String> headerMap = new HashMap<String, String>();
        headerMap.put("sec-ch-ua", "Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"");
        headerMap.put("Accept", "application/json, text/plain, */*");
        headerMap.put("sec-ch-ua-mobile","?0");
        headerMap.put("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        headerMap.put("Content-Type","application/json");

        return new RequestSpecBuilder().
                setBaseUri("https://staging-api.invideo.io").
                addHeaders(headerMap).
                addFilter(new AllureRestAssured()).
                log(LogDetail.ALL).
                build();
    }

    public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder().
                log(LogDetail.ALL).
                build();
    }
}
