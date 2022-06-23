package br.com.throchadev.controller;

import br.com.throchadev.client.DolarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DolarController {

  @Autowired
  private DolarService dolarService;

  public void getDolar() {

    var response = dolarService.getDolar();

    System.out.println(response);

    return;
  }
}
