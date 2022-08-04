package amazonian;

import java.util.HashMap;
import java.util.Map;

public class Orders {
    private Integer orderId;
    private Integer clientId;
    private boolean urgency = false;
    private HashMap<String,Integer> productsOrdered = new HashMap<String, Integer>();
    private Integer minOrder = 1000;

    public Orders(Integer orderId, Integer clientId) {
        this.orderId = orderId;
        this.clientId = clientId;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public boolean getUrgency() {
        return this.urgency;
    }

    public Integer getMinOrder() {
        return this.minOrder;
    }

    public HashMap<String, Integer> getProducts() {
        return this.productsOrdered;
    }

    public void setUrgency(boolean urgency) {
        this.urgency = urgency;
    }

    public void addProducts(String name, Integer quantity) {
        productsOrdered.put(name, quantity);
    }

    public void calculateTotalOrderPrice(Catalogue catalogue) {
        Double totalToReturn = 0.00;
        // Get the Product Prices from the Catalogue
        HashMap<String,Double> productPrices = catalogue.getProductPricesForOrderTotal();


        // Iterate over the product order and calculate the total prices.
        for (Map.Entry<String, Integer> set : this.productsOrdered.entrySet()) { 
            Double thisissomething = productPrices.get(set.getKey());
            Integer thisisthequantity = set.getValue();

            Double cost = thisissomething * thisisthequantity;

            totalToReturn += cost;
        }

        System.out.println(totalToReturn);

        }

}


