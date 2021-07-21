/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.16
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// Plugin : Plugin A plugin for the Engine API



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct Plugin {
    #[serde(rename = "Config")]
    pub config: Box<crate::models::PluginConfig>,
    /// True if the plugin is running. False if the plugin is not running, only installed.
    #[serde(rename = "Enabled")]
    pub enabled: bool,
    /// Id
    #[serde(rename = "Id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// name
    #[serde(rename = "Name")]
    pub name: String,
    /// plugin remote reference used to push/pull the plugin
    #[serde(rename = "PluginReference", skip_serializing_if = "Option::is_none")]
    pub plugin_reference: Option<String>,
    #[serde(rename = "Settings")]
    pub settings: Box<crate::models::PluginSettings>,
}

impl Plugin {
    /// Plugin A plugin for the Engine API
    pub fn new(config: crate::models::PluginConfig, enabled: bool, name: String, settings: crate::models::PluginSettings) -> Plugin {
        Plugin {
            config: Box::new(config),
            enabled,
            id: None,
            name,
            plugin_reference: None,
            settings: Box::new(settings),
        }
    }
}


