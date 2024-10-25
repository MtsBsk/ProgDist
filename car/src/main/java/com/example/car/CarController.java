package com.example.car;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class CarController {

    
    private List<Car> cars = new ArrayList<>();

    
    public CarController() {
        cars.add(new Car("AA-111-AA", "Peugeot", 10000, true, null));
        cars.add(new Car("BB-222-BB", "Renault", 12000, false, null));
    }

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> listOfCars(){
        return cars;
    }

    @GetMapping("/cars/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumber)) {
                return car;
            }
        }
        throw new Exception("Voiture non trouvée");
    }

    @PutMapping(value = "/voiture/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    public void rentOrGetBack(
    @PathVariable("plateNumber") String plateNumber,
    @RequestParam(value="rent", required = true)boolean rent) throws Exception{
        Car car = aCar(plateNumber);
        if (rent) {
            car.setRented(true);
        } else {
            car.setRented(false);
        }
    }

    @PutMapping(value = "/cars/{plateNumber}")
    public void rent(
    @PathVariable("plateNumber") String plateNumber,
    @RequestParam(value="rent", required = true)boolean rent,
    @RequestBody rentedDate dates) throws Exception{
        Car car = aCar(plateNumber);
        if (rent) {
            car.setRented(false);
            car.setDates(dates);
        } else {
            throw new Exception("Impossible de restituer une voiture avec des dates spécifiques");
        }
    }

    @PostMapping(value = "/loc")
    public void loc(@RequestBody rentedDate dates) {
        System.out.println(dates);
    }
    
}
