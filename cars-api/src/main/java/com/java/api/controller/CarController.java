package com.java.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.entity.Cars;
import com.java.api.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService carService;
	
	@RequestMapping("/")
	public List<Cars> getAllCar()
	{
		return carService.getAllCar();
	}
	
	@RequestMapping("/{CarType}")
	public Optional<Cars> getCar(@PathVariable String CarType)
	{
		return carService.getCar(CarType);
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/")
	public void addCar(@RequestBody Cars cars)
	{
		carService.addCar(cars);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{CarType}")
	public void updateCar(@RequestBody Cars cars, @PathVariable String CarType)
	{
		carService.updateCar(CarType, cars);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{CarType}")
	public void deleteCar(@PathVariable String CarType)
	{
		carService.deleteCar(CarType);
	}
	
}
