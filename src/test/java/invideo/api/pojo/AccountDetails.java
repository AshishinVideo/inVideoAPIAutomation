
package invideo.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)


public class AccountDetails {

    @JsonProperty("payment_plan")
    private String paymentPlan;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("account_id")
    private Integer accountId;

    @JsonProperty("payment_plan")
    public String getPaymentPlan() {
        return paymentPlan;
    }

    @JsonProperty("payment_plan")
    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("account_id")
    public Integer getAccountId() {
        return accountId;
    }

    @JsonProperty("account_id")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

}
