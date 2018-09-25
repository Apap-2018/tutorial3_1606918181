package com.apap.tutorial3.service;

import java.util.List;

import com.apap.tutorial3.model.CarModel;

public interface CarService {
	void addCar(CarModel car);
	List<CarModel> getCarList();
	CarModel getCarDetail(String id);
	boolean cekCar(String id);
	void updateAmount(String id, String amount);
	void hapus(String id);
}
