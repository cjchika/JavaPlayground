package com.cjchika.spring_ecom.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("category")
    private String category;

    @JsonProperty("releaseDate")
    private Date releaseDate;

    @JsonProperty("productAvailable")
    private boolean productAvailable;

    @JsonProperty("stockQuantity")
    private int stockQuantity;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", releaseDate=" + releaseDate +
                ", productAvailable=" + productAvailable +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}
