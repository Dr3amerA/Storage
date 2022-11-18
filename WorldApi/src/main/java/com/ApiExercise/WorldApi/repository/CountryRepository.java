package com.ApiExercise.WorldApi.repository;

import com.ApiExercise.WorldApi.entities.City;
import com.ApiExercise.WorldApi.entities.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer>  {
}
