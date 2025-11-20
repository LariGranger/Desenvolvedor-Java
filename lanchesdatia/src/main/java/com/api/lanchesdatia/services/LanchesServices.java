// classe para controlar a lógica de negócio, regras, cálculos, validações, fluxos, tratamento de erros, integração com outras partes
// conversa com o repository e diz o que fazer
package com.api.lanchesdatia.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.lanchesdatia.repository.LanchesRepository;
import jakarta.persistence.Column;
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

    public Lanche atualizarLanche(Long id, String nome, String descricao, double preco, String categoria, boolean disponivel, int tempoPreparo, Lanche lancheAtualizado){
        if(lancheExiste.isPresent()){
            Lanche lanche = lancheExiste.get();
            lanche.setNome(lancheAtualizado.getNome());
            lanche.setDescricao(lancheAtualizado.getDescricao());
            lanche.setPreco(lancheAtualizado.getPreco());
            lanche.setCategoria(lancheAtualizado.getCategoria());
            lanche.setDisponivel(lancheAtualizado.getNome());
            lanche.setNome(lancheAtualizado.getNome());

        }
    }



/*Endpoints Esperados:
2. Buscar um produto específico - Retorna detalhes de um produto pelo ID


5. Atualizar produto - Modifica informações de um produto existente
6. Deletar produto - Remove um produto do cardápio */
}
