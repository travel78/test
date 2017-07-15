package com.shpyrna.controller;

import com.shpyrna.entity.Ticker;
import com.shpyrna.service.TickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Юра on 15.07.2017.
 */
@RestController
public class MyRestController {

    @Autowired
    @Qualifier("mongo")
    private TickerService tickerService;

    @GetMapping("/refresh")
    public Ticker refresh(){

        return tickerService.findLast();
    }
}
