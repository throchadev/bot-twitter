package br.com.throchadev;

import br.com.throchadev.controller.DolarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication  {
  public static void main(String[] args) {
    SpringApplication.run(MainApplication.class, args);
  }

}