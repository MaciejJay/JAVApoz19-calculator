package pl.sda.spring.operation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import pl.sda.spring.exception.DivideByZeroException;

@Component
public class DivisionOperation implements Operation {

    private final String errMessage;

    public DivisionOperation(String errMessage) {
        this.errMessage = errMessage;
    }

    @Override
    public double calculate(double arg1, double arg2) throws DivideByZeroException {
        if (arg2 != 0) {
            return arg1 / arg2;
        } else {
            throw new DivideByZeroException(errMessage);
        }
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DIVISION;
    }
}
