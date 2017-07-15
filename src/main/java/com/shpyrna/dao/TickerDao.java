package com.shpyrna.dao;

import com.shpyrna.entity.Ticker;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by Юра on 14.07.2017.
 */
public interface TickerDao extends JpaRepository<Ticker,Integer> {


     Ticker  findFirstByOrderByTickerIdDesc();
}
