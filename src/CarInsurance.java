import java.util.Date;

public class CarInsurance extends Insurance{

    CarInsurance(User user,String name, double price, Date date) {
        super(user, name, price, date);
    }


    @Override
    public double calculate(double insurancePrice) {
        System.out.println("Car insurance plan cost is : "+ insurancePrice*12);
        return insurancePrice*12;
    }
}
