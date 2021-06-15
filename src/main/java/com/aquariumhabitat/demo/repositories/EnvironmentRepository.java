package com.aquariumhabitat.demo.repositories;

import com.aquariumhabitat.demo.models.Environments;
import org.springframework.data.repository.CrudRepository;

public interface EnvironmentRepository extends CrudRepository<Environments, Long> {
}
