package com.example.demo.repository;

import com.example.demo.model.db.DemoTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DemoRepository extends JpaRepository<DemoTableEntity, Integer> {
}
