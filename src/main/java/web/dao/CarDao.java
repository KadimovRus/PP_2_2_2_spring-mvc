package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "sedan", 123));
        carList.add(new Car("Tesla", "sedan", 234));
        carList.add(new Car("Hyundai", "minivan", 6123));
        carList.add(new Car("Opel", "auto", 60221));
        carList.add(new Car("BMW", "cross", 9900));
    }

    public List<Car> getListCar(int count) {
        if (carList.size() > count) {
            return carList.stream().limit(count).toList();
        }
        return carList;
    }
}
