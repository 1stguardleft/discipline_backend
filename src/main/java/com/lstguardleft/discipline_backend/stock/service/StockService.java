package com.lstguardleft.discipline_backend.stock.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.lstguardleft.discipline_backend.stock.repository.CodeDtlRepository;

@Service
public class StockService {

    @Autowired
    private CodeDtlRepository codeDtlRepository;


}
