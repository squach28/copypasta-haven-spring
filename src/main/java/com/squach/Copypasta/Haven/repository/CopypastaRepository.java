package com.squach.Copypasta.Haven.repository;

import com.squach.Copypasta.Haven.model.Copypasta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CopypastaRepository extends JpaRepository<Copypasta, Long> {
}
