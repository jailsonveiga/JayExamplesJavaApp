package com.jay_nasaipod_version1.repos;

import com.jay_nasaipod_version1.models.Apod;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ApodRepository extends CrudRepository<Apod, Long> {

    Optional<Apod> findByDate (String date);
}
