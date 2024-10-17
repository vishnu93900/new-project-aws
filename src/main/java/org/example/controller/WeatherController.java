package org.example.controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.Model.WeatherData;
import org.example.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/weather"})
public class WeatherController {
    @Autowired
    WeatherService weatherService;

    public WeatherController() {
    }

    @GetMapping({"/{city}"})
    public WeatherData getWeatherInfo(@PathVariable String city) throws JsonProcessingException {
        return this.weatherService.getWeatherAPIData(city);
    }






    @DeleteMapping({"/id"})
    public String deletecitybyId(@PathVariable String city){
        weatherService.deleteById(city);
        return "deleted....";
    }
}



