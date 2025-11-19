// classe para controlar a lógica de negócio, regras, cálculos, validações, fluxos, tratamento de erros, integração com outras partes
// conversa com o repository e diz o que fazer
package com.api.lanchonetedatia.services;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.api.lanchonetedatia.repository.ProdutoRepository;
import com.api.lanchonetedatia.models.ProdutoModels;

@Service
public class ProdutoServices {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModels> listarTodos(ProdutoModels produtoModels){
        List<ProdutoModels> listaProdutos =  produtoRepository.findAll().stream().filter(produto -> produto.isDisponivel()).toList();
        return listaProdutos;
    }

    public ProdutoModels buscarPorId(Long id){
        Optional<ProdutoModels> buscarProduto = produtoRepository.findById(id);
        return buscarProduto.orElse(null);
    }



}
