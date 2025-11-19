package com.api.lanchesdatia.repository;

import org.springframework.stereotype.Repository;

import com.api.lanchesdatia.models.Lanch;
import org.springframework.data.jpa.repository.JpaRepository;;

@Repository
public interface LanchesRepository extends JpaRepository<Lanch, Long> {

}
