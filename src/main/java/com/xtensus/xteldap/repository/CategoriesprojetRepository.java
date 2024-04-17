package com.xtensus.xteldap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Categoriesprojet;
@Repository
public interface CategoriesprojetRepository extends JpaRepository<Categoriesprojet,Long>{

}
