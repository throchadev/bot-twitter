package br.com.throchadev.client;

import br.com.throchadev.configuration.AppConfiguration;
import br.com.throchadev.objects.Root;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static br.com.throchadev.utils.ConstantsUtil.*;

@Service
public class DolarClient {

  private final WebClient webClient;

  public DolarClient(AppConfiguration appConfiguration, WebClient.Builder builder) {
    this.webClient = builder.baseUrl(appConfiguration.getUrl()).build();
  }

  public Mono<Root> getDolar() {

    return webClient
        .get()
        .uri(PATH_SEPARATOR_BAR + LAST + PATH_SEPARATOR_BAR + PATH_COIN)
        .accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .onStatus(HttpStatus::is4xxClientError,
            error -> Mono.error(new RuntimeException("Check the information")))
        .bodyToMono(Root.class);
  }
}
