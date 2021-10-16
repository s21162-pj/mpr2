package pl.pjatk.car;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    public List<Car> findAll(){
        List<Car> CarList = new ArrayList<>();
        Car car = new Car("honda", "civic",  "red",  2005, 4);
        CarList.add(car);
        return CarList;
    }
}
