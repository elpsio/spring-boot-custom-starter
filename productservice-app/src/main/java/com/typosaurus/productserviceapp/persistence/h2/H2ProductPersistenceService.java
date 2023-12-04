package com.typosaurus.productserviceapp.persistence.h2;

import com.typosaurus.productserviceapp.mapper.Mapper;
import com.typosaurus.productserviceapp.model.Price;
import com.typosaurus.productserviceapp.model.Stock;
import com.typosaurus.productserviceapp.persistence.ProductPersistenceService;

import java.util.List;
import java.util.stream.Collectors;

public class H2ProductPersistenceService implements ProductPersistenceService {

    private final H2PriceRepository h2PriceRepository;
    private final H2StockRepository h2StockRepository;

    public H2ProductPersistenceService(H2PriceRepository h2PriceRepository, H2StockRepository h2StockRepository) {
        this.h2PriceRepository = h2PriceRepository;
        this.h2StockRepository = h2StockRepository;
    }


    @Override
    public Stock getStock(String articleId) {
        return Mapper.toStock(h2StockRepository.getByArticleId(articleId).get(0));
    }

    @Override
    public List<Stock> getStocks() {
        return h2StockRepository.findAll().stream()
                .map(Mapper::toStock)
                .collect(Collectors.toList());
    }

    @Override
    public Stock saveStock(Stock stock) {
        return Mapper.toStock(h2StockRepository.save(Mapper.toStockEntity(stock)));
    }

    @Override
    public Price getPrice(String articleId) {
        return Mapper.toPrice(h2PriceRepository.getByArticleId(articleId).get(0));
    }

    @Override
    public List<Price> getPrices() {
        return h2PriceRepository.findAll().stream()
                .map(Mapper::toPrice)
                .collect(Collectors.toList());
    }

    @Override
    public Price savePrice(Price price) {
        return Mapper.toPrice(h2PriceRepository.save(Mapper.toPriceEntity(price)));
    }
}
