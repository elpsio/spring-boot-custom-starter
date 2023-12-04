package com.typosaurus.productserviceapp;

import com.typosaurus.productserviceapp.model.Price;
import com.typosaurus.productserviceapp.model.Stock;
import com.typosaurus.productserviceapp.persistence.ProductPersistenceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductServiceController {

    private final ProductPersistenceService productPersistenceService;

    public ProductServiceController(ProductPersistenceService productPersistenceService) {
        this.productPersistenceService = productPersistenceService;
    }

    @GetMapping("/stocks")
    public List<Stock> getStocks() {
        return productPersistenceService.getStocks();
    }

    @GetMapping("/stocks/{articleId}")
    public Stock getStock(@PathVariable String articleId) {
        return productPersistenceService.getStock(articleId);
    }

    @PostMapping("/stocks/add")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addStock(@RequestBody Stock stock) {
        productPersistenceService.saveStock(stock);
    }

    @GetMapping("/prices")
    public List<Price> getPrices() {
        return productPersistenceService.getPrices();
    }

    @GetMapping("/prices/{articleId}")
    public Price getPrice(@PathVariable String articleId) {
        return productPersistenceService.getPrice(articleId);
    }

    @PostMapping("/prices/add")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addPrice(@RequestBody Price price) {
        productPersistenceService.savePrice(price);
    }

}
