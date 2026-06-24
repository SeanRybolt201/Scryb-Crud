package com.scryb.scrybcrud.service;

import org.springframework.stereotype.Service;
import com.scryb.scrybcrud.dao.crudDao;

@Service
public class crudService {

    private final crudDao crudDao;

    public crudService(crudDao crudDao) {
        this.crudDao = crudDao;
    }

}
