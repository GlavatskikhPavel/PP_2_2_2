package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    public List<Car> createListCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMV", 2003, 210));
        cars.add(new Car("Honda", 2006, 220));
        cars.add(new Car("Subaru", 2010, 290));
        cars.add(new Car("Mitsubishi.", 2000, 200));
        cars.add(new Car("Mazda", 1998, 190));
        return cars;
    }

    public List<Car> getCars(List<Car> cars, Integer count) {
        return cars.stream().limit(count).toList();
    }
}
