package com.scryb.scrybcrud.service;

import org.springframework.stereotype.Service;

import com.scryb.scrybcrud.dao.crudDao;

@Service
public class crudService {

    private final crudDao crudDao;

    public crudService(crudDao crudDao) {
        this.crudDao = crudDao;
    }

    public boolean createEntity(String entity) {
        return crudDao.createEntity(entity);
    }

    public String readEntity(String param) {
        return crudDao.readEntity(param);
    }

    public boolean updateEntity(String entity) {
        return crudDao.updateEntity(entity);
    }

    public boolean deleteEntity(String entity) {
        return crudDao.deleteEntity(entity);
    }



}
