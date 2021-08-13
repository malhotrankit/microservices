package com.ankit.microservices.currencyExchangeService.controller;

import com.ankit.microservices.currencyExchangeService.model.CurrencyExchange;
import com.ankit.microservices.currencyExchangeService.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController
{
    @Autowired
    private CurrencyExchangeRepository repository;
    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to)
    {
        //CurrencyExchange currencyExchange = new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
        CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
        String port = environment.getProperty("local-server-port");
        if(currencyExchange==null)
        {
            throw new RuntimeException("Unable to Find data for" + from + "to" + to);
        }
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }
}
