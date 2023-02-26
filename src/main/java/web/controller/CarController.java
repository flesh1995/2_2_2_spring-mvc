package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.model.Car;

@Controller
public class CarController {

    private final CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        model.addAttribute("cars", carServiceImpl.carShow(count));
        return "car/cars";
    }
}
