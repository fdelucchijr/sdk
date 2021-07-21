/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.16
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// VolumeUsageData : VolumeUsageData Usage details about the volume. This information is used by the `GET /system/df` endpoint, and omitted in other endpoints.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct VolumeUsageData {
    /// The number of containers referencing this volume. This field is set to `-1` if the reference-count is not available.
    #[serde(rename = "RefCount")]
    pub ref_count: i64,
    /// Amount of disk space used by the volume (in bytes). This information is only available for volumes created with the `\"local\"` volume driver. For volumes created with other volume drivers, this field is set to `-1` (\"not available\")
    #[serde(rename = "Size")]
    pub size: i64,
}

impl VolumeUsageData {
    /// VolumeUsageData Usage details about the volume. This information is used by the `GET /system/df` endpoint, and omitted in other endpoints.
    pub fn new(ref_count: i64, size: i64) -> VolumeUsageData {
        VolumeUsageData {
            ref_count,
            size,
        }
    }
}


