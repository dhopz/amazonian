package amazonian;

import java.util.ArrayList;
import java.util.Map;


public class Warehouse {
    private String location;
    private Database database;
    private ArrayList<Orders> allOrders = new ArrayList<Orders>();
    
    
    
    public Warehouse(String location, Database database){
        this.location = location;
        this.database = database;
    }

    public String getLocation(){
        return this.location;
    }

    public void getDatabase(){
        System.out.println(this.database);
    }

    private ArrayList<Orders> getAllOrders(){
        //from the database, get all clients arraylist of orders and combine into 1

        for (Clients client: this.database.getClients()){
            ArrayList<Orders> orders = client.getOrders();
            for (Orders order: orders){
                this.allOrders.add(order);
            };
            //{packaged=false, Fertilizer=2, Seeds=5, clientId=1, orderId=1, urgency=false}
        }
        System.out.println(this.allOrders);

        return this.allOrders;    
    }

    private ArrayList<Orders> ordersToBeDelivered(){
        ArrayList<Orders> ordersForDelivery = new ArrayList<Orders>();
        for (Orders order: getAllOrders()){
            if (order.getDispatched()==false){
                ordersForDelivery.add(order);
            }
        }
        return ordersForDelivery;
    }

    private Double totalWeightofOrder(Orders order) {
        Integer totalPackages = 0;

        for(Map.Entry<String,Integer> map : order.getProductsOrdered().entrySet()){
            totalPackages += map.getValue();
        }
        return totalPackages * 50.0;
    }

    // private Array

    // public ArrayList<Orders> getDataOrders(){
    //     return this.allOrders;
    // }

    // public ArrayList<Orders> getDatabaseOrders(){
    //     // System.out.println(this.allOrders);
    //     return this.allOrders;
    // }


    
}


