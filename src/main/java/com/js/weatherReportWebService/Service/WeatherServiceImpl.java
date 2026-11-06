package com.js.weatherReportWebService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.weatherReportWebService.DTO.Weather;
import com.js.weatherReportWebService.Repositry.WeatherRepositry;
import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private WeatherRepositry weatherRepository;
	
	@Override
	public Weather saveWeather(Weather weather) {
		return weatherRepository.save(weather);
	}
	
	@Override
	public List<Weather> getAllWeather(){
		return weatherRepository.findAll();
	}
	
	@Override
	public Weather getWeatherById(int weatherid) {
		return weatherRepository.findById(weatherid).orElse(null);
	}
	@Override
	public Weather updateWeather(int weatherid, Weather weather) {
		Weather existingWeather = weatherRepository.findById(weatherid).orElse(null);
		
		if(existingWeather != null) {
			existingWeather.setCity(weather.getCity());
			existingWeather.setTemperature(weather.getTemperature());
			existingWeather.setDateofreport(weather.getDateofreport());
			return weatherRepository.save(existingWeather);
		}
		return null;
	}
	
	@Override
	public Weather deleteWeather(int weatherid) {
		Weather existingWeather = weatherRepository.findById(weatherid).orElse(null);
		
		if(existingWeather!= null) {
			weatherRepository.deleteById(weatherid);
		}
		return existingWeather;
	}
	
	
}
