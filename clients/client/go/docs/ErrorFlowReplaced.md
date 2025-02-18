# ErrorFlowReplaced

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **int64** | The status code | [optional] 
**Debug** | Pointer to **string** | Debug information  This field is often not exposed to protect against leaking sensitive information. | [optional] 
**Details** | Pointer to **map[string]interface{}** | Further error details | [optional] 
**Id** | Pointer to **string** | The error ID  Useful when trying to identify various errors in application logic. | [optional] 
**Message** | **string** | Error message  The error&#39;s message. | 
**Reason** | Pointer to **string** | A human-readable reason for the error | [optional] 
**Request** | Pointer to **string** | The request ID  The request ID is often exposed internally in order to trace errors across service architectures. This is often a UUID. | [optional] 
**Status** | Pointer to **string** | The status description | [optional] 
**UseFlowId** | Pointer to **string** | The flow ID that should be used for the new flow as it contains the correct messages. | [optional] 

## Methods

### NewErrorFlowReplaced

`func NewErrorFlowReplaced(message string, ) *ErrorFlowReplaced`

NewErrorFlowReplaced instantiates a new ErrorFlowReplaced object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewErrorFlowReplacedWithDefaults

`func NewErrorFlowReplacedWithDefaults() *ErrorFlowReplaced`

NewErrorFlowReplacedWithDefaults instantiates a new ErrorFlowReplaced object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *ErrorFlowReplaced) GetCode() int64`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ErrorFlowReplaced) GetCodeOk() (*int64, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ErrorFlowReplaced) SetCode(v int64)`

SetCode sets Code field to given value.

### HasCode

`func (o *ErrorFlowReplaced) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetDebug

`func (o *ErrorFlowReplaced) GetDebug() string`

GetDebug returns the Debug field if non-nil, zero value otherwise.

### GetDebugOk

`func (o *ErrorFlowReplaced) GetDebugOk() (*string, bool)`

GetDebugOk returns a tuple with the Debug field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebug

`func (o *ErrorFlowReplaced) SetDebug(v string)`

SetDebug sets Debug field to given value.

### HasDebug

`func (o *ErrorFlowReplaced) HasDebug() bool`

HasDebug returns a boolean if a field has been set.

### GetDetails

`func (o *ErrorFlowReplaced) GetDetails() map[string]interface{}`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *ErrorFlowReplaced) GetDetailsOk() (*map[string]interface{}, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *ErrorFlowReplaced) SetDetails(v map[string]interface{})`

SetDetails sets Details field to given value.

### HasDetails

`func (o *ErrorFlowReplaced) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### GetId

`func (o *ErrorFlowReplaced) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ErrorFlowReplaced) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ErrorFlowReplaced) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ErrorFlowReplaced) HasId() bool`

HasId returns a boolean if a field has been set.

### GetMessage

`func (o *ErrorFlowReplaced) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ErrorFlowReplaced) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ErrorFlowReplaced) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetReason

`func (o *ErrorFlowReplaced) GetReason() string`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *ErrorFlowReplaced) GetReasonOk() (*string, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *ErrorFlowReplaced) SetReason(v string)`

SetReason sets Reason field to given value.

### HasReason

`func (o *ErrorFlowReplaced) HasReason() bool`

HasReason returns a boolean if a field has been set.

### GetRequest

`func (o *ErrorFlowReplaced) GetRequest() string`

GetRequest returns the Request field if non-nil, zero value otherwise.

### GetRequestOk

`func (o *ErrorFlowReplaced) GetRequestOk() (*string, bool)`

GetRequestOk returns a tuple with the Request field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequest

`func (o *ErrorFlowReplaced) SetRequest(v string)`

SetRequest sets Request field to given value.

### HasRequest

`func (o *ErrorFlowReplaced) HasRequest() bool`

HasRequest returns a boolean if a field has been set.

### GetStatus

`func (o *ErrorFlowReplaced) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ErrorFlowReplaced) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ErrorFlowReplaced) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ErrorFlowReplaced) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetUseFlowId

`func (o *ErrorFlowReplaced) GetUseFlowId() string`

GetUseFlowId returns the UseFlowId field if non-nil, zero value otherwise.

### GetUseFlowIdOk

`func (o *ErrorFlowReplaced) GetUseFlowIdOk() (*string, bool)`

GetUseFlowIdOk returns a tuple with the UseFlowId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseFlowId

`func (o *ErrorFlowReplaced) SetUseFlowId(v string)`

SetUseFlowId sets UseFlowId field to given value.

### HasUseFlowId

`func (o *ErrorFlowReplaced) HasUseFlowId() bool`

HasUseFlowId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


