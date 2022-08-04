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
        HashMap<String,Double> productPrices = catalogue.getProductPricesForOrderTotal();

        for (Map.Entry<String, Integer> set : this.productsOrdered.entrySet()) { 
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
            Double thisissomething = productPrices.get(set.getKey());
            Integer thisisthequantity = set.getValue();

            Double cost = thisissomething * thisisthequantity;

            totalToReturn += cost;
         
            // System.out.printf("This is the price %s this is the quantity %s \n",thisissomething, thisisthequantity);
            // System.out.printf("This is the cost %s \n",cost);
        }

        System.out.println(totalToReturn);

        // for (Map.Entry<String, Double> set : productPrices.entrySet()) { 
        //     // Printing all elements of a Map
        //     System.out.println(set.getKey() + " = " + set.getValue());
        // }
    }

}


