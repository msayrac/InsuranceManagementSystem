public class CarInsurance extends Insurance{
    @Override
    public double calculate(double insurancePrice) {
        System.out.println("Car insurance plan cost is : "+ insurancePrice*12);
        return insurancePrice*12;
    }
}
