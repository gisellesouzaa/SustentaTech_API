package com.generation.sustentatech.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.generation.sustentatech.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	
	List<Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);

}
