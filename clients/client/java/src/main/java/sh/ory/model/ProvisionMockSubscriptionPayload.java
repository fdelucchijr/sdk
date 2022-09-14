/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.43
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * ProvisionMockSubscriptionPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T15:03:23.816610581Z[Etc/UTC]")
public class ProvisionMockSubscriptionPayload {
  public static final String SERIALIZED_NAME_IDENTITY_ID = "identity_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_ID)
  private String identityId;

  public static final String SERIALIZED_NAME_PLAN_OR_PRICE = "plan_or_price";
  @SerializedName(SERIALIZED_NAME_PLAN_OR_PRICE)
  private String planOrPrice;

  public ProvisionMockSubscriptionPayload() { 
  }

  public ProvisionMockSubscriptionPayload identityId(String identityId) {
    
    this.identityId = identityId;
    return this;
  }

   /**
   * Get identityId
   * @return identityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIdentityId() {
    return identityId;
  }


  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }


  public ProvisionMockSubscriptionPayload planOrPrice(String planOrPrice) {
    
    this.planOrPrice = planOrPrice;
    return this;
  }

   /**
   * Get planOrPrice
   * @return planOrPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPlanOrPrice() {
    return planOrPrice;
  }


  public void setPlanOrPrice(String planOrPrice) {
    this.planOrPrice = planOrPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionMockSubscriptionPayload provisionMockSubscriptionPayload = (ProvisionMockSubscriptionPayload) o;
    return Objects.equals(this.identityId, provisionMockSubscriptionPayload.identityId) &&
        Objects.equals(this.planOrPrice, provisionMockSubscriptionPayload.planOrPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityId, planOrPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionMockSubscriptionPayload {\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    planOrPrice: ").append(toIndentedString(planOrPrice)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("identity_id");
    openapiFields.add("plan_or_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("identity_id");
    openapiRequiredFields.add("plan_or_price");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProvisionMockSubscriptionPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProvisionMockSubscriptionPayload.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProvisionMockSubscriptionPayload is not found in the empty JSON string", ProvisionMockSubscriptionPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProvisionMockSubscriptionPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProvisionMockSubscriptionPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProvisionMockSubscriptionPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("identity_id") != null && !jsonObj.get("identity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_id").toString()));
      }
      if (jsonObj.get("plan_or_price") != null && !jsonObj.get("plan_or_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_or_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_or_price").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProvisionMockSubscriptionPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProvisionMockSubscriptionPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProvisionMockSubscriptionPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProvisionMockSubscriptionPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ProvisionMockSubscriptionPayload>() {
           @Override
           public void write(JsonWriter out, ProvisionMockSubscriptionPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProvisionMockSubscriptionPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProvisionMockSubscriptionPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProvisionMockSubscriptionPayload
  * @throws IOException if the JSON string is invalid with respect to ProvisionMockSubscriptionPayload
  */
  public static ProvisionMockSubscriptionPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProvisionMockSubscriptionPayload.class);
  }

 /**
  * Convert an instance of ProvisionMockSubscriptionPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

