// define as rotas da API, Recebe a requisição (GET, POST, etc.), traduz o que o usuário pediu, e repassa para o service.
package com.api.lanchonetedatia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.lanchonetedatia.services.ProdutoServices;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    // faz injenção de dependência de forma automatica pra não ter que usar, por exemplo, new ProdutoServices()
    @Autowired
    private ProdutoServices produtoServices;

}
