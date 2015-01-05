package org.ogin.dao.customers2;

import org.ogin.model.Customers2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class Customers2DaoImpl implements Customers2Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Customers2 customers2) {
        BigDecimal id = (BigDecimal) queryForId().get(0);

        String SQL = "INSERT INTO CUSTOMERS2(CUST_ID, CUST_FIRST_NAME, CUST_LAST_NAME, " +
                "CUST_GENDER, CUST_YEAR_OF_BIRTH, " +
                "CUST_MARITAL_STATUS, CUST_STREET_ADDRESS, CUST_POSTAL_CODE, CUST_CITY, CUST_CITY_ID) values (?,?,?,?,?,?,?,?,?,?)";
        Object params[] = new Object[]{
                id,
                customers2.getFirstName(),
                customers2.getLastName(),
                customers2.getGender().charAt(0),
                customers2.getYearsOfBirth(),
                customers2.getMaritalStatus(),
                customers2.getStreetAddress(),
                customers2.getPostalCode(),
                customers2.getCity(),
                customers2.getCityId()
        };
        int[] types = new int[]{
                Types.NUMERIC,
                Types.VARCHAR,
                Types.VARCHAR,
                Types.VARCHAR,
                Types.NUMERIC,
                Types.VARCHAR,
                Types.VARCHAR,  // street address
                Types.VARCHAR, // postal code
                Types.VARCHAR, // city
                Types.NUMERIC
        };

        jdbcTemplate.update(SQL, params, types);

    }

    @Override
    public List<Customers2> getAllCustomers2() {
        return null;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Object> queryForId() {
        String SQL = "SELECT okta_sequence.nextval from dual";

        return  jdbcTemplate.query(SQL, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                BigDecimal result = rs.getBigDecimal(1);
                return result;
            }
        });
    }
}
