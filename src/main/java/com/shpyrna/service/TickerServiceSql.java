package com.shpyrna.service;

import com.shpyrna.dao.TickerDao;
import com.shpyrna.entity.Ticker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Юра on 14.07.2017.
 */
@Service
@Transactional
@Qualifier("sql")
public class TickerServiceSql implements TickerService {
    @Autowired
    private TickerDao tickerDao;

    public void save(Ticker ticker){
        tickerDao.save(ticker);

    }
    public Ticker findLast(){
        return tickerDao.findFirstByOrderByTickerIdDesc();
    }


}
