/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.175
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.NullPlan;

/**
 * Subscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T09:29:44.455918950Z[Etc/UTC]")
public class Subscription {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * The currently active plan of the subscription unknown Unknown free Free start_up_monthly StartUpMonthly start_up_yearly StartUpYearly custom Custom
   */
  @JsonAdapter(CurrentPlanEnum.Adapter.class)
  public enum CurrentPlanEnum {
    UNKNOWN("unknown"),
    
    FREE("free"),
    
    START_UP_MONTHLY("start_up_monthly"),
    
    START_UP_YEARLY("start_up_yearly"),
    
    CUSTOM("custom");

    private String value;

    CurrentPlanEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrentPlanEnum fromValue(String value) {
      for (CurrentPlanEnum b : CurrentPlanEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrentPlanEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrentPlanEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrentPlanEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrentPlanEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CURRENT_PLAN = "current_plan";
  @SerializedName(SERIALIZED_NAME_CURRENT_PLAN)
  private CurrentPlanEnum currentPlan;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ONGOING_STRIPE_CHECKOUT_ID = "ongoing_stripe_checkout_id";
  @SerializedName(SERIALIZED_NAME_ONGOING_STRIPE_CHECKOUT_ID)
  private String ongoingStripeCheckoutId;

  public static final String SERIALIZED_NAME_PAYED_UNTIL = "payed_until";
  @SerializedName(SERIALIZED_NAME_PAYED_UNTIL)
  private OffsetDateTime payedUntil;

  public static final String SERIALIZED_NAME_PLAN_CHANGES_AT = "plan_changes_at";
  @SerializedName(SERIALIZED_NAME_PLAN_CHANGES_AT)
  private OffsetDateTime planChangesAt;

  public static final String SERIALIZED_NAME_PLAN_CHANGES_TO = "plan_changes_to";
  @SerializedName(SERIALIZED_NAME_PLAN_CHANGES_TO)
  private NullPlan planChangesTo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Subscription() { 
  }

  
  public Subscription(
     OffsetDateTime createdAt, 
     CurrentPlanEnum currentPlan, 
     String customerId, 
     OffsetDateTime payedUntil, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.currentPlan = currentPlan;
    this.customerId = customerId;
    this.payedUntil = payedUntil;
    this.updatedAt = updatedAt;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The currently active plan of the subscription unknown Unknown free Free start_up_monthly StartUpMonthly start_up_yearly StartUpYearly custom Custom
   * @return currentPlan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The currently active plan of the subscription unknown Unknown free Free start_up_monthly StartUpMonthly start_up_yearly StartUpYearly custom Custom")

  public CurrentPlanEnum getCurrentPlan() {
    return currentPlan;
  }




   /**
   * The ID of the stripe customer
   * @return customerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the stripe customer")

  public String getCustomerId() {
    return customerId;
  }




  public Subscription id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Subscription ongoingStripeCheckoutId(String ongoingStripeCheckoutId) {
    
    this.ongoingStripeCheckoutId = ongoingStripeCheckoutId;
    return this;
  }

   /**
   * Get ongoingStripeCheckoutId
   * @return ongoingStripeCheckoutId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOngoingStripeCheckoutId() {
    return ongoingStripeCheckoutId;
  }


  public void setOngoingStripeCheckoutId(String ongoingStripeCheckoutId) {
    this.ongoingStripeCheckoutId = ongoingStripeCheckoutId;
  }


   /**
   * Until when the subscription is payed
   * @return payedUntil
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Until when the subscription is payed")

  public OffsetDateTime getPayedUntil() {
    return payedUntil;
  }




  public Subscription planChangesAt(OffsetDateTime planChangesAt) {
    
    this.planChangesAt = planChangesAt;
    return this;
  }

   /**
   * Get planChangesAt
   * @return planChangesAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getPlanChangesAt() {
    return planChangesAt;
  }


  public void setPlanChangesAt(OffsetDateTime planChangesAt) {
    this.planChangesAt = planChangesAt;
  }


  public Subscription planChangesTo(NullPlan planChangesTo) {
    
    this.planChangesTo = planChangesTo;
    return this;
  }

   /**
   * Get planChangesTo
   * @return planChangesTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NullPlan getPlanChangesTo() {
    return planChangesTo;
  }


  public void setPlanChangesTo(NullPlan planChangesTo) {
    this.planChangesTo = planChangesTo;
  }


  public Subscription status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.createdAt, subscription.createdAt) &&
        Objects.equals(this.currentPlan, subscription.currentPlan) &&
        Objects.equals(this.customerId, subscription.customerId) &&
        Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.ongoingStripeCheckoutId, subscription.ongoingStripeCheckoutId) &&
        Objects.equals(this.payedUntil, subscription.payedUntil) &&
        Objects.equals(this.planChangesAt, subscription.planChangesAt) &&
        Objects.equals(this.planChangesTo, subscription.planChangesTo) &&
        Objects.equals(this.status, subscription.status) &&
        Objects.equals(this.updatedAt, subscription.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, currentPlan, customerId, id, ongoingStripeCheckoutId, payedUntil, planChangesAt, planChangesTo, status, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currentPlan: ").append(toIndentedString(currentPlan)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ongoingStripeCheckoutId: ").append(toIndentedString(ongoingStripeCheckoutId)).append("\n");
    sb.append("    payedUntil: ").append(toIndentedString(payedUntil)).append("\n");
    sb.append("    planChangesAt: ").append(toIndentedString(planChangesAt)).append("\n");
    sb.append("    planChangesTo: ").append(toIndentedString(planChangesTo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

