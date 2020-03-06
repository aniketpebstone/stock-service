package no.tusla.stockservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<Stock, Integer> {
	
	Stock findOneByCompanyAndModel(String company,String model);
}
