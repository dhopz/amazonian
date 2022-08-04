package amazonian;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Orders {
    private Integer orderId;
    private Integer clientId;
    private boolean urgency = false;
    private HashMap<String,Integer> productsOrdered = new HashMap<String, Integer>();
    private Double minOrder = 1000.00;
    // private Invoices invoice = new Invoices(clientId, orderId,);

    public Orders(Integer orderId, Integer clientId) {
        this.orderId = orderId;
        this.clientId = clientId;
    }

    // public Invoices getInvoice(){
    //     return this.invoice;
    // }

    public Integer getOrderId() {
        return this.orderId;
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public boolean getUrgency() {
        return this.urgency;
    }

    public Double getMinOrder() {
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

    public Double calculateTotalOrderPrice(Catalogue catalogue) {
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
       
        orderValidConfirmation(totalToReturn);

        System.out.println(totalToReturn);
        return totalToReturn;
    }

    public void generateInvoice(AllCustomers customers, Catalogue catalogue){
        Double orderValueTotal = calculateTotalOrderPrice(catalogue);
        Invoices invoice = new Invoices(this.clientId, this.orderId, orderValueTotal); //and the total amount  for vat creation.
        System.out.printf("this the the invoice %d \n",invoice.getOrderId());

        // find the customer in the customers arraylist using the clientId
        ArrayList<Clients> theseAreMyClients = customers.getClients();       
        System.out.println(customers.getClients());

        // System.out.println(theseAreMyClients.indexOf(client.clientId));
        // add the invoice to the customers Invoices arraylist
        for(Clients client: theseAreMyClients){
            System.out.println(client.getName());
            client.addInvoices(invoice);
        }
    }

    private Boolean checkMinimumOrderValue(Double total) {
        return total >= minOrder;
    }

    private void orderValidConfirmation(Double totalToReturn) {
        if (checkMinimumOrderValue(totalToReturn)) {
            System.out.println(totalToReturn);
        } else {
            System.out.println("The minimum total value for an order is 1000.00. Please add some more items to your order");
        }
    }

       

}


