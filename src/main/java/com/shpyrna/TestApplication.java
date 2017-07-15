package com.shpyrna;

import com.shpyrna.entity.Ticker;
import com.shpyrna.service.GetTickerService;
import com.shpyrna.service.TickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class TestApplication implements CommandLineRunner{

	@Autowired
	private GetTickerService getTickerService;
	@Autowired
	@Qualifier("mongo")
	private TickerService tickerService;

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		while (true) {
			try {
				Ticker ticker = getTickerService.getTicker("https://poloniex.com/public?command=returnTicker", "BTC_ETH");
				tickerService.save(ticker);
				System.out.println(tickerService.findLast());
				TimeUnit.SECONDS.sleep(5);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
