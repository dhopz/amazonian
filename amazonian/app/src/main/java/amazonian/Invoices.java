package amazonian;

public class Invoices {
    private Integer clientId;
    private Integer orderId;
    private boolean paid = true;
    
    public Invoices (Integer clientId, Integer orderId) {
        this.clientId = clientId;
        this.orderId = orderId;
    }
    // Generate total would take in a hashmap and calculate the total

    
}
