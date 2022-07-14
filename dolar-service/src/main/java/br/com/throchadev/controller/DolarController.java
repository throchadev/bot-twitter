package br.com.throchadev.controller;

import br.com.throchadev.client.DolarService;
import br.com.throchadev.dto.DolarDto;
import br.com.throchadev.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/dolar", produces="application/json")
public class DolarController {

  @Autowired
  private DolarService dolarService;

  @Scheduled(fixedDelay = 5000)
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Mono<DolarDto> getDolar() {

    var response = dolarService.getDolar();

    response.subscribe(System.out::println);

    var dto = response.map(r -> r.dolar).map(AppUtils::entityToDto);

    return dto;

  }
}
