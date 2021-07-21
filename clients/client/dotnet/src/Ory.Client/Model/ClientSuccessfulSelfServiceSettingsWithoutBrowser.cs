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
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// The Response for Settings Flows via API
    /// </summary>
    [DataContract(Name = "successfulSelfServiceSettingsWithoutBrowser")]
    public partial class ClientSuccessfulSelfServiceSettingsWithoutBrowser : IEquatable<ClientSuccessfulSelfServiceSettingsWithoutBrowser>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSuccessfulSelfServiceSettingsWithoutBrowser" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientSuccessfulSelfServiceSettingsWithoutBrowser()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSuccessfulSelfServiceSettingsWithoutBrowser" /> class.
        /// </summary>
        /// <param name="flow">flow (required).</param>
        /// <param name="identity">identity (required).</param>
        public ClientSuccessfulSelfServiceSettingsWithoutBrowser(ClientSelfServiceSettingsFlow flow = default(ClientSelfServiceSettingsFlow), ClientIdentity identity = default(ClientIdentity))
        {
            // to ensure "flow" is required (not null)
            this.Flow = flow ?? throw new ArgumentNullException("flow is a required property for ClientSuccessfulSelfServiceSettingsWithoutBrowser and cannot be null");
            // to ensure "identity" is required (not null)
            this.Identity = identity ?? throw new ArgumentNullException("identity is a required property for ClientSuccessfulSelfServiceSettingsWithoutBrowser and cannot be null");
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Flow
        /// </summary>
        [DataMember(Name = "flow", IsRequired = true, EmitDefaultValue = false)]
        public ClientSelfServiceSettingsFlow Flow { get; set; }

        /// <summary>
        /// Gets or Sets Identity
        /// </summary>
        [DataMember(Name = "identity", IsRequired = true, EmitDefaultValue = false)]
        public ClientIdentity Identity { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClientSuccessfulSelfServiceSettingsWithoutBrowser {\n");
            sb.Append("  Flow: ").Append(Flow).Append("\n");
            sb.Append("  Identity: ").Append(Identity).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientSuccessfulSelfServiceSettingsWithoutBrowser);
        }

        /// <summary>
        /// Returns true if ClientSuccessfulSelfServiceSettingsWithoutBrowser instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientSuccessfulSelfServiceSettingsWithoutBrowser to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientSuccessfulSelfServiceSettingsWithoutBrowser input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Flow == input.Flow ||
                    (this.Flow != null &&
                    this.Flow.Equals(input.Flow))
                ) && 
                (
                    this.Identity == input.Identity ||
                    (this.Identity != null &&
                    this.Identity.Equals(input.Identity))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
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
                if (this.Flow != null)
                    hashCode = hashCode * 59 + this.Flow.GetHashCode();
                if (this.Identity != null)
                    hashCode = hashCode * 59 + this.Identity.GetHashCode();
                if (this.AdditionalProperties != null)
                    hashCode = hashCode * 59 + this.AdditionalProperties.GetHashCode();
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

}
