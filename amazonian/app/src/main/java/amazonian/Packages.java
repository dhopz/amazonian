package amazonian;

import java.util.HashMap;

public class Packages {
    private Double weight;
    private Integer packageId;
    private HashMap<Integer,Double> pickedProducts = new HashMap<Integer,Double>();

    public Packages(Double weight, Integer packageId){
        this.weight = weight;
        this.packageId = packageId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public HashMap<Integer, Double> getPickedProducts() {
        return pickedProducts;
    }

    public void setPickedProducts(HashMap<Integer, Double> pickedProducts) {
        this.pickedProducts = pickedProducts;
    }

    public void packageItems(){
        //function to maximum weight of package is 50kg, split an order in different packages, as little packages as possible
        //receive a HashMap {["1":1500]["2":500]}
        //how many packages?
        // HashMap<Integer,Double> pickedProducts = new HashMap<Integer,Double>();
        
    }

    

    
    
}
