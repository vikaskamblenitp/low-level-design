import com.vikas.lld.strategypattern.car.Car;
import com.vikas.lld.strategypattern.car.LuxuryCar;

public class Main {
    public static void main(String[] args) {
        Car myCar = new LuxuryCar();
        myCar.drive();
    }
}