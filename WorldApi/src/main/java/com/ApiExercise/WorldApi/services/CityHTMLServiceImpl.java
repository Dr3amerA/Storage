package com.ApiExercise.WorldApi.services;

import com.ApiExercise.WorldApi.entities.City;
import com.ApiExercise.WorldApi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityHTMLServiceImpl implements CityHTMLService {
    private CityRepository cityRepository;

    @Autowired
    public CityHTMLServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public Iterable<City> getAllCities() {
        Iterable<City> cityList = cityRepository.findAll();

        return cityList;
    }

}