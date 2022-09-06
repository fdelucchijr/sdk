/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.29
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// GenericError : Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct GenericError {
    /// The status code
    #[serde(rename = "code", skip_serializing_if = "Option::is_none")]
    pub code: Option<i64>,
    /// Debug information  This field is often not exposed to protect against leaking sensitive information.
    #[serde(rename = "debug", skip_serializing_if = "Option::is_none")]
    pub debug: Option<String>,
    /// Further error details
    #[serde(rename = "details", skip_serializing_if = "Option::is_none")]
    pub details: Option<serde_json::Value>,
    #[serde(rename = "error", skip_serializing_if = "Option::is_none")]
    pub error: Option<Box<crate::models::GenericErrorContent>>,
    /// The error ID  Useful when trying to identify various errors in application logic.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// Error message  The error's message.
    #[serde(rename = "message")]
    pub message: String,
    /// A human-readable reason for the error
    #[serde(rename = "reason", skip_serializing_if = "Option::is_none")]
    pub reason: Option<String>,
    /// The request ID  The request ID is often exposed internally in order to trace errors across service architectures. This is often a UUID.
    #[serde(rename = "request", skip_serializing_if = "Option::is_none")]
    pub request: Option<String>,
    /// The status description
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<String>,
}


impl GenericError {
    /// Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.
    pub fn new(message: String) -> GenericError {
        GenericError {
                code: None,
                debug: None,
                details: None,
                error: None,
                id: None,
                message,
                reason: None,
                request: None,
                status: None,
        }
    }
}


