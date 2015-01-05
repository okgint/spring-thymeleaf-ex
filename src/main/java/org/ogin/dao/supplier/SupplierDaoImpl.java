package org.ogin.dao.supplier;

import org.ogin.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class SupplierDaoImpl implements SupplierDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Supplier> getAllSupplier() {
        String SQL = "SELECT * From supplier";
        return jdbcTemplate.query(SQL, new SupplierRowMapper() );
    }

    @Override
    public void add(Supplier supplier) {
        String SQL = "INSERT INTO SUPPLIER(id, name, web_site) values (?,?,?)";
        Object[] params = new Object[]{
                queryForId(),
                supplier.getName(),
                supplier.getWebSite()
        };
        int[] types = new int[]{
                Types.NUMERIC,
                Types.VARCHAR,
                Types.VARCHAR
        };
        jdbcTemplate.update(SQL, params, types);
    }

    private BigDecimal queryForId() {
        String SQL = "SELECT okta_sequence.nextval from dual";
        return (BigDecimal) jdbcTemplate.query(SQL, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                BigDecimal result = rs.getBigDecimal(1);
                return result;
            }
        }).get(0);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
