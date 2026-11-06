package com.js.weatherReportWebService.Service;

import java.util.List;

import com.js.weatherReportWebService.DTO.Weather;

public interface WeatherService {
	
	
	//save the new weather record (method)
	Weather saveWeather(Weather weather);
	
	//TO retrieve all weather records 
	List<Weather> getAllWeather();
	
	//to retrive one reccord by using weather id
	Weather getWeatherById(int weatherid);
	
	//method to update weather record by existing
	Weather updateWeather(int weatherid, Weather weather);
	
	//method to delete weather record by using id
	Weather deleteWeather(int weatherid);
	
}
