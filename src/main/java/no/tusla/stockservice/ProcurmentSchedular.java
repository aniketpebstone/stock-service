package no.tusla.stockservice;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ProcurmentSchedular {
	
//	@Scheduled(cron = "${teno.scheduler.grammar.questions.cron}")
	public void procureStocks()
	{
		
	}

}
