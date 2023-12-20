package com.lstguardleft.discipline_backend.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lstguardleft.discipline_backend.stock.service.StockService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value="/api/v1/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @RequestMapping(value="/{code}", method=RequestMethod.GET)
    public String getStockInfo(@PathVariable("code") String code) throws Exception {
        log.info("CODE : {}", code);
        return code;
    }
    
}
