/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.16
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;
using System.Reflection;

namespace Ory.Client.Model
{
    /// <summary>
    /// ClientSubmitSelfServiceRecoveryFlowBody
    /// </summary>
    [JsonConverter(typeof(ClientSubmitSelfServiceRecoveryFlowBodyJsonConverter))]
    [DataContract(Name = "submitSelfServiceRecoveryFlowBody")]
    public partial class ClientSubmitSelfServiceRecoveryFlowBody : AbstractOpenAPISchema, IEquatable<ClientSubmitSelfServiceRecoveryFlowBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSubmitSelfServiceRecoveryFlowBody" /> class
        /// with the <see cref="ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody.</param>
        public ClientSubmitSelfServiceRecoveryFlowBody(ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody`. If the actual instanct is not `ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody</returns>
        public ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody GetClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody()
        {
            return (ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClientSubmitSelfServiceRecoveryFlowBody {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, ClientSubmitSelfServiceRecoveryFlowBody.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of ClientSubmitSelfServiceRecoveryFlowBody
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of ClientSubmitSelfServiceRecoveryFlowBody</returns>
        public static ClientSubmitSelfServiceRecoveryFlowBody FromJson(string jsonString)
        {
            ClientSubmitSelfServiceRecoveryFlowBody newClientSubmitSelfServiceRecoveryFlowBody = null;

            if (jsonString == null)
            {
                return newClientSubmitSelfServiceRecoveryFlowBody;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody).GetProperty("AdditionalProperties") == null)
                {
                    newClientSubmitSelfServiceRecoveryFlowBody = new ClientSubmitSelfServiceRecoveryFlowBody(JsonConvert.DeserializeObject<ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody>(jsonString, ClientSubmitSelfServiceRecoveryFlowBody.SerializerSettings));
                }
                else
                {
                    newClientSubmitSelfServiceRecoveryFlowBody = new ClientSubmitSelfServiceRecoveryFlowBody(JsonConvert.DeserializeObject<ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody>(jsonString, ClientSubmitSelfServiceRecoveryFlowBody.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(String.Format("Failed to deserialize `{0}` into ClientSubmitSelfServiceRecoveryFlowWithLinkMethodBody: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + matchedTypes);
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newClientSubmitSelfServiceRecoveryFlowBody;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientSubmitSelfServiceRecoveryFlowBody);
        }

        /// <summary>
        /// Returns true if ClientSubmitSelfServiceRecoveryFlowBody instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientSubmitSelfServiceRecoveryFlowBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientSubmitSelfServiceRecoveryFlowBody input)
        {
            if (input == null)
                return false;

            return this.ActualInstance.Equals(input.ActualInstance);
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// Custom JSON converter for ClientSubmitSelfServiceRecoveryFlowBody
    /// </summary>
    public class ClientSubmitSelfServiceRecoveryFlowBodyJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((String)(typeof(ClientSubmitSelfServiceRecoveryFlowBody).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            if(reader.TokenType != JsonToken.Null)
            {
                return ClientSubmitSelfServiceRecoveryFlowBody.FromJson(JObject.Load(reader).ToString(Formatting.None));
            }
            return null;
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
