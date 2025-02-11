package com.igorcastelo.dreamshops.service.product;

import com.igorcastelo.dreamshops.model.Product;
import com.igorcastelo.dreamshops.repository.request.AddProductRequest;
import com.igorcastelo.dreamshops.repository.request.ProductUpdaterequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);

    Product getProductbyId(Long id);

    void deleteProduct(Long id);

    Product updateProduct(ProductUpdaterequest productUpdaterequest, Long ProductId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);

}
