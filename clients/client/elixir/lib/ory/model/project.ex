# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.Project do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :id,
    :name,
    :revision_id,
    :services,
    :slug,
    :state
  ]

  @type t :: %__MODULE__{
    :id => String.t,
    :name => String.t,
    :revision_id => String.t,
    :services => Ory.Model.ProjectServices.t,
    :slug => String.t,
    :state => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.Project do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:services, :struct, Ory.Model.ProjectServices, options)
  end
end

