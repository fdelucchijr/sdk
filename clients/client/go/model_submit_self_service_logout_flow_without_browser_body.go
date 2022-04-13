/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.165
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// SubmitSelfServiceLogoutFlowWithoutBrowserBody nolint:deadcode,unused
type SubmitSelfServiceLogoutFlowWithoutBrowserBody struct {
	// The Session Token  Invalidate this session token.
	SessionToken string `json:"session_token"`
}

// NewSubmitSelfServiceLogoutFlowWithoutBrowserBody instantiates a new SubmitSelfServiceLogoutFlowWithoutBrowserBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSubmitSelfServiceLogoutFlowWithoutBrowserBody(sessionToken string) *SubmitSelfServiceLogoutFlowWithoutBrowserBody {
	this := SubmitSelfServiceLogoutFlowWithoutBrowserBody{}
	this.SessionToken = sessionToken
	return &this
}

// NewSubmitSelfServiceLogoutFlowWithoutBrowserBodyWithDefaults instantiates a new SubmitSelfServiceLogoutFlowWithoutBrowserBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSubmitSelfServiceLogoutFlowWithoutBrowserBodyWithDefaults() *SubmitSelfServiceLogoutFlowWithoutBrowserBody {
	this := SubmitSelfServiceLogoutFlowWithoutBrowserBody{}
	return &this
}

// GetSessionToken returns the SessionToken field value
func (o *SubmitSelfServiceLogoutFlowWithoutBrowserBody) GetSessionToken() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SessionToken
}

// GetSessionTokenOk returns a tuple with the SessionToken field value
// and a boolean to check if the value has been set.
func (o *SubmitSelfServiceLogoutFlowWithoutBrowserBody) GetSessionTokenOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.SessionToken, true
}

// SetSessionToken sets field value
func (o *SubmitSelfServiceLogoutFlowWithoutBrowserBody) SetSessionToken(v string) {
	o.SessionToken = v
}

func (o SubmitSelfServiceLogoutFlowWithoutBrowserBody) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["session_token"] = o.SessionToken
	}
	return json.Marshal(toSerialize)
}

type NullableSubmitSelfServiceLogoutFlowWithoutBrowserBody struct {
	value *SubmitSelfServiceLogoutFlowWithoutBrowserBody
	isSet bool
}

func (v NullableSubmitSelfServiceLogoutFlowWithoutBrowserBody) Get() *SubmitSelfServiceLogoutFlowWithoutBrowserBody {
	return v.value
}

func (v *NullableSubmitSelfServiceLogoutFlowWithoutBrowserBody) Set(val *SubmitSelfServiceLogoutFlowWithoutBrowserBody) {
	v.value = val
	v.isSet = true
}

func (v NullableSubmitSelfServiceLogoutFlowWithoutBrowserBody) IsSet() bool {
	return v.isSet
}

func (v *NullableSubmitSelfServiceLogoutFlowWithoutBrowserBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSubmitSelfServiceLogoutFlowWithoutBrowserBody(val *SubmitSelfServiceLogoutFlowWithoutBrowserBody) *NullableSubmitSelfServiceLogoutFlowWithoutBrowserBody {
	return &NullableSubmitSelfServiceLogoutFlowWithoutBrowserBody{value: val, isSet: true}
}

func (v NullableSubmitSelfServiceLogoutFlowWithoutBrowserBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSubmitSelfServiceLogoutFlowWithoutBrowserBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


