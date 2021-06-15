package com.aquariumhabitat.demo.repositories;

import com.aquariumhabitat.demo.models.Fish;
import org.springframework.data.repository.CrudRepository;

public interface FishRepository extends CrudRepository<Fish, Long> {
}
