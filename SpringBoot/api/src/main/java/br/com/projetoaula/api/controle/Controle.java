package br.com.projetoaula.api.controle;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
   
    public String mensagem(){
        return "Hello World!";
    }

}
