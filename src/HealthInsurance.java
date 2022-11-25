public class HealthInsurance extends Insurance{


    @Override
    public double calculate(double insurancePrice) {

        System.out.println("12 month insurance plan cost is : "+ insurancePrice*12);
        return insurancePrice*12;

    }
}
