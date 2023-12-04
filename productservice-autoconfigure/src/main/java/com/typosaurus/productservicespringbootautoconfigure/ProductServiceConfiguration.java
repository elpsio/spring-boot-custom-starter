package com.typosaurus.productservicespringbootautoconfigure;

import com.typosaurus.productserviceapp.ProductServiceAppConfiguration;
import com.typosaurus.productserviceapp.persistence.ProductPersistenceService;
import com.typosaurus.productserviceapp.persistence.h2.H2PriceRepository;
import com.typosaurus.productserviceapp.persistence.h2.H2ProductPersistenceService;
import com.typosaurus.productserviceapp.persistence.h2.H2StockRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(ProductServiceAppConfiguration.class)
public class ProductServiceConfiguration {

    @Bean
    @ConditionalOnMissingBean(ProductPersistenceService.class)
    public ProductPersistenceService productPersistenceService(H2PriceRepository h2PriceRepository, H2StockRepository h2StockRepository) {
        return new H2ProductPersistenceService(h2PriceRepository, h2StockRepository);
    }

}
