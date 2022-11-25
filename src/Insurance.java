import java.util.Date;

public abstract class Insurance {

    private String insuranceName;
    private double insurancePrice;
    private Date insuranceDate;

    public Insurance(String insuranceName, double insurancePrice, Date insuranceDate) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceDate = insuranceDate;
    }

    public Insurance() {
    }

    public abstract double calculate(double insurancePrice);


    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(Date insuranceDate) {
        this.insuranceDate = insuranceDate;
    }
}
