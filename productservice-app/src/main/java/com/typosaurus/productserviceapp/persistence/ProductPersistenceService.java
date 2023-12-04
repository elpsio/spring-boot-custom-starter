package com.typosaurus.productserviceapp.persistence;

import com.typosaurus.productserviceapp.model.Price;
import com.typosaurus.productserviceapp.model.Stock;

import java.util.List;

public interface ProductPersistenceService {

    Stock getStock(String articleId);

    List<Stock> getStocks();

    Stock saveStock(Stock stock);

    Price getPrice(String articleId);

    List<Price> getPrices();

    Price savePrice(Price price);

}
