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
    /// ContainerChangeResponseItem change item in response to ContainerChanges operation
    /// </summary>
    [DataContract(Name = "ContainerChangeResponseItem")]
    public partial class ClientContainerChangeResponseItem : IEquatable<ClientContainerChangeResponseItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientContainerChangeResponseItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientContainerChangeResponseItem()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientContainerChangeResponseItem" /> class.
        /// </summary>
        /// <param name="kind">Kind of change (required).</param>
        /// <param name="path">Path to file that has changed (required).</param>
        public ClientContainerChangeResponseItem(int kind = default(int), string path = default(string))
        {
            this.Kind = kind;
            // to ensure "path" is required (not null)
            this.Path = path ?? throw new ArgumentNullException("path is a required property for ClientContainerChangeResponseItem and cannot be null");
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Kind of change
        /// </summary>
        /// <value>Kind of change</value>
        [DataMember(Name = "Kind", IsRequired = true, EmitDefaultValue = false)]
        public int Kind { get; set; }

        /// <summary>
        /// Path to file that has changed
        /// </summary>
        /// <value>Path to file that has changed</value>
        [DataMember(Name = "Path", IsRequired = true, EmitDefaultValue = false)]
        public string Path { get; set; }

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
            sb.Append("class ClientContainerChangeResponseItem {\n");
            sb.Append("  Kind: ").Append(Kind).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
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
            return this.Equals(input as ClientContainerChangeResponseItem);
        }

        /// <summary>
        /// Returns true if ClientContainerChangeResponseItem instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientContainerChangeResponseItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientContainerChangeResponseItem input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Kind == input.Kind ||
                    this.Kind.Equals(input.Kind)
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
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
                hashCode = hashCode * 59 + this.Kind.GetHashCode();
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
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
