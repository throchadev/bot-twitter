package br.com.throchadev.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class DolarResponse {

  @JsonProperty("USDBRL")
  public USDBRL uSDBRL;

  public class USDBRL{
    public String code;
    public String codein;
    public String name;
    public String high;
    public String low;
    public String varBid;
    public String pctChange;
    public String bid;
    public String ask;
    public String timestamp;
    public String create_date;
  }
}
