package com.scryb.scrybcrud.dao.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scryb.scrybcrud.domain.crudObject;

public class crudObjectRowMapper implements RowMapper<crudObject> {
    @Override
    public crudObject mapRow(ResultSet rs, int rowNum) throws SQLException {
        crudObject entity = new crudObject();
        entity.setId(rs.getString("id"));
        entity.setName(rs.getString("name"));
        entity.setDescription(rs.getString("description"));
        entity.setUpdateTimestamp(rs.getTimestamp("update_timestamp").toLocalDateTime());
        return entity;
    }
    
}
