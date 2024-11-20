package org.esdpracticals.yummyrest.mapper;

import org.esdpracticals.yummyrest.dto.ProductRequest;
import org.esdpracticals.yummyrest.dto.ProductResponse;
import org.esdpracticals.yummyrest.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public Product requestToEntity(ProductRequest productRequest) {
        return Product.builder()
                .name(productRequest.productName())
                .price(productRequest.price())
                .build();
    }

    public ProductResponse entityToResponse(Product product) {
        return new ProductResponse(product.getName(), product.getPrice());
    }
}
