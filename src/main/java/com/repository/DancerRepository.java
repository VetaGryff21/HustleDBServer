package com.repository;

import com.model.Dancer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DancerRepository extends JpaRepository<Dancer, Integer> {
    public Optional<Dancer> getDancerByCode(Integer code);
    public List<Dancer> findByFullnameContaining(String name);
}
