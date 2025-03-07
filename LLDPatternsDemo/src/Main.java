import com.vikas.lld.strategyPattern.car.Car;
import com.vikas.lld.strategyPattern.car.LuxuryCar;

public class Main {
    public static void main(String[] args) {
        Car myCar = new LuxuryCar();
        myCar.drive();
    }
}