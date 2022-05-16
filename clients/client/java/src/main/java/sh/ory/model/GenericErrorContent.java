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

/**
 * Error response
 */
@ApiModel(description = "Error response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T09:29:44.455918950Z[Etc/UTC]")
public class GenericErrorContent {
  public static final String SERIALIZED_NAME_DEBUG = "debug";
  @SerializedName(SERIALIZED_NAME_DEBUG)
  private String debug;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "error_description";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  private String errorDescription;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Long statusCode;

  public GenericErrorContent() { 
  }

  public GenericErrorContent debug(String debug) {
    
    this.debug = debug;
    return this;
  }

   /**
   * Debug contains debug information. This is usually not available and has to be enabled.
   * @return debug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The database adapter was unable to find the element", value = "Debug contains debug information. This is usually not available and has to be enabled.")

  public String getDebug() {
    return debug;
  }


  public void setDebug(String debug) {
    this.debug = debug;
  }


  public GenericErrorContent error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Name is the error name.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The requested resource could not be found", value = "Name is the error name.")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public GenericErrorContent errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Description contains further information on the nature of the error.
   * @return errorDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Object with ID 12345 does not exist", value = "Description contains further information on the nature of the error.")

  public String getErrorDescription() {
    return errorDescription;
  }


  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  public GenericErrorContent message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message contains the error message.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message contains the error message.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public GenericErrorContent statusCode(Long statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Code represents the error status code (404, 403, 401, ...).
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "404", value = "Code represents the error status code (404, 403, 401, ...).")

  public Long getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericErrorContent genericErrorContent = (GenericErrorContent) o;
    return Objects.equals(this.debug, genericErrorContent.debug) &&
        Objects.equals(this.error, genericErrorContent.error) &&
        Objects.equals(this.errorDescription, genericErrorContent.errorDescription) &&
        Objects.equals(this.message, genericErrorContent.message) &&
        Objects.equals(this.statusCode, genericErrorContent.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debug, error, errorDescription, message, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericErrorContent {\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

