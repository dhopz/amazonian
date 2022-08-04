package amazonian;

import java.util.HashMap;

public class Orders {
    private Integer orderId;
    private Integer clientId;
    private boolean urgency = false;
    private HashMap<Integer,Integer> productsOrdered = new HashMap<Integer, Integer>();
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

    public HashMap<Integer, Integer> getProducts() {
        return this.products;
    }

    public void setUrgency(boolean urgency) {
        this.urgency = urgency;
    }

    public void addProducts(Integer quantity, Integer productId) {
        products.put(productId, quantity);
    }

    public double calculateTotalOrderPrice(Catalogue catalogue) {
        Double totalToReturn = 0.00;
        HashMap<String,Double> productPrices = catalogue.getProductPricesForOrderTotal();
        for (HashMap.Entry<String,Double> entry:  ) {
            System.out.println(product.getName());
        }
    }

}

Map<String, String> map = ...
for (Map.Entry<String, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + "/" + entry.getValue());
}

