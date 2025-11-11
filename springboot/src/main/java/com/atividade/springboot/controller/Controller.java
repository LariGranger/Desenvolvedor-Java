package com.atividade.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api")
    public String home(){
        return "Olá, SpringBoot";
    }
    @GetMapping("/api/soma/{numUm}/{numDois}")
    public int soma(@PathVariable int numUm, @PathVariable int numDois){
        return numUm + numDois;
    }
    @GetMapping("/api/subtracao/{numUm}/{numDois}")
    public int subtracao(@PathVariable int numUm, @PathVariable int numDois){
        return numUm - numDois;
    }
    @GetMapping("/api/verificaParImpar/{numUm}")
    public String verificaParImpar(@PathVariable int numUm){
        if(numUm % 2 == 0){
            return "O número " + numUm + "é par";
        }else{
            return "O número " + numUm + "é impar";
        }
        
    }
}
