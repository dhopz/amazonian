package amazonian;

import java.util.ArrayList;

public class AllCustomers {
    private ArrayList<Clients> allClients = new ArrayList<Clients>();
    private ArrayList<Invoices> allInvoices = new ArrayList<Invoices>();


    public AllCustomers(){

    }

    public void addClients(Clients client){
        allClients.add(client);
        System.out.printf("Client %s added \n",client.getName());

    }

    public void addInvoices(Invoices invoice){
        allInvoices.add(invoice);
        System.out.printf("Invoice added for Client:%s for Order:%s\n",invoice.getClientId(), invoice.getOrderId());

    }

    public ArrayList<Clients> getClients(){
        return this.allClients;
    }

    public ArrayList<Invoices> getInvoices(){
        return this.allInvoices;
    }


}
