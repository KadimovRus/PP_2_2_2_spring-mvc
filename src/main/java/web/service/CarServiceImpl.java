package web.service;

import web.dao.CarDao;
import web.model.Car;

import java.util.List;


public class CarServiceImpl implements CarService{

    private final CarDao carService = new CarDao();

    @Override
    public List<Car> getListCar(int count) {
        return carService.getListCar(count);
    }
}
