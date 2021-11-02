package pl.psokol.tymeleafhelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.psokol.tymeleafhelloworld.model.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car1 = new Car("Syrenka", "FSM");
        Car car2 = new Car("BMW", "i8");
        Car car3 = new Car("Fiat", "126p");
        Car car4 = new Car("Polonez Caro", "FSM");

        List<Car> cars = Arrays.asList(car1, car2, car3, car4);

        model.addAttribute("name", "Piotor");
        model.addAttribute("cars", cars);
        return "car";

    }


}
