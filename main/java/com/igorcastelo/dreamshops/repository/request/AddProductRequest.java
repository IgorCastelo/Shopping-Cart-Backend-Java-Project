package com.igorcastelo.dreamshops.repository.request;

import com.igorcastelo.dreamshops.model.Category;
import com.igorcastelo.dreamshops.model.Image;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;



}
