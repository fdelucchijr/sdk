# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.SchemaPatch do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :data,
    :name
  ]

  @type t :: %__MODULE__{
    :data => map(),
    :name => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.SchemaPatch do
  def decode(value, _options) do
    value
  end
end

