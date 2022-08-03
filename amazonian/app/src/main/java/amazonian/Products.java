package amazonian;

import java.math.BigDecimal;

public class Products {
    private Integer id;
    private String name;
    private BigDecimal weight;
    private BigDecimal price;

    public Products(
        Integer id,
        String name,
        BigDecimal weight,
        BigDecimal price
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

    public BigDecimal getWeight(){
        return this.weight;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    
}
