import java.util.Date;
import java.util.Scanner;

public class TravelInsurance extends Insurance{

    TravelInsurance(User user,String name, double price, Date date) {
        super(user, name, price, date);
    }
    @Override
    public double calculate(double insurancePrice) {
        Scanner input   = new Scanner(System. in);
        System.out.println("Please select travel month : ");
        int month = input.nextInt();
        System.out.println("Travel insurance plan cost is : "+ insurancePrice*month);
        return insurancePrice*month;
    }
}
