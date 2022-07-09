package br.com.throchadev.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Root {
  @JsonProperty("USDBRL")
  public Dolar dolar;
}

