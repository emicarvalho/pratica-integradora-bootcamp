package com.emily.pratica05.repository;

import com.emily.pratica05.model.Sinistro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinistroRepo extends JpaRepository<Sinistro, Integer> {
}
