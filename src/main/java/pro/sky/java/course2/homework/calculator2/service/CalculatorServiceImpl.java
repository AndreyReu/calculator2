package pro.sky.java.course2.homework.calculator2.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int division(int num1, int num2) {
        return num1 / num2;
    }
}
