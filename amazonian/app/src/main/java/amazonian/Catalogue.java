package amazonian;

import java.util.ArrayList;
import java.util.HashMap;

public class Catalogue {
    private ArrayList<Products> allProducts = new ArrayList<Products>();

    public Catalogue(){

    }

    public void addProductToCatalogue(Products product){
        allProducts.add(product);
        System.out.printf("Product %s added \n",product.getName());

    }

    public ArrayList<Products> getProducts(){
        return this.allProducts;

    }

    public HashMap<String,Double> getProductPricesForOrderTotal(){
        
        HashMap<String, Double> productPrices = new HashMap<>();  

        for (Products product : this.allProducts) {
            productPrices.put(product.getName(),product.getPrice());
        }
        System.out.println(productPrices);

        return productPrices;

    }
}
