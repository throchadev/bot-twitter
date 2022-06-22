package br.com.throchadev.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class AppConfiguration {

  @Value("${url.api}")
  private String url;
}
