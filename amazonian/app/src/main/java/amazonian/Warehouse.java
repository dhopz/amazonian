package amazonian;

import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse {
    private String location;
    private Database database;
    private ArrayList<Orders> allOrders = new ArrayList<Orders>();
    
    
    
    public Warehouse(String location, Database database){
        this.location = location;
        this.database = database;

        // for (int i=0; i<3; ++i)
        // this.allOrders.add("ho");
        // System.out.println(allOrders);
        // System.out.println(allOrders);
        for (Clients client: this.database.getClients()){
            ArrayList<Orders> orders = client.getOrders();
            for (Orders order: orders){
                // System.out.println(order);
                this.allOrders.add(order);
            };
            //{packaged=false, Fertilizer=2, Seeds=5, clientId=1, orderId=1, urgency=false}
        }

    }

    public String getLocation(){
        return this.location;
    }

    public void getDatabase(){
        System.out.println(this.database);
    }

    public void getAllOrders(){
        //from the database, get all clients arraylist of orders and combine into 1

        for (Clients client: this.database.getClients()){
            ArrayList<Orders> orders = client.getOrders();
            for (Orders order: orders){
                System.out.println(order);
                // allOrders.add(order);
            };
            //{packaged=false, Fertilizer=2, Seeds=5, clientId=1, orderId=1, urgency=false}
        }
        System.out.println(allOrders);
    
    }

    public ArrayList<Orders> getDataOrders(){
        return this.allOrders;
    }

    public ArrayList<Orders> getDatabaseOrders(){
        // System.out.println(this.allOrders);
        return this.allOrders;
    }


    
}


