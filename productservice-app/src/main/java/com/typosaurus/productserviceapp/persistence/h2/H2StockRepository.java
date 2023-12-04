package com.typosaurus.productserviceapp.persistence.h2;

import com.typosaurus.productserviceapp.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface H2StockRepository extends JpaRepository<StockEntity, Long> {

    List<StockEntity> getByArticleId(String articleId);

}
