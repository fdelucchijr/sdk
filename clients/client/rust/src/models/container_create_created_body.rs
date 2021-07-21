/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.16
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// ContainerCreateCreatedBody : ContainerCreateCreatedBody OK response to ContainerCreate operation



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ContainerCreateCreatedBody {
    /// The ID of the created container
    #[serde(rename = "Id")]
    pub id: String,
    /// Warnings encountered when creating the container
    #[serde(rename = "Warnings")]
    pub warnings: Vec<String>,
}

impl ContainerCreateCreatedBody {
    /// ContainerCreateCreatedBody OK response to ContainerCreate operation
    pub fn new(id: String, warnings: Vec<String>) -> ContainerCreateCreatedBody {
        ContainerCreateCreatedBody {
            id,
            warnings,
        }
    }
}


