package com.scryb.scrybcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scryb.scrybcrud.service.crudService;



@RestController
@RequestMapping("/api/crud")
public class crudController {

    private final crudService crudService;

    public crudController(crudService crudService) {
        this.crudService = crudService;
    }

    @PostMapping("create")
    public String createCrudObject(@RequestBody String entity) {
        //TODO: process POST request
        boolean success = crudService.createEntity(entity);
        return entity;
    }

    @PostMapping("update")
    public String updateCrudObject(@RequestBody String entity) {
        //TODO: process POST request
        boolean success = crudService.updateEntity(entity);
        return entity;
    }

    @PostMapping("delete")
    public String DeleteCrudObject(@RequestBody String entity) {
        //TODO: process POST request
        boolean success = crudService.deleteEntity(entity);
        return entity;
    }
    
    @GetMapping("read")
    public String readCrudObject(@RequestParam String param) {
        return crudService.readEntity(param);
    }
    
    
    
    
}
