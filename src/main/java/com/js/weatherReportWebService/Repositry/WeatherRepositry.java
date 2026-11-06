package com.js.weatherReportWebService.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.js.weatherReportWebService.DTO.Weather;

public interface WeatherRepositry extends JpaRepository<Weather, Integer>{

	
}
