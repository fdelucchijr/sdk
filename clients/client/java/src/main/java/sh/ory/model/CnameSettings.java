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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * CnameSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T15:03:23.816610581Z[Etc/UTC]")
public class CnameSettings {
  public static final String SERIALIZED_NAME_COOKIE_DOMAIN = "cookie_domain";
  @SerializedName(SERIALIZED_NAME_COOKIE_DOMAIN)
  private String cookieDomain;

  public static final String SERIALIZED_NAME_CORS_ALLOWED_ORIGINS = "cors_allowed_origins";
  @SerializedName(SERIALIZED_NAME_CORS_ALLOWED_ORIGINS)
  private List<String> corsAllowedOrigins = null;

  public static final String SERIALIZED_NAME_CORS_ENABLED = "cors_enabled";
  @SerializedName(SERIALIZED_NAME_CORS_ENABLED)
  private Boolean corsEnabled;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VERIFICATION_ERRORS = "verification_errors";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ERRORS)
  private List<String> verificationErrors = null;

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private String verificationStatus;

  public CnameSettings() { 
  }

  public CnameSettings cookieDomain(String cookieDomain) {
    
    this.cookieDomain = cookieDomain;
    return this;
  }

   /**
   * Get cookieDomain
   * @return cookieDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCookieDomain() {
    return cookieDomain;
  }


  public void setCookieDomain(String cookieDomain) {
    this.cookieDomain = cookieDomain;
  }


  public CnameSettings corsAllowedOrigins(List<String> corsAllowedOrigins) {
    
    this.corsAllowedOrigins = corsAllowedOrigins;
    return this;
  }

  public CnameSettings addCorsAllowedOriginsItem(String corsAllowedOriginsItem) {
    if (this.corsAllowedOrigins == null) {
      this.corsAllowedOrigins = new ArrayList<>();
    }
    this.corsAllowedOrigins.add(corsAllowedOriginsItem);
    return this;
  }

   /**
   * Get corsAllowedOrigins
   * @return corsAllowedOrigins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCorsAllowedOrigins() {
    return corsAllowedOrigins;
  }


  public void setCorsAllowedOrigins(List<String> corsAllowedOrigins) {
    this.corsAllowedOrigins = corsAllowedOrigins;
  }


  public CnameSettings corsEnabled(Boolean corsEnabled) {
    
    this.corsEnabled = corsEnabled;
    return this;
  }

   /**
   * Get corsEnabled
   * @return corsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCorsEnabled() {
    return corsEnabled;
  }


  public void setCorsEnabled(Boolean corsEnabled) {
    this.corsEnabled = corsEnabled;
  }


  public CnameSettings createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CnameSettings hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public CnameSettings id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CnameSettings updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CnameSettings verificationErrors(List<String> verificationErrors) {
    
    this.verificationErrors = verificationErrors;
    return this;
  }

  public CnameSettings addVerificationErrorsItem(String verificationErrorsItem) {
    if (this.verificationErrors == null) {
      this.verificationErrors = new ArrayList<>();
    }
    this.verificationErrors.add(verificationErrorsItem);
    return this;
  }

   /**
   * Get verificationErrors
   * @return verificationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVerificationErrors() {
    return verificationErrors;
  }


  public void setVerificationErrors(List<String> verificationErrors) {
    this.verificationErrors = verificationErrors;
  }


  public CnameSettings verificationStatus(String verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * CustomHostnameStatus is the enumeration of valid state values in the CustomHostnameSSL
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CustomHostnameStatus is the enumeration of valid state values in the CustomHostnameSSL")

  public String getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CnameSettings cnameSettings = (CnameSettings) o;
    return Objects.equals(this.cookieDomain, cnameSettings.cookieDomain) &&
        Objects.equals(this.corsAllowedOrigins, cnameSettings.corsAllowedOrigins) &&
        Objects.equals(this.corsEnabled, cnameSettings.corsEnabled) &&
        Objects.equals(this.createdAt, cnameSettings.createdAt) &&
        Objects.equals(this.hostname, cnameSettings.hostname) &&
        Objects.equals(this.id, cnameSettings.id) &&
        Objects.equals(this.updatedAt, cnameSettings.updatedAt) &&
        Objects.equals(this.verificationErrors, cnameSettings.verificationErrors) &&
        Objects.equals(this.verificationStatus, cnameSettings.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookieDomain, corsAllowedOrigins, corsEnabled, createdAt, hostname, id, updatedAt, verificationErrors, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CnameSettings {\n");
    sb.append("    cookieDomain: ").append(toIndentedString(cookieDomain)).append("\n");
    sb.append("    corsAllowedOrigins: ").append(toIndentedString(corsAllowedOrigins)).append("\n");
    sb.append("    corsEnabled: ").append(toIndentedString(corsEnabled)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    verificationErrors: ").append(toIndentedString(verificationErrors)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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
    openapiFields.add("cookie_domain");
    openapiFields.add("cors_allowed_origins");
    openapiFields.add("cors_enabled");
    openapiFields.add("created_at");
    openapiFields.add("hostname");
    openapiFields.add("id");
    openapiFields.add("updated_at");
    openapiFields.add("verification_errors");
    openapiFields.add("verification_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CnameSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CnameSettings.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CnameSettings is not found in the empty JSON string", CnameSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CnameSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CnameSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cookie_domain") != null && !jsonObj.get("cookie_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cookie_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cookie_domain").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("cors_allowed_origins") != null && !jsonObj.get("cors_allowed_origins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cors_allowed_origins` to be an array in the JSON string but got `%s`", jsonObj.get("cors_allowed_origins").toString()));
      }
      if (jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("verification_errors") != null && !jsonObj.get("verification_errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_errors` to be an array in the JSON string but got `%s`", jsonObj.get("verification_errors").toString()));
      }
      if (jsonObj.get("verification_status") != null && !jsonObj.get("verification_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CnameSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CnameSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CnameSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CnameSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<CnameSettings>() {
           @Override
           public void write(JsonWriter out, CnameSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CnameSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CnameSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CnameSettings
  * @throws IOException if the JSON string is invalid with respect to CnameSettings
  */
  public static CnameSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CnameSettings.class);
  }

 /**
  * Convert an instance of CnameSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

