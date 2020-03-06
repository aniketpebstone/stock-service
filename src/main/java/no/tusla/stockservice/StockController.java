package no.tusla.stockservice;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "stock")
public class StockController {
	
	@Autowired
	StockService service;
	
	@PostMapping()
	public ResponseEntity<?> placeStockOrderForMobile(@Valid @RequestBody MobileStockDto dto){

		log.info("~ In placeStockOrderForMobile ~");
		log.info("MobileStockDto:{}",dto);
		service.placeStockOrder(dto);
		return ResponseEntity.accepted().build();
		
	}

}
