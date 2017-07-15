package com.shpyrna.service;

import com.shpyrna.entity.Ticker;

/**
 * Created by Юра on 15.07.2017.
 */
public interface TickerService {

    void save(Ticker ticker);

    Ticker findLast();
}
