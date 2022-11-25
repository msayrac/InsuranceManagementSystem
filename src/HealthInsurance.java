import java.util.Date;

public class HealthInsurance extends Insurance{

    HealthInsurance(User user, String name, double price, Date date) {
        super(user,name, price, date);
    }

    @Override
    public double calculate(double insurancePrice) {

        System.out.println("12 month insurance plan cost is : "+ insurancePrice*12);
        return insurancePrice*12;

    }
}
