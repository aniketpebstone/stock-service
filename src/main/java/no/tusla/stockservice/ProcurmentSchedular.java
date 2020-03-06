package no.tusla.stockservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ProcurmentSchedular {
	
	@Autowired
	StockRepo repo;
	
	@Scheduled(cron = "1 * * * * *")
	public void procureStocks()
	{
		log.info("---------------- All pending stocks -------------------");
		List<Stock> stocks=repo.findAll();
		for(Stock stock:stocks)
		{
			log.info(stock.toString());	
		}
	}

}
