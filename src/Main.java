import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Double> a = sqrt();
        System.out.println(a.apply(16.0));
        System.out.println(a.apply(144.0));
    }

    public static UnaryOperator<Double> sqrt() {
        return Math::sqrt;
    }
}