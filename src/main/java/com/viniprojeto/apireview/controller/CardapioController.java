/*
definição da camada controller: As requisições chegam pela camada de controller
 */
package com.viniprojeto.apireview.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getCardapio(){
        return "Esse é o cardapio";
    }
}
