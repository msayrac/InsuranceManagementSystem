import java.util.Scanner;

public class TravelInsurance extends Insurance{
    @Override
    public double calculate(double insurancePrice) {
        Scanner input   = new Scanner(System. in);
        System.out.println("Please select travel month : ");
        int month = input.nextInt();
        System.out.println("Travel insurance plan cost is : "+ insurancePrice*month);
        return insurancePrice*month;
    }
}
