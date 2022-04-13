/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.165
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse503 {
    /// Errors contains a list of errors that caused the not ready status.
    #[serde(rename = "errors")]
    pub errors: ::std::collections::HashMap<String, String>,
}

impl InlineResponse503 {
    pub fn new(errors: ::std::collections::HashMap<String, String>) -> InlineResponse503 {
        InlineResponse503 {
            errors,
        }
    }
}


