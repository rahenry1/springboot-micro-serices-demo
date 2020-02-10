package com.rahenry1.microservices.currency.exchange;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	
	ExchangeValue findByFromAndTo(String from, String to);

}