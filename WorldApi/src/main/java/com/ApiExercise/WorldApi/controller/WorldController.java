package com.ApiExercise.WorldApi.controller;

import com.ApiExercise.WorldApi.entities.City;
import com.ApiExercise.WorldApi.entities.Country;
import com.ApiExercise.WorldApi.services.CityHTMLService;
import com.ApiExercise.WorldApi.services.CountryHTMLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

    private CityHTMLService cityHTMLService;
    private CountryHTMLService countryHTMLService;

    @Autowired
    public WorldController(CityHTMLService cityHTMLService, CountryHTMLService countryHTMLService) {
        this.cityHTMLService = cityHTMLService;
        this.countryHTMLService = countryHTMLService;
    }

    @GetMapping("/api/cities")
    public Iterable<City> allCities(){
    return         cityHTMLService.getAllCities();
    }

    @GetMapping("/api/countries")
    public Iterable<Country> allCountries(){
        return         countryHTMLService.getAllCountries();
    }
}
