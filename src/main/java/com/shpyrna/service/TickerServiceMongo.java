package com.shpyrna.service;

import com.shpyrna.dao.TickerMongoDao;
import com.shpyrna.entity.Ticker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Юра on 15.07.2017.
 */
@Service
@Qualifier("mongo")
public class TickerServiceMongo implements TickerService {
    @Autowired
    private TickerMongoDao tickerMongoDao;
    @Override
    public void save(Ticker ticker) {
        tickerMongoDao.save(ticker);
    }

    @Override
    public Ticker findLast() {
        return tickerMongoDao.findFirstByOrderByTickerIdDesc();
    }
}
