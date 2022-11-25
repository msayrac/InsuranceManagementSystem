public class ResidenceInsurance extends Insurance{
    @Override
    public double calculate(double insurancePrice) {
        System.out.println("24 month insurance plan cost is : "+ insurancePrice*24);
        return insurancePrice*24;
    }
}
