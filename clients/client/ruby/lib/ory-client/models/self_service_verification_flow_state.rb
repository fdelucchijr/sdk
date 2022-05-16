=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v0.0.1-alpha.175
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.4.0

=end

require 'date'
require 'time'

module OryClient
  class SelfServiceVerificationFlowState
    CHOOSE_METHOD = "choose_method".freeze
    SENT_EMAIL = "sent_email".freeze
    PASSED_CHALLENGE = "passed_challenge".freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def self.build_from_hash(value)
      new.build_from_hash(value)
    end

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = SelfServiceVerificationFlowState.constants.select { |c| SelfServiceVerificationFlowState::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #SelfServiceVerificationFlowState" if constantValues.empty?
      value
    end
  end
end
