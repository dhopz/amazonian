/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package amazonian;

import java.util.ArrayList;

public class App {  
    ArrayList<Clients> clients = new ArrayList<Clients>();  
    ArrayList<Orders> orders = new ArrayList<Orders>();
    ArrayList<Invoices> invoices = new ArrayList<Invoices>();

    public static void main(String[] args) {
        AllCustomers customerList = new AllCustomers();
        Clients NewmanJoe = new Clients("Joe Newman", "London", 1);
        customerList.addClients(NewmanJoe);

        Products fertilizer = new Products(1, "Fertilizer", 20.00, 100.00);
        Products seeds = new Products(2, "Seeds", 5.00, 50.00);

        Catalogue catalogue = new Catalogue();
        catalogue.addProductToCatalogue(fertilizer);
        catalogue.addProductToCatalogue(seeds);  

        Orders order = new Orders(1111, 1, catalogue);
        order.addProducts("Fertilizer", 1);
        order.addProducts("Seeds",3);

        Orders order2 = new Orders(3333, 1, catalogue);
        order2.addProducts("Fertilizer", 1000);
        order2.addProducts("Seeds",5);        

        // Invoices invoice = new Invoices(clientName, clientAddress, orderTotal, listOfItemsAndQuantities);

        NewmanJoe.addOrders(order);
        NewmanJoe.addOrders(order2);

        // trying to add a invoice to the customer
        order.generateInvoice(customerList);
        order2.generateInvoice(customerList);


        // System.out.println(NewmanJoe.getInvoices());
        // System.out.println(NewmanJoe.getOrders());    
        
        for (Invoices invoice: customerList.getInvoices()){
            System.out.printf("Details for Invoice: %d || Paid Status: %s || Amount: %3.2f%n", invoice.getOrderId(),invoice.getPaidStatus(),invoice.getOrderInvoiceTotal());
        
        }

        //catalogue.getProductPricesForOrderTotal();
        // order.calculateTotalOrderPrice(catalogue);

    }
}
