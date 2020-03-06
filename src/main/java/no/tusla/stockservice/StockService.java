package no.tusla.stockservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StockService {

	@Autowired
	StockRepo repo;
	public void placeStockOrder(MobileStockDto dto) {
		log.info("~ In placeStockOrder ~");		
		Stock stock=repo.findOneByCompanyAndModel(dto.getCompany(), dto.getModel());
		if(stock==null)
		{
			stock=new Stock();
			stock.setCompany(dto.getCompany());
			stock.setModel(dto.getModel());
			stock.setQuantity(dto.getQuantity());
		}
		else
		{
			stock.setQuantity(dto.getQuantity()+stock.getQuantity());		
		}
		repo.save(stock);
		log.info("Stock saved successfully!");	
	}

	
}
