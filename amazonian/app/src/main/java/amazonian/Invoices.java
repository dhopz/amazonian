package amazonian;

public class Invoices {
    private Integer clientId;
    private Integer orderId;
    private Double total;
    private Double vatTotal;
    private final Double VATRATE = 0.2;
    private boolean paid = true;
    
    public Invoices (Integer clientId, Integer orderId) {
        this.clientId = clientId;
        this.orderId = orderId;
    }
    // Generate total would take in a hashmap and calculate the total

    public void setTotal(Double total) {
        this.vatTotal = total * VATRATE;
        this.total = total;
    }

    public Double getTotal() {
        return this.total;
    }

    public Double getvatTotal() {
        return this.vatTotal;
    }
}
