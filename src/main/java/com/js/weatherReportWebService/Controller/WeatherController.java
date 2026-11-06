package com.js.weatherReportWebService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.js.weatherReportWebService.DTO.Weather;
import com.js.weatherReportWebService.Service.WeatherService;
@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	@PostMapping
	public Weather saveWeather(@RequestBody  Weather weather) {
		return weatherService.saveWeather(weather);
	}
	
	@GetMapping
	public List<Weather> getAllWeather(){
		return weatherService.getAllWeather();
	}
	
	@PutMapping("/{weatherid}")
	public Weather updateWeather(@PathVariable int weatherid,@RequestBody Weather weather) {
		return weatherService.updateWeather(weatherid, weather);
	}
	
	@DeleteMapping("/{weatherid}")
	public Weather deleteWeather(@PathVariable int weatherid) {
		return weatherService.deleteWeather(weatherid);
	}
	
}
