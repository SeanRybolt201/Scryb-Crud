package com.scryb.scrybcrud.controller;

import com.scryb.scrybcrud.service.crudService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class crudController {

    private final crudService crudService;

    public crudController(crudService crudService) {
        this.crudService = crudService;
    }
    
}
