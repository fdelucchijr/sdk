"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v0.0.1-alpha.108
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from ory_client.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from ory_client.exceptions import ApiAttributeError



class ProjectRevisionHook(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        return {
            'config_key': (str,),  # noqa: E501
            'hook': (str,),  # noqa: E501
            'created_at': (datetime,),  # noqa: E501
            'id': (str,),  # noqa: E501
            'project_revision_id': (str,),  # noqa: E501
            'updated_at': (datetime,),  # noqa: E501
            'web_hook_config_auth_api_key_in': (str,),  # noqa: E501
            'web_hook_config_auth_api_key_name': (str,),  # noqa: E501
            'web_hook_config_auth_api_key_value': (str,),  # noqa: E501
            'web_hook_config_auth_basic_auth_password': (str,),  # noqa: E501
            'web_hook_config_auth_basic_auth_user': (str,),  # noqa: E501
            'web_hook_config_auth_type': (str,),  # noqa: E501
            'web_hook_config_body': (str,),  # noqa: E501
            'web_hook_config_method': (str,),  # noqa: E501
            'web_hook_config_url': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'config_key': 'config_key',  # noqa: E501
        'hook': 'hook',  # noqa: E501
        'created_at': 'created_at',  # noqa: E501
        'id': 'id',  # noqa: E501
        'project_revision_id': 'project_revision_id',  # noqa: E501
        'updated_at': 'updated_at',  # noqa: E501
        'web_hook_config_auth_api_key_in': 'web_hook_config_auth_api_key_in',  # noqa: E501
        'web_hook_config_auth_api_key_name': 'web_hook_config_auth_api_key_name',  # noqa: E501
        'web_hook_config_auth_api_key_value': 'web_hook_config_auth_api_key_value',  # noqa: E501
        'web_hook_config_auth_basic_auth_password': 'web_hook_config_auth_basic_auth_password',  # noqa: E501
        'web_hook_config_auth_basic_auth_user': 'web_hook_config_auth_basic_auth_user',  # noqa: E501
        'web_hook_config_auth_type': 'web_hook_config_auth_type',  # noqa: E501
        'web_hook_config_body': 'web_hook_config_body',  # noqa: E501
        'web_hook_config_method': 'web_hook_config_method',  # noqa: E501
        'web_hook_config_url': 'web_hook_config_url',  # noqa: E501
    }

    read_only_vars = {
        'created_at',  # noqa: E501
        'updated_at',  # noqa: E501
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, config_key, hook, *args, **kwargs):  # noqa: E501
        """ProjectRevisionHook - a model defined in OpenAPI

        Args:
            config_key (str): The Hooks Config Key
            hook (str): The Hook Type

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            created_at (datetime): The Project's Revision Creation Date. [optional]  # noqa: E501
            id (str): [optional]  # noqa: E501
            project_revision_id (str): [optional]  # noqa: E501
            updated_at (datetime): Last Time Project's Revision was Updated. [optional]  # noqa: E501
            web_hook_config_auth_api_key_in (str): Whether to send the API Key in the HTTP Header or as a HTTP Cookie. [optional]  # noqa: E501
            web_hook_config_auth_api_key_name (str): The name of the api key. [optional]  # noqa: E501
            web_hook_config_auth_api_key_value (str): The value of the api key. [optional]  # noqa: E501
            web_hook_config_auth_basic_auth_password (str): The password to be sent in the HTTP Basic Auth Header. [optional]  # noqa: E501
            web_hook_config_auth_basic_auth_user (str): The username to be sent in the HTTP Basic Auth Header. [optional]  # noqa: E501
            web_hook_config_auth_type (str): HTTP Auth Method to use for the Web-Hook. [optional]  # noqa: E501
            web_hook_config_body (str): URI pointing to the JsonNet template used for Web-Hook payload generation. Only used for those HTTP methods, which support HTTP body payloads.. [optional]  # noqa: E501
            web_hook_config_method (str): The HTTP method to use (GET, POST, etc) for the Web-Hook. [optional]  # noqa: E501
            web_hook_config_url (str): The URL the Web-Hook should call. [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        self.config_key = config_key
        self.hook = hook
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, config_key, hook, *args, **kwargs):  # noqa: E501
        """ProjectRevisionHook - a model defined in OpenAPI

        Args:
            config_key (str): The Hooks Config Key
            hook (str): The Hook Type

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            created_at (datetime): The Project's Revision Creation Date. [optional]  # noqa: E501
            id (str): [optional]  # noqa: E501
            project_revision_id (str): [optional]  # noqa: E501
            updated_at (datetime): Last Time Project's Revision was Updated. [optional]  # noqa: E501
            web_hook_config_auth_api_key_in (str): Whether to send the API Key in the HTTP Header or as a HTTP Cookie. [optional]  # noqa: E501
            web_hook_config_auth_api_key_name (str): The name of the api key. [optional]  # noqa: E501
            web_hook_config_auth_api_key_value (str): The value of the api key. [optional]  # noqa: E501
            web_hook_config_auth_basic_auth_password (str): The password to be sent in the HTTP Basic Auth Header. [optional]  # noqa: E501
            web_hook_config_auth_basic_auth_user (str): The username to be sent in the HTTP Basic Auth Header. [optional]  # noqa: E501
            web_hook_config_auth_type (str): HTTP Auth Method to use for the Web-Hook. [optional]  # noqa: E501
            web_hook_config_body (str): URI pointing to the JsonNet template used for Web-Hook payload generation. Only used for those HTTP methods, which support HTTP body payloads.. [optional]  # noqa: E501
            web_hook_config_method (str): The HTTP method to use (GET, POST, etc) for the Web-Hook. [optional]  # noqa: E501
            web_hook_config_url (str): The URL the Web-Hook should call. [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        self.config_key = config_key
        self.hook = hook
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
