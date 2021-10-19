
package invideo.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
//@Data
//@Getter @Setter
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Login {

        @JsonProperty("userid")
        String userid;
        @JsonProperty("password")
        String password;
        @JsonProperty("route")
        String route;
        @JsonProperty("partnerToken")
        String partnerToken;
        @JsonProperty("referrer")
        String referrer;
        @JsonProperty("profileDeviceId")
        String profileDeviceId;
        @JsonProperty("token")
        String token;
        @JsonProperty("token_expires")
        Integer tokenExpires;
        @JsonProperty("email")
        String email;
        @JsonProperty("user_id")
        String userId;
        @JsonProperty("first_name")
        String firstName;
        @JsonProperty("last_name")
        String lastName;
        @JsonProperty("phone")
        String phone;
        @JsonProperty("account")
        Integer account;
        @JsonProperty("id")
        Integer id;
        @JsonProperty("role")
        String role;
        @JsonProperty("account_details")
        AccountDetails accountDetails;
        @JsonProperty("email_archetype")
        String emailArchetype;
        @JsonProperty("new_user")
        Boolean newUser;
}
