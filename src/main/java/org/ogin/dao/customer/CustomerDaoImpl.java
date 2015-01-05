package org.ogin.dao.customer;

import org.ogin.model.Customer;
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
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addCustomer(Customer customer) {
        String SQL = "INSERT INTO CUSTOMER(id, name, status, web_site) values(?,?,?,?)";

        Object params[] = new Object[]{
                queryForId(),
                customer.getName(),
                customer.getStatus(),
                customer.getWebSite()
        };
        int[] type = new int[]{
                Types.NUMERIC,
                Types.VARCHAR,
                Types.VARCHAR,
                Types.VARCHAR
        };

        jdbcTemplate.update(SQL, params, type);
    }

    @Override
    public List<Customer> getAllCustomer() {
        String SQL = "SELECT * FROM CUSTOMER";
        return jdbcTemplate.query(SQL, new CustomerRowMapper());
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private BigDecimal queryForId() {
        String SQL = "SELECT customer_sequence.nextval from dual";
        return (BigDecimal) jdbcTemplate.query(SQL, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getBigDecimal(1);
            }
        }).get(0);
    }
}
