/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package amazonian;


public class App {
    

    public static void main(String[] args) {
        AllCustomers customerList = new AllCustomers();
        Clients NewmanJoe = new Clients("Joe Newman", "London", 1);
        customerList.addClients(NewmanJoe);

        Products fertilizer = new Products(1, "Fertilizer", 20.00, 100.00);
        Products seeds = new Products(2, "Seeds", 5.00, 50.00);

        Catalogue catalogue = new Catalogue();

        catalogue.addProductToCatalogue(fertilizer);
        catalogue.addProductToCatalogue(seeds);  

        Orders order = new Orders(1111, 1);
        order.addProducts("Fertilizer", 100);
        order.addProducts("Seeds",3);

        Orders order2 = new Orders(3333, 1);
        order.addProducts("Fertilizer", 1000);
        order.addProducts("Seeds",5);

        // Invoices invoice = new Invoices(clientName, clientAddress, orderTotal, listOfItemsAndQuantities);

        NewmanJoe.addOrders(order);
        NewmanJoe.addOrders(order2);

        order.calculateTotalOrderPrice(catalogue);

        // trying to add a invoice to the customer
        order.generateInvoice(customerList,catalogue);
        order2.generateInvoice(customerList,catalogue);

        // System.out.println(NewmanJoe.getInvoices());
        // System.out.println(NewmanJoe.getOrders());    
        
        for (Invoices invoice: NewmanJoe.getInvoices()){
            System.out.println(invoice.getOrderInvoiceTotal());
            System.out.println(invoice.getOrderId());
        
        }

        //catalogue.getProductPricesForOrderTotal();
        // order.calculateTotalOrderPrice(catalogue);

    }
}
