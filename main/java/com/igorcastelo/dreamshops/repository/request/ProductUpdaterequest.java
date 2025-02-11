package com.igorcastelo.dreamshops.repository.request;

import com.igorcastelo.dreamshops.model.Category;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProductUpdaterequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;

}
