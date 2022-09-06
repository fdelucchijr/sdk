/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.29
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "nodetype")]
pub enum UiNodeAttributes {
    #[serde(rename="a")]
    UiNodeAnchorAttributes {
        /// The link's href (destination) URL.  format: uri
        #[serde(rename = "href")]
        // true, false, , String, false
        href: String,
        /// A unique identifier
        #[serde(rename = "id")]
        // true, false, , String, false
        id: String,
        #[serde(rename = "title")]
        // true, false, , crate::models::UiText, true
        title: Box<crate::models::UiText>,
    },
    #[serde(rename="img")]
    UiNodeImageAttributes {
        /// Height of the image
        #[serde(rename = "height")]
        // true, false, , i64, false
        height: i64,
        /// A unique identifier
        #[serde(rename = "id")]
        // true, false, , String, false
        id: String,
        /// The image's source URL.  format: uri
        #[serde(rename = "src")]
        // true, false, , String, false
        src: String,
        /// Width of the image
        #[serde(rename = "width")]
        // true, false, , i64, false
        width: i64,
    },
    #[serde(rename="input")]
    UiNodeInputAttributes {
        /// The autocomplete attribute for the input.
        #[serde(rename = "autocomplete", skip_serializing_if = "Option::is_none")]
        // false, false, AutocompleteEnum, String, false
        autocomplete: Option<UiNodeAttributesAutocompleteEnum>,
        /// Sets the input's disabled field to true or false.
        #[serde(rename = "disabled")]
        // true, false, , bool, false
        disabled: bool,
        #[serde(rename = "label", skip_serializing_if = "Option::is_none")]
        // false, false, , crate::models::UiText, true
        label: Option<Box<crate::models::UiText>>,
        /// The input's element name.
        #[serde(rename = "name")]
        // true, false, , String, false
        name: String,
        /// OnClick may contain javascript which should be executed on click. This is primarily used for WebAuthn.
        #[serde(rename = "onclick", skip_serializing_if = "Option::is_none")]
        // false, false, , String, false
        onclick: Option<String>,
        /// The input's pattern.
        #[serde(rename = "pattern", skip_serializing_if = "Option::is_none")]
        // false, false, , String, false
        pattern: Option<String>,
        /// Mark this input field as required.
        #[serde(rename = "required", skip_serializing_if = "Option::is_none")]
        // false, false, , bool, false
        required: Option<bool>,
        /// The input's element type.
        #[serde(rename = "type")]
        // true, false, TypeEnum, String, false
        _type: UiNodeAttributesTypeEnum,
        /// The input's value.
        #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
        // false, true, , serde_json::Value, false
        value: Option<serde_json::Value>,
    },
    #[serde(rename="script")]
    UiNodeScriptAttributes {
        /// The script async type
        #[serde(rename = "async")]
        // true, false, , bool, false
        _async: bool,
        /// The script cross origin policy
        #[serde(rename = "crossorigin")]
        // true, false, , String, false
        crossorigin: String,
        /// A unique identifier
        #[serde(rename = "id")]
        // true, false, , String, false
        id: String,
        /// The script's integrity hash
        #[serde(rename = "integrity")]
        // true, false, , String, false
        integrity: String,
        /// Nonce for CSP  A nonce you may want to use to improve your Content Security Policy. You do not have to use this value but if you want to improve your CSP policies you may use it. You can also choose to use your own nonce value!
        #[serde(rename = "nonce")]
        // true, false, , String, false
        nonce: String,
        /// The script referrer policy
        #[serde(rename = "referrerpolicy")]
        // true, false, , String, false
        referrerpolicy: String,
        /// The script source
        #[serde(rename = "src")]
        // true, false, , String, false
        src: String,
        /// The script MIME type
        #[serde(rename = "type")]
        // true, false, , String, false
        _type: String,
    },
    #[serde(rename="text")]
    UiNodeTextAttributes {
        /// A unique identifier
        #[serde(rename = "id")]
        // true, false, , String, false
        id: String,
        #[serde(rename = "text")]
        // true, false, , crate::models::UiText, true
        text: Box<crate::models::UiText>,
    },
}

/// The autocomplete attribute for the input.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum UiNodeAttributesAutocompleteEnum {
        #[serde(rename = "email")]
        Email,
        #[serde(rename = "tel")]
        Tel,
        #[serde(rename = "url")]
        Url,
        #[serde(rename = "current-password")]
        CurrentPassword,
        #[serde(rename = "new-password")]
        NewPassword,
        #[serde(rename = "one-time-code")]
        OneTimeCode,
}
/// The input's element type.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum UiNodeAttributesTypeEnum {
        #[serde(rename = "text")]
        Text,
        #[serde(rename = "password")]
        Password,
        #[serde(rename = "number")]
        Number,
        #[serde(rename = "checkbox")]
        Checkbox,
        #[serde(rename = "hidden")]
        Hidden,
        #[serde(rename = "email")]
        Email,
        #[serde(rename = "tel")]
        Tel,
        #[serde(rename = "submit")]
        Submit,
        #[serde(rename = "button")]
        Button,
        #[serde(rename = "datetime-local")]
        DatetimeLocal,
        #[serde(rename = "date")]
        Date,
        #[serde(rename = "url")]
        Url,
}




