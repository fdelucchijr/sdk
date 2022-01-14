=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v0.0.1-alpha.46
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for OryClient::V0alpha0Api
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'V0alpha0Api' do
  before do
    # run before each test
    @api_instance = OryClient::V0alpha0Api.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of V0alpha0Api' do
    it 'should create an instance of V0alpha0Api' do
      expect(@api_instance).to be_instance_of(OryClient::V0alpha0Api)
    end
  end

  # unit tests for create_project
  # Create a Project
  # Creates a new project.
  # @param [Hash] opts the optional parameters
  # @option opts [ProjectPatch] :project_patch 
  # @return [Project]
  describe 'create_project test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_project
  # Get a Project
  # Get a projects you have access to by its ID.
  # @param project_id Project ID  The project&#39;s ID.
  # @param [Hash] opts the optional parameters
  # @return [Project]
  describe 'get_project test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_projects
  # List All Projects
  # Lists all projects you have access to.
  # @param [Hash] opts the optional parameters
  # @return [Array<Project>]
  describe 'list_projects test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_project
  # Update a Project
  # Creates a new configuration revision for a project.
  # @param project_id Project ID  The project&#39;s ID.
  # @param [Hash] opts the optional parameters
  # @option opts [ProjectPatch] :project_patch 
  # @return [Project]
  describe 'update_project test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
