package pl.psokol.tymeleafhelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.psokol.tymeleafhelloworld.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private List<Car> cars;

    public CarController() {
        Car car1 = new Car("Syrenka", "FSM");
        Car car2 = new Car("BMW", "i8");
        Car car3 = new Car("Fiat", "126p");
        Car car4 = new Car("Polonez Caro", "FSM");

        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

    }

    @GetMapping("/car")
    public String getCar(Model model){

        model.addAttribute("name", "Piotor");
        model.addAttribute("cars", cars);
        model.addAttribute("newCar", new Car());
        return "car";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car){
        cars.add(car);
        return "redirect:/car";
    }

}
