package com.aquariumhabitat.demo.repositories;

import com.aquariumhabitat.demo.models.Water;
import org.springframework.data.repository.CrudRepository;

public interface WaterRepository extends CrudRepository<Water, Long> {
}
