package com.shpyrna.dao;

import com.shpyrna.entity.Ticker;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Юра on 15.07.2017.
 */
public interface TickerMongoDao extends MongoRepository<Ticker,Integer> {

    Ticker findFirstByOrderByTickerIdDesc();
}
