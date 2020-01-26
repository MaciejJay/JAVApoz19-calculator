package pl.sda.spring.operation;

import org.springframework.stereotype.Component;
import pl.sda.spring.exception.DivideByZeroException;

@Component
public class DivisionOperation implements Operation {
    @Override
    public double calculate(double arg1, double arg2) throws DivideByZeroException {
        if (arg2 != 0) {
            return arg1 / arg2;
        } else {
            throw new DivideByZeroException("You cannot divide by zero.");
        }
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DIVISION;
    }
}
