package amazonian;

import java.util.ArrayList;

public class AllCustomers {
    private ArrayList<Clients> allClients = new ArrayList<Clients>();

    public AllCustomers(){

    }

    public void addClients(Clients client){
        allClients.add(client);
        System.out.printf("Client %s added \n",client.getName());

    }

    public ArrayList<Clients> getClients(){
        return this.allClients;

    }


}
