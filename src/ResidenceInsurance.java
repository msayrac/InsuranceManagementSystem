import java.util.Date;

public class ResidenceInsurance extends Insurance{

    ResidenceInsurance(User user,String name, double price, Date date) {
        super(user, name, price, date);
    }
    @Override
    public double calculate(double insurancePrice) {
        System.out.println("24 month insurance plan cost is : "+ insurancePrice*24);
        return insurancePrice*24;
    }
}
