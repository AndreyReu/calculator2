package pro.sky.java.course2.homework.calculator2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework.calculator2.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }
    @GetMapping
    public String printGreetings() {
        return "Добро пожаловать";
    }

    @GetMapping("/plus")
    public String sumNumbers(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + service.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String minusNumbers(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + service.substraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplyNumbers(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + service.multiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String divideNumbers(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Деление на ноль невозможно";
        }
        return num1 + " / " + num2 + " = " + service.division(num1, num2);
    }
}
