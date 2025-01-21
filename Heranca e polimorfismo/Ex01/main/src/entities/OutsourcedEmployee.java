package entities;

public class OutsourcedEmployee extends Employee {
    private Double aditionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double aditionalCharge) {
        super(name, hours, valuePerHour);
        this.aditionalCharge = aditionalCharge;
    }

    @Override
    public Double payment(){
        return super.payment() + aditionalCharge * 1.1;
    }

    public Double getAditionalCharge() {
        return aditionalCharge;
    }

    public void setAditionalCharge(Double aditionalCharge) {
        this.aditionalCharge = aditionalCharge;
    }
}
