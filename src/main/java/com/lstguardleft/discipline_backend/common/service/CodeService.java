package com.lstguardleft.discipline_backend.common.service;

import java.util.ArrayList;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import lombok.extern.slf4j.Slf4j;

import com.lstguardleft.discipline_backend.common.repository.CodeDetailRepository;

@Slf4j
@Validated
@Service
public class CodeService {

    @Autowired
    private CodeDetailRepository codeDetailRepository;

    public String getValueByCode(@NotNull String code) throws Exception {
        return "";
    }
    
}
