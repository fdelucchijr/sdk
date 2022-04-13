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
pub struct CreateCustomHostnameBody {
    /// The domain where cookies will be set. Has to be a parent domain of the custom hostname to work.
    #[serde(rename = "cookie_domain", skip_serializing_if = "Option::is_none")]
    pub cookie_domain: Option<String>,
    /// The custom hostname where the API will be exposed.
    #[serde(rename = "hostname", skip_serializing_if = "Option::is_none")]
    pub hostname: Option<String>,
}

impl CreateCustomHostnameBody {
    pub fn new() -> CreateCustomHostnameBody {
        CreateCustomHostnameBody {
            cookie_domain: None,
            hostname: None,
        }
    }
}


