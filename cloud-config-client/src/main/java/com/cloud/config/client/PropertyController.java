package com.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

  @Value("${luckyword}") String luckyWord;

  @RequestMapping("/luckyword")
  public String showLuckyWord() {
    return "The lucky word is: " + luckyWord;
  }
}
