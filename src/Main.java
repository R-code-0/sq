import com.sun.jdi.DoubleType;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(16));
    }
    public static double sqrt(double num){
        UnaryOperator<Double> method = Math::sqrt;
        return method.apply(num);
    }
}