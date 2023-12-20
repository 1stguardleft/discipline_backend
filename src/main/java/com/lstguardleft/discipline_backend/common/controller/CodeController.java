package com.lstguardleft.discipline_backend.common.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lstguardleft.discipline_backend.common.service.CodeService;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Slf4j
@RestController
@RequestMapping(value="/api/v1/code")
public class CodeController {

    @Autowired
    private CodeService codeService;

    @RequestMapping(value="/{code}", method=RequestMethod.GET)
    public String getCodeInfo(@PathVariable("code") String code ) {
        return "string";
    }
}
