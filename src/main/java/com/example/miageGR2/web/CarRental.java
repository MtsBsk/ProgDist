package com.example.miageGR2.web;

import com.example.miageGR2.data.Car;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class CarRental {

    List<Car> cars = new ArrayList<Car>();

    public CarRental() {
        cars.add(new Car("11AA22", 1000));
        cars.add(new Car("33CCDD", 3000));
        cars.add(new Car("22BB33", 2000));
        cars.add(new Car("33CC44", 4000));
    }

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> listOfCars(){
        return cars;
    }
}
