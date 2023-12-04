package com.typosaurus.productserviceapp.mapper;

import com.typosaurus.productserviceapp.entity.PriceEntity;
import com.typosaurus.productserviceapp.entity.StockEntity;
import com.typosaurus.productserviceapp.model.Price;
import com.typosaurus.productserviceapp.model.Stock;

public class Mapper {

    public static StockEntity toStockEntity(Stock stock) {
        StockEntity stockEntity = new StockEntity();
        stockEntity.setStock(stock.getStock());
        stockEntity.setArticleId(stock.getArticleId());
        return stockEntity;
    }

    public static Stock toStock(StockEntity stockEntity) {
        Stock stock = new Stock();
        stock.setStock(stockEntity.getStock());
        stock.setArticleId(stockEntity.getArticleId());
        return stock;
    }

    public static PriceEntity toPriceEntity(Price price) {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setArticleId(price.getArticleId());
        priceEntity.setAmount(price.getAmount());
        priceEntity.setCurrency(priceEntity.getCurrency());
        return priceEntity;
    }

    public static Price toPrice(PriceEntity priceEntity) {
        Price price = new Price();
        price.setArticleId(priceEntity.getArticleId());
        price.setAmount(priceEntity.getAmount());
        price.setCurrency(priceEntity.getCurrency());
        return price;
    }
}
