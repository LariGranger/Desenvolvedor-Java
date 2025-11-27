// classe que define as operações para trabalhar com banco, delete, dinfBy...
// Jpa já trás muitas coisas pré-prontas

package com.api.lanchesdatia.repository;

import org.springframework.stereotype.Repository;
import com.api.lanchesdatia.models.Lanche;
import org.springframework.data.jpa.repository.JpaRepository;
;

@Repository
public interface LanchesRepository extends JpaRepository<Lanche, Long> {
    Lanche findByCategoria(String categoria);
}
