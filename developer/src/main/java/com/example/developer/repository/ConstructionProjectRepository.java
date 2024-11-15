package com.example.developer.repository;

import com.example.developer.model.ConstructionProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ConstructionProjectRepository extends JpaRepository<ConstructionProject, UUID> {

}
