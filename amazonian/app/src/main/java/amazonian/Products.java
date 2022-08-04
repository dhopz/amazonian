package amazonian;

// import java.math.BigDecimal;

public class Products {
    private Integer id;
    private String name;
    private Double weight;
    private Double price;

    public Products(
        Integer id,
        String name,
        Double weight,
        Double price
    ){
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.price = price;        
    }

    public String getName(){
        return this.name;
    }

    public Integer getId(){
        return this.id;
    }

    public Double getWeight(){
        return this.weight;
    }

    public Double getPrice(){
        return this.price;
    }

    
}
