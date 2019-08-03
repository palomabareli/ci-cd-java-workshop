package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
Classe de Teste.
***/

@RestController
@CrossOrigin
public class TestController {
/***
Método principal.
@return String.
***/
 @GetMapping("/home")
 public String homeRequest() {
  return "Hello World!";
 }
}
