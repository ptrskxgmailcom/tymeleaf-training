package pl.psokol.tymeleafhelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.psokol.tymeleafhelloworld.model.Car;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car = new Car("Syrenka", "FSM");

        model.addAttribute("name", "Piotor");
        model.addAttribute("car", car);
        return "car";

    }


}
