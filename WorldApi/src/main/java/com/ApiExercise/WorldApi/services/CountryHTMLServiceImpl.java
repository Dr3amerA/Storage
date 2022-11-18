package com.ApiExercise.WorldApi.services;

import com.ApiExercise.WorldApi.entities.City;
import com.ApiExercise.WorldApi.entities.Country;
import com.ApiExercise.WorldApi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryHTMLServiceImpl implements CountryHTMLService {
    private CountryRepository countryRepository;

    @Autowired
    public CountryHTMLServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Iterable<Country> getAllCountries() {
        Iterable<Country> countryList = countryRepository.findAll();
        return countryList;
    }
}
