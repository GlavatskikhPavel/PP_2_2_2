package web.service;

import web.model.Car;
import java.util.List;

public interface ICarService {

    public List<Car> createListCar();

    public List<Car> getCars(List<Car> cars, Integer count);
}
