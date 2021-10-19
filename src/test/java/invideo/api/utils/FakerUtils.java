package invideo.api.utils;

import com.github.javafaker.Faker;

public class FakerUtils {
    static Faker faker = new Faker();

    public static String generateUserid(){
        return faker.regexify("[A-Za-z0-9]{10}") + "@example.in";

    }
    public static String generateBrand(){
        return faker.company().name();
    }
    public static String generatePhonenumber(){
        return faker.phoneNumber().phoneNumber();
    }
    public static String generateName(){
        return faker.name().fullName();
    }

    //faker.regexify("[A-Za-z0-9 ,_-]{10}");
    //faker.regexify("[ A-Za-z0-9_@./#&+-]{50}

}
