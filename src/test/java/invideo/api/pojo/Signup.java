
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

public class Signup {

    @JsonProperty("full_name")
    String fullName;
    @JsonProperty("brand_name")
    String brandName;
    @JsonProperty("email")
    String email;
    @JsonProperty("password")
    String password;
    @JsonProperty("route")
    String route;
    @JsonProperty("link")
    String link;
    @JsonProperty("phone")
    String phone;
    @JsonProperty("page_source")
    String pageSource;
    @JsonProperty("button_position")
    String buttonPosition;
    @JsonProperty("first_touch_point")
    String firstTouchPoint;
    @JsonProperty("last_touch_point")
    String lastTouchPoint;
    @JsonProperty("initial_raw_url")
    String initialRawUrl;
    @JsonProperty("device_id")
    String deviceId;
    @JsonProperty("location")
    String location;
    @JsonProperty("recaptcha_response")
    String recaptchaResponse;
    @JsonProperty("team_invite")
    Boolean teamInvite;
    @JsonProperty("is_invite_link_used")
    Boolean isInviteLinkUsed;
    @JsonProperty("team_id")
    Object teamId;
    @JsonProperty("team_role")
    Object teamRole;
    @JsonProperty("joined_via")
    Object joinedVia;
    @JsonProperty("is_mobile")
    Boolean isMobile;
    @JsonProperty("referrer")
    String referrer;
    @JsonProperty("profileDeviceId")
    String profileDeviceId;

}
