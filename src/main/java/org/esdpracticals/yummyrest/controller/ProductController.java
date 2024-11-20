package org.esdpracticals.yummyrest.controller;

import lombok.RequiredArgsConstructor;
import org.esdpracticals.yummyrest.dto.ProductRequest;
import org.esdpracticals.yummyrest.dto.ProductResponse;
import org.esdpracticals.yummyrest.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductRequest productRequest) {
        String message = productService.createProduct(productRequest);
        return ResponseEntity.ok(message);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> getProduct(
            @RequestParam(name = "low") Double lowPrice,
            @RequestParam(name = "high") Double highPrice,
            @RequestParam(name = "limit", defaultValue = "10") Integer limit
    ) {
        return ResponseEntity.ok(productService.getAllProducts(lowPrice, highPrice, limit));
    }
}
