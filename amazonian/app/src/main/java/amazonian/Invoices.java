package amazonian;

public class Invoices {
    private Integer clientId;
    private Integer orderId;
    private Double orderTotal;
    private Boolean paid = true;

    public Invoices (Integer clientId, Integer orderId, Double orderTotal) {
        this.clientId = clientId;
        this.orderId = orderId;
        this.orderTotal = orderTotal;
    }

    public Integer getClientId(){
        return this.clientId;
    }

    public Boolean getPaidStatus(){
        return this.paid;
    }
    // Generate total would take in a hashmap and calculate the total
    public Integer getOrderId(){
        return this.orderId;
    }

    public Double getOrderInvoiceTotal(){
        // System.out.println(this.orderTotal * 1.2);
        return this.orderTotal * 1.2;
    }




}
