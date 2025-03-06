package entities;

public class Invoice {
    private Double basicPayment;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double tax, Double basicPayment) {
        this.tax = tax;
        this.basicPayment = basicPayment;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment() {
        return getBasicPayment() - getTax();
    }
}
