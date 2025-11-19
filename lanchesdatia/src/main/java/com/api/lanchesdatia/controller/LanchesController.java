// define as rotas da API, Recebe a requisição (GET, POST, etc.), traduz o que o usuário pediu, e repassa para o service.

package com.api.lanchesdatia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.lanchesdatia.services.LanchesServices;

@RestController
@RequestMapping("/produtos")
public class LanchesController {
    // faz injenção de dependência de forma automatica pra não ter que usar, por exemplo, new ProdutoServices()
    @Autowired
    private LanchesServices lanchesServices;
}
