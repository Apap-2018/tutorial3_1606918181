package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tutorial3.model.CarModel;

@Service
public class CarInMemoryService implements CarService{
	private List<CarModel> archiveCar;
	
	public CarInMemoryService() {
		archiveCar = new ArrayList<>();
	}
	
	@Override
	public void addCar(CarModel car) {
		archiveCar.add(car);
	}
	
	@Override
	public List<CarModel> getCarList(){
		return archiveCar;
	}

	@Override
	public CarModel getCarDetail(String id) {
		for (CarModel a : archiveCar) {
			if (a.getId().equals(id)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public boolean cekCar(String id) {
		// TODO Auto-generated method stub
		for(int i = 0; i < archiveCar.size(); i++) {
			CarModel checkedCar = archiveCar.get(i);
			if(checkedCar.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void updateAmount(String id, String amount) {
		// TODO Auto-generated method stub
		CarModel checkedCar = getCarDetail(id);
		checkedCar.setAmount(Integer.parseInt(amount));
	}

	@Override
	public void hapus(String id) {
		// TODO Auto-generated method stub
		CarModel checkedCar = getCarDetail(id);
		archiveCar.remove(checkedCar);
	}
}
