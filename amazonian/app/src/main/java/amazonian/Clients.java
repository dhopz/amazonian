package amazonian;

import java.util.ArrayList;

public class Clients {
    private String name;
    private String address;
    private ArrayList<Orders> orders = new ArrayList<Orders>();
    private Integer clientId;
    private boolean cashInAdvance = true;
    final Integer minOrder = 1000;

    public Clients(String name, String address, Integer clientId) {
        this.name = name;
        this.address = address;
        this.clientId = clientId;
        
    }

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public ArrayList<Orders> getOrders() {
        return this.orders;
    }

    private boolean isOrderValid(Orders order) {
        // return order.Value() >=10000;
        return true;
    }

    public void addOrders(Orders order) {
        if (isOrderValid(order)) {
            this.orders.add(order);
        } else {
            System.out.print("The order does not meet the minimum payment requirement.");
        }
        
    }
    
}
