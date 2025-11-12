package com.api.lanchesdatia.repository;

import org.springframework.stereotype.Repository;

import com.api.lanchesdatia.models.LanchesModels;

@Repository
public class LanchesRepository extends JpaRepository<LanchesModels, Interger> {

}
