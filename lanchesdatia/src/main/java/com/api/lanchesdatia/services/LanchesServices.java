// classe para controlar a lógica de negócio, regras, cálculos, validações, fluxos, tratamento de erros, integração com outras partes
// conversa com o repository e diz o que fazer
package com.api.lanchesdatia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.lanchesdatia.repository.LanchesRepository;
import com.api.lanchesdatia.models.Lanche;


@Service
public class LanchesServices {
    @Autowired
    private LanchesRepository lancheRepository;

    public List<Lanche> listarTodos(){
        return lancheRepository.findAll();
    }

    public Lanche buscarPorId(Long id){
        Optional<Lanche> lanche = lancheRepository.findById(id);
        return lanche.orElse(null);
    }
    public List<Lanche> buscarPorCategoria(String categoria){
        Optional<Lanche> lanchesPorCategoria = lancheRepository.findByCategoria(categoria);
        return lanchesPorCategoria.orElse(null);
    }

    public Lanche adicionarLanche(Lanche lanche){
        return lancheRepository.save(lanche);
    }

    


/*Endpoints Esperados:
1. Listar todos os produtos - Retorna todo o cardápio
2. Buscar um produto específico - Retorna detalhes de um produto pelo ID
3. Buscar produtos por categoria - Filtra produtos de uma categoria
4. Adicionar novo produto - Insere um novo lanche ao cardápio
5. Atualizar produto - Modifica informações de um produto existente
6. Deletar produto - Remove um produto do cardápio */
}
