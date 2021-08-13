package com.ankit.microservices.currencyExchangeService.repository;

import com.ankit.microservices.currencyExchangeService.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long>
{
    CurrencyExchange findByFromAndTo(String from, String to);
}
